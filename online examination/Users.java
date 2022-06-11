import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


class Users extends JPanel implements ActionListener
{ // static int x;
  // static String sub_name;
	JButton b1,b2,b3,b4;
	static JComboBox cb1;
	JLabel l1,l2;
	 ImageIcon img1,img2,img8;
	  Image back1,adminpb,useri;
	
	 Fdemo f1;
	Users(Fdemo f)
	 {
		 f1=f;

		setLayout(null);
	Font f2=new Font("Arial Black",Font.BOLD,40);
	setFont(f2);
	Font f21=new Font("Arial Black",Font.BOLD,28);
	setFont(f21);
	Font f22=new Font("Arial Black",Font.BOLD,16);
	setFont(f22);
	
	l1=new JLabel("Users");
	l1.setBounds(400,20,300,50);
	l1.setFont(f2);
	l1.setForeground(Color.black);
	add(l1);
	
	
	img8=new ImageIcon("adminpb.jpg");
	adminpb=img8.getImage();
	
	
	img2=new ImageIcon("useri.png");
	useri=img2.getImage();
	
		l2=new JLabel("Available Users:-");
	l2.setBounds(130,430,300,50);
		l2.setForeground(Color.black);
	l2.setFont(f21);
	add(l2);
	
		
		  cb1=new JComboBox();
	      //cb1.addItem();
          cb1.setBounds(450,430,300,50);
	cb1.setFont(f22);
	    add(cb1);
	
	img1=new ImageIcon("back1.png");
	b1=new JButton(img1);
	b1.setBounds(10,10,100,45); 
	add(b1);
	
	b2=new JButton("details");
	b2.setBounds(370,530,200,50);
	b2.setBackground(Color.black);
	b2.setFont(f22);
	b2.setForeground(Color.white);
	add(b2);
	
		b3=new JButton("result");
	b3.setBounds(370,610,200,50);
	b3.setBackground(Color.black);
	b3.setFont(f22);
	b3.setForeground(Color.white);
	add(b3);
	
	b1.addActionListener(f);
	b2.addActionListener(this);
	b3.addActionListener(this);
	
	cb1.addActionListener(this);
	
	
	

	 }
	 
	 	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	g.drawImage(adminpb,0,0,this);
	g.drawImage(useri,220,40,this);
	
	
}

	 
	 
	 
	 public void actionPerformed(ActionEvent e)
    {
	   
if(e.getSource()==b2)
{
		f1.card.show(f1.c,"Details");
	    
			 
	  String s1=(String)cb1.getSelectedItem();
	   String s11="Verified";
	   
				 
	   try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
ResultSet rs=st.executeQuery("Select * from user_regislog where  UserName='"+s1+"'");
			
			if(rs.next())
			{

	           Details. l2.setText("Registation No.  :- "+rs.getString(1));
	           Details. l3.setText("Registation Date :-  "+rs.getString(2));
	           Details. l4.setText("Registation Time :-  "+rs.getString(3));
	           Details. l5.setText("UserName           :-  "+rs.getString(4));
	           Details. l6.setText("Password            :-  "+rs.getString(5));
	           Details. l7.setText("Email                  :-  "+rs.getString(6));
	           Details. l8.setText("Contact No.         :-  "+rs.getString(7));
	           Details. l9.setText("Address               :-  "+rs.getString(8));
	           Details. l10.setText("D.O.B                   :-  "+rs.getString(9));
	           Details. l11.setText("Gender                 :-  "+rs.getString(10));
			}
	   
			
			con.close();
	   }
	   
	    catch(Exception e1)
	   {
		   System.out.println(e1);
	   }


	 
	 }
	 
	 
	 if(e.getSource()==b3)
	 {
		 f1.card.show(f1.c,"users_result");
		    users_result.t1.setText("");
		  String s1=(String)cb1.getSelectedItem();

				 
	   try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
  ResultSet rs=	st.executeQuery("select * from result where user_name='"+s1+"' ");
		 
       
		while(rs.next())
	{        
        
	users_result.t1.setText(course_result.t1.getText()+"\n\n"+"     "+rs.getString(1)+"              "+rs.getString(2)+ "                "+rs.getString(3)+"               "+rs.getString(4)+"                     "+rs.getString(5)+  "                     "+rs.getString(6)+"                   "+rs.getString(7)+"                "+rs.getString(8)+"               "+rs.getString(9));


	}  
		   
		    users_result.l.setText(s1);
	          
			
			con.close();
	   }
	   
	    catch(Exception e1)
	   {
		   System.out.println(e1);
	   }

	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}
	
	
}
	
	
	
	