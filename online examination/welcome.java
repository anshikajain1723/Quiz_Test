import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class welcome extends JPanel implements ActionListener
{
	    static String user_name,sp;
		static JLabel l1;
	    JButton b1,b2,b3,b4;
        ImageIcon img1,img2,img3,img4,img8;
	    Image logout,result,manage,exam,adminpb;

		Fdemo f1;
	 	
	 welcome(Fdemo f)
	 {
		 f1=f;
		 
		setLayout(null);
	Font f2=new Font("Arial Black",Font.BOLD,35);
	setFont(f2);
	
	Font f22=new Font("Arial Black",Font.BOLD,18);
	setFont(f22);


//System.out.println(user_name);
	
	l1=new JLabel();
	l1.setBounds(280,30,400,50);
	l1.setForeground(Color.black);
    l1.setFont(f2);
	add(l1);
	
			img8=new ImageIcon("adminpb.jpg");
	adminpb=img8.getImage();
		
	img1=new ImageIcon("manage1.png");
	manage=img1.getImage();
	
	
	b1=new JButton("EditDetails");
	b1.setBounds(450,190,200,50);
		b1.setBackground(Color.black);
	b1.setFont(f22);
	b1.setForeground(Color.white);
	add(b1);
	
	
	img2=new ImageIcon("exam.png");
	exam=img2.getImage();
	
	b2=new JButton("Exam");
	b2.setBounds(450,360,200,50);
	b2.setBackground(Color.black);
	b2.setFont(f22);
	b2.setForeground(Color.white);
	
	add(b2);
	
	
	img3=new ImageIcon("result.png");
	result=img3.getImage();
	
	b3=new JButton("Result");
	b3.setBounds(450,520,200,50);
	b3.setBackground(Color.black);
	b3.setFont(f22);
	b3.setForeground(Color.white);
	add(b3);
	
	
	img4=new ImageIcon("logout.png");
	logout=img4.getImage();
	
	b4=new JButton("Logout");
	b4.setBounds(450,715,200,50);
	b4.setBackground(Color.black);
	b4.setFont(f22);
	b4.setForeground(Color.white);
	add(b4);
	
	
	 b1.addActionListener(this);                 //f1.card.show(f1.c,"Details");
	 b2.addActionListener(this);
	b3.addActionListener(this);
	 b4.addActionListener(f);
	
	 }
	 
	 public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(adminpb,0,0,this);
	g.drawImage(manage,200,150,this);
	g.drawImage(exam,190,300,this);
	g.drawImage(result,200,480,this);
	g.drawImage(logout,180,680,this);
	
}
	
	public void actionPerformed(ActionEvent e)
{
	
	   if(e.getSource()==b1)
	   {		   
	   f1.card.show(f1.c,"UserEditDetails");

				 
	   try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
ResultSet rs=st.executeQuery("Select * from user_regislog  where UserName='"+user_name+"' AND Password='"+sp+"' ");
			
			if(rs.next())
			{

	           UserEditDetails. l2.setText("Registation No.    :-  "+rs.getString(1));
	           UserEditDetails. l3.setText("Registation Date   :-  "+rs.getString(2));
	           UserEditDetails. l4.setText("Registation Time  :-  "+rs.getString(3));
	           UserEditDetails. t5.setText(rs.getString(4));
	           UserEditDetails. t6.setText(rs.getString(5));
	           UserEditDetails. t7.setText(rs.getString(6));
	          UserEditDetails.  t8.setText(rs.getString(7));
	          UserEditDetails.  t9.setText(rs.getString(8));
				UserEditDetails.l10.setText("D.O.B                   :-  "+rs.getString(9));
				UserEditDetails.l11.setText("Gender                 :-  "+rs.getString(10));
	           
			}
	   
			
			con.close();
	   }
	   
	    catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
	   }
         
		 if(e.getSource()==b2)
		 {
			 f1.card.show(f1.c,"Exam");
			    try
			{
		    Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
  ResultSet rs=	st.executeQuery("select subject_name from subject ");
		Exam.cb1.removeAllItems();
           Exam.cb1.addItem("-:Options:-");
	while(rs.next())
	{          
		

    String s=rs.getString("subject_name");
		  Exam.cb1.addItem(s);
		  
      
	}
		   
	          con.close();
		}
		 catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
		
		 } 
		 
		 
		 
		 
		 
	   if(e.getSource()==b3)
	   {	//int x=0;	   
	   f1.card.show(f1.c,"User_course_result");
	                 
	       try
			{
		    Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
  ResultSet rs=	st.executeQuery("select * from result where user_name='"+user_name+"' ");
		 
       
	while(rs.next())
	{        
        
	    
	User_course_result.t1.setText(course_result.t1.getText()+"\n\n"+"     "+rs.getString(1)+"              "+rs.getString(2)+ "                "+rs.getString(3)+"               "+rs.getString(4)+"                     "+rs.getString(5)+  "                     "+rs.getString(6)+"                   "+rs.getString(7)+"                "+rs.getString(8)+"               "+rs.getString(9)+"%");


	}   
		   
		    User_course_result.l.setText(user_name);
	          con.close();
			  
			  
			  
			  
		}
		 catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
	   

	   
	   }

		 }	 
	
}