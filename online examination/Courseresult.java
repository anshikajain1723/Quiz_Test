import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


class Courseresult extends JPanel implements ActionListener
{ // static int x;
  // static String sub_name;
	JButton b1,b2,b3,b4;
	static JComboBox cb1;
	JLabel l1,l2;
	 ImageIcon img1,img2,img8;
	  Image back1,adminpb,manb;
	
	 Fdemo f1;
	Courseresult(Fdemo f)
	 {
		 f1=f;

		setLayout(null);
	Font f2=new Font("Arial Black",Font.BOLD,40);
	setFont(f2);
	Font f21=new Font("Arial Black",Font.BOLD,28);
	setFont(f21);
	Font f22=new Font("Arial Black",Font.BOLD,16);
	setFont(f22);
	
	
		img8=new ImageIcon("adminpb.jpg");
	adminpb=img8.getImage();
	
	
	img2=new ImageIcon("manb.png");
	manb=img2.getImage();
	
	
	l1=new JLabel("COURSES");
	l1.setBounds(390,20,300,50);
		l1.setForeground(Color.black);
	l1.setFont(f2);
	add(l1);
	
	
	
		l2=new JLabel("Available Courses:-");
	l2.setBounds(115,400,350,50);
		l2.setForeground(Color.black);
	l2.setFont(f21);
	add(l2);
	
		
		  cb1=new JComboBox();
	      //cb1.addItem();
          cb1.setBounds(475,400,300,50);
	cb1.setFont(f22);
	    add(cb1);
	
	img1=new ImageIcon("back1.png");
	b1=new JButton(img1);
	b1.setBounds(10,10,100,45); 
	add(b1);
	
	b2=new JButton("search");
	b2.setBounds(390,520,200,50);
		b2.setBackground(Color.black);
	b2.setFont(f22);
	b2.setForeground(Color.white);
	add(b2);
	
	b1.addActionListener(f);
	b2.addActionListener(this);
	
	cb1.addActionListener(this);
	
	
	

	 }
	 
	 public void paintComponent(Graphics g)
	 	{
		super.paintComponent(g);
	g.drawImage(adminpb,0,0,this);
	g.drawImage(manb,180,70,this);
	
	
}

	 
	 
	 public void actionPerformed(ActionEvent e)
    {
	   
	 if(e.getSource()==b2)
	 {
		 f1.card.show(f1.c,"course_result");
		  course_result.t1.setText("");
		  String s1=(String)cb1.getSelectedItem();
	  
	   
				 
	   try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
  ResultSet rs=	st.executeQuery("select * from result where cource_name='"+s1+"' ");
		 
       
	while(rs.next())
	{        
        
	course_result.t1.setText(course_result.t1.getText()+"\n"+" "+rs.getString(10)+"          "+rs.getString(2)+ "            "+rs.getString(3)+"               "+rs.getString(4)+"                     "+rs.getString(5)+  "                   "+rs.getString(6)+"                       "+rs.getString(7)+"                         "+rs.getString(8)+"                   "+rs.getString(9));


	}   
		   
		    course_result.l.setText(s1);
	          
			
			con.close();
	   }
	   
	    catch(Exception e1)
	   {
		   System.out.println(e1);
	   }

	 }
	 
	}
}