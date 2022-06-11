import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


class managecourses extends JPanel implements ActionListener
{  static int x;
   static String sub_name;
	JButton b1,b2,b3,b4;
	 static JComboBox cb1;
	JLabel l1;
	 ImageIcon img1,img2,img8;
	  Image back1,adminpb,manb;
	
	 Fdemo f1;
	managecourses(Fdemo f)
	 {
		 f1=f;
System.out.println("simiiiiiijainnnn"+sub_name);
		setLayout(null);
	// Font f2=new Font("Arial Black",Font.BOLD,18);
	// setFont(f2);
	Font f21=new Font("Arial Black",Font.BOLD,30);
	setFont(f21);	
	Font f22=new Font("Arial Black",Font.BOLD,18);
	setFont(f22);
	
	
	img8=new ImageIcon("adminpb.jpg");
	adminpb=img8.getImage();
	
	
	img2=new ImageIcon("manb.png");
	manb=img2.getImage();
	
	l1=new JLabel("MANAGE COURSES");
	l1.setBounds(320,20,400,50);
	l1.setForeground(Color.black);
	l1.setFont(f21);
	add(l1);
	
	
	
	//========================================
	
		
			cb1=new JComboBox();
	
			try
			{
		    Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
  ResultSet rs=	st.executeQuery("select subject_name from subject ");
		///cb1.removeAllItems();
	while(rs.next())
	{          
		// System.out.println("sita");

    String s=rs.getString("subject_name");
		   cb1.addItem(s);
           
      
	}
		   
		
	          con.close();
	    
			
		}
		 catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
	

//======================================	 
	cb1.setBounds(260,380,250,50);
	cb1.setFont(f22);
	add(cb1);
		img1=new ImageIcon("back1.png");
		b1=new JButton(img1);
	b1.setBounds(10,10,100,45);
	// b1.setBackground(Color.black);
	// b1.setFont(f21);
	// b1.setForeground(Color.white);	
	add(b1);
	
	b2=new JButton("add new course");
	b2.setBounds(550,380,200,50);
		b2.setBackground(Color.black);
	b2.setFont(f22);
	b2.setForeground(Color.white);
	add(b2);
	
	b3=new JButton("edit course");
	b3.setBounds(420,500,200,50);
		b3.setBackground(Color.black);
	b3.setFont(f22);
	b3.setForeground(Color.white);
	add(b3);
	
	
	b4=new JButton("delete");
	b4.setBounds(420,600,200,50);
		b4.setBackground(Color.black);
	b4.setFont(f22);
	b4.setForeground(Color.white);
	add(b4);
	
	b1.addActionListener(f);
	b2.addActionListener(f);
	b3.addActionListener(this);
	b4.addActionListener(this);
	cb1.addActionListener(this);
	
	

	
	 }
	 
	 
	 		public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	g.drawImage(adminpb,0,0,this);
	g.drawImage(manb,180,70,this);
	
	
}
	 
	 
	  public void actionPerformed(ActionEvent e)
		  {  System.out.println("jiii");
			  if(e.getSource()==cb1)
			  {  x=0;
				  sub_name=(String)cb1.getSelectedItem();
				  //String s1=sub_name;
				  editcourse.l2.setText(sub_name);
				   newquestion.s=sub_name;
				 // updatequestion  u = new updatequestion();
				updatequestion.s1=sub_name;
				deletequestion.s222=sub_name;
				editcourse.s33=sub_name;
			  }
		if(e.getSource()==b3)	
		{	
           String s1=sub_name;		
	 
	    f1.card.show(f1.c,"editcourse");
//updatequestion combo========================			
			try
			{
		    System.out.println("ram");
			  Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("select  Question_No from question_insert where course_name='"+s1+"' ");
	while(rs.next())
	{   x++;     
      
	  String s11=rs.getString("Question_No");
	 deletequestion.t1.addItem(s11);
	 updatequestion.t1.addItem(s11);
      
	}
	  //StringTokenizer stt=new StringTokenizer(updatequestion.t1);
	  // x=stt.countTokens();
	editcourse.l8.setText("TOTAL QUESTION :"+x);
	   System.out.println(x);
	          con.close();
	
		}
		 catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
	   
	   
	////////////////////editcourse============
	
	
				 
	   try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
		ResultSet rs=st.executeQuery("Select * from subject where subject_name='"+s1+"'  ");
			
			if(rs.next())
			{
			  editcourse.t3.setText(rs.getString(1));
	           editcourse. t4.setText(rs.getString(2));
	           
	          editcourse.  t5.setText(rs.getString(3));
	           editcourse. t6.setText(rs.getString(4));
	           
	          editcourse.  t7.setText(rs.getString(5));
	         
			}
	   
		
			con.close();
	   }
	   
	    catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
	   
	   }
				   
				   
///////////////////////////////editcourse end===================
		
// if(e.getSource()==deletequestion.b1)
// {
	//this.actionPerformed(e);
	// managecourses m=new managecourses(f1);
// }



if(e.getSource()==b4)
{
	
       sub_name=(String)cb1.getSelectedItem();	
System.out.println("simiiiiii"+sub_name);
		  try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();


          
    
	st.executeUpdate("delete  from  subject where subject_name='"+sub_name+"' ");
		 
			    JOptionPane.showMessageDialog(null," data delete");
				cb1.removeAllItems();
				
				// managecourses m=new managecourses(f1);
				//newquestion.actionPerformed(e);
				// newquestion n=new newquestion();
				
				
	ResultSet rs=	st.executeQuery("select subject_name from subject ");
		///cb1.removeAllItems();
	while(rs.next())
	{          
		// System.out.println("sita");

    String s=rs.getString("subject_name");
		   cb1.addItem(s);
           
      
	}
			   
	
		 	con.close();
 
		

	   }
	   
	     catch(Exception e1)
	   {
		   System.out.println(e1);
       }

	   


}
	

		 
		  
		
		  }	
	
}