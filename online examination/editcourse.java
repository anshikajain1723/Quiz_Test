import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;

class editcourse extends JPanel implements ActionListener
{
	JTabbedPane tp;
	newquestion nq;
	updatequestion uq;
	deletequestion dq;
	JButton b1,b2;
   JLabel l1;
 static JLabel l2;
static JLabel l3,l4,l5,l6,l7,l8;
static JTextField t3,t4,t5,t6,t7;
 
	static String s33;
	    ImageIcon img1,img2,img3,img4,img5;
	  Image adminuser;
	  managecourses m;
	 // SearchDemo sd;
	// UpdateDemo ud;
    // ShowDemo shd;
	 // DeleteDemo dd;
	  static Fdemo f1;
	editcourse(Fdemo f)
	{   f1=f;
			 Font f11=new Font("Arial Black",Font.BOLD,18);
	setFont(f11);
		
	img1=new ImageIcon("adminuser.png");
	adminuser=img1.getImage();
	img3=new ImageIcon("new2.png");
	img4=new ImageIcon("update.png");
	img5=new ImageIcon("delete.png");
	//new2=img2.getImage();
		
       //setLayout(new BorderLayout());
       setLayout(null);
	   tp=new JTabbedPane();
	   tp.setBounds(50,80,650,750);
	//   tp.setBorder(null);
	   
	   
	   
       nq=new newquestion();
	   tp.addTab("New",img3,nq);
	   
	   uq=new updatequestion ();
	   tp.addTab("Update",img4,uq);
	   
	    dq=new deletequestion();
	    tp.addTab("delete",img5,dq);
	   
	   // shd=new ShowDemo();
	   // tp.add("show",shd);
	   
	   // dd=new DeleteDemo();
	   // tp.add("Delete",dd);
		add(tp);
		
		
		img2=new ImageIcon("back1.png");
		b1=new JButton(img2);
	b1.setBounds(50,850,100,45); 
	
	add(b1);
	
	 l1=new JLabel("COURSE:");
		 l1.setBounds(300,10,100,80);
		 add(l1);
		  l1.setFont(f11);
		  
		
	//System.out.println(s1);
		 l2=new JLabel();
		 l2.setBounds(410,10,300,80);
		 //this.add(l2);
		 add(l2);
		 l2.setFont(f11);
		  b1.addActionListener(f);
		  
		  
		  
		  
		  
		  
		 l3=new JLabel("COURSE NAME");
	l3.setBounds(750,200,200,35);
	l3.setFont(f11);
	add(l3); 
	
	t3=new JTextField();
	t3.setBounds(735,230,200,35);
	t3.setFont(f11);
	add(t3);
	
	l4=new JLabel("TIME");
	l4.setBounds(780,280,200,35);
	 l4.setFont(f11);
	add(l4);
		  
		  
	t4=new JTextField();
	t4.setBounds(735,310,35,35);
	 t4.setFont(f11);
	add(t4);

l5=new JLabel(":");
	l5.setBounds(780,310,10,35);
	 l5.setFont(f11);
	add(l5);
	
		t5=new JTextField();
	t5.setBounds(795,310,35,35);
	 t5.setFont(f11);
	add(t5);
	
	l6=new JLabel(":");
	l6.setBounds(840,310,10,35);
	 l6.setFont(f11);
	add(l6);
	
		t6=new JTextField();
	t6.setBounds(860,310,35,35);
	 t6.setFont(f11);
	add(t6);
	
	
	
	 Font f12=new Font("Arial Black",Font.BOLD,14);
	setFont(f11);
	l7=new JLabel("EACH MARK");
	l7.setBounds(735,390,150,35);
	 l7.setFont(f12);
	add(l7);
	
			t7=new JTextField();
	t7.setBounds(865,390,35,35);
	 t7.setFont(f11);
	add(t7);
	
	System.out.println(managecourses.x);	
	l8=new JLabel();
	l8.setBounds(735,445,300,35);
	 l8.setFont(f12);
	add(l8);
	
	
	b2=new JButton("UPDATE");
	b2.setBounds(770,500,150,45);
	 b2.setFont(f11);
	 b2.setBackground(Color.black);
	
	b2.setForeground(Color.white);
	add(b2);
		  	
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  b2.addActionListener(this);
		  
		  
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	g.drawImage(adminuser,0,0,this);
	
}

public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b2)
	{
		String s1=t3.getText();
	    String s2=t4.getText();
	    String s3=t5.getText();
	    String s4=t6.getText(); 
	    String s5=t7.getText(); 
	   // String s6=t7.getText(); 
	     
		if(s1.length()>0&&s2.length()>0&&s3.length()>0&&s4.length()>0&&s5.length()>0)
{
		  try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();


          
    int x=st.executeUpdate("Update subject set subject_name='"+s1+"',ques_time_hr='"+s2+"',ques_time_min='"+s3+"',ques_time_sec='"+s4+"', each_ques_mark='"+s5+"'  where subject_name='"+s33+"' ");
		 
			    JOptionPane.showMessageDialog(null," data Update");
			   
			   
			   
			   
			   
			    ResultSet rs=	st.executeQuery("select subject_name from subject ");
	      managecourses.cb1.removeAllItems();
	while(rs.next())
	{          
		 //System.out.println("sita");

      String ss=rs.getString("subject_name");
		  managecourses.cb1.addItem(ss);
         
      
	}
	
	
	               l2.setText(s1);
	               s33=s1;
		 	con.close();
    //t1.setText("");
	//t2.setText("");
	// t3.setText("");
	// t4.setText("");
	// t5.setText("");
	// t6.setText("");
	// t7.setText("");

		

	   }
	   
	     catch(Exception e1)
	   {
		   System.out.println(e1);
       }
}
	    else{
			   JOptionPane.showMessageDialog(null," Invaild expression plz fill all data");
		  }
	   }  
	}
}






class newquestion extends JPanel implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t3,t4,t5,t6,t7;
	JButton b1,b2;
	ImageIcon img1;
	  Image adminuser;
	  JTextArea t2;
	 static String s;
	 newquestion()
	 {
		 setLayout(null);
	// System.out.println(s);
		 
		 Font f2=new Font("Arial Black",Font.BOLD,14);
	setFont(f2);
		 
		 img1=new ImageIcon("adminuser.png");
	adminuser=img1.getImage();
	
		 l1=new JLabel("Question No:");
		 l1.setBounds(20,20,130,50);
		 l1.setFont(f2);
		 add(l1);
		 
		 
		 t1=new JTextField();
		 t1.setBounds(150,30,60,30);
		 t1.setFont(f2);
		 add(t1); 
		 
		 l2=new JLabel("Question:");
		 l2.setBounds(20,115,110,50);
		 l2.setFont(f2);
		 add(l2);
		 
		 
		 t2=new JTextArea();
		 t2.setBounds(150,100,420,110);
		 t2.setFont(f2);
		 t2.setLineWrap(true);
	t2.setWrapStyleWord(true);
		 add(t2);

		 l3=new JLabel("Option 1:");
		 l3.setBounds(20,235,110,50);
		  l3.setFont(f2);
		 add(l3);
		 
		 
		 t3=new JTextField();
		 t3.setBounds(150,240,300,40);
		 t3.setFont(f2);
		 add(t3); 
		 
		 l4=new JLabel("option 2:");
		 l4.setBounds(20,310,110,50);
		 l4.setFont(f2);
		 add(l4);
		 
		 
		 t4=new JTextField();
		 t4.setBounds(150,310,300,40);
		 t4.setFont(f2);
		  add(t4);

		 l5=new JLabel("Option 3:");
		 l5.setBounds(20,390,130,30);
		 l5.setFont(f2);
		 add(l5);
		 
		 
		 t5=new JTextField();
		 t5.setBounds(150,390,300,40);
		 t5.setFont(f2);
		 add(t5);
		 
		 
		 
		  l6=new JLabel("Option 4:");
		 l6.setBounds(20,470,130,30);
		 l6.setFont(f2);
		 add(l6);
		 
		  t6=new JTextField();
		 t6.setBounds(150,470,300,40);
		 t6.setFont(f2);
		 add(t6);
		 
		 
		   l7=new JLabel(" Correct Option:");
		 l7.setBounds(13,550,150,30);
		 l7.setFont(f2);
		 add(l7);
		 
		   t7=new JTextField();
		 t7.setBounds(155,550,300,40);
		 t7.setFont(f2);
		 add(t7);
		 
		 b1=new JButton("SAVES");
		 b1.setBounds(250,615,150,45);
		 b1.setBackground(Color.black);
	b1.setFont(f2);
	b1.setForeground(Color.white);
		 add(b1);
   
   b1.addActionListener(this);
	 }
	 
	 public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	g.drawImage(adminuser,0,0,this);
	
}

   public void actionPerformed(ActionEvent e)
   {    System.out.println("sita");
          s=editcourse.s33;
		  String user_answer="null";
		  if(e.getSource()==b1)
		  {
	   String s1=t1.getText();
	   String s2=t2.getText();
	   String s3=t3.getText();
	   String s4=t4.getText();
	   String s5=t5.getText();
	   String s6=t6.getText();
	   String s7=t7.getText();
	     
		 if(s1.length()>0&&s2.length()>0&&s3.length()>0&&s4.length()>0&&s5.length()>0&&s6.length()>0&&s7.length()>0)
		 {			 
	   try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
	st.executeUpdate("insert into question_insert values('"+s+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+user_answer+"')");
	JOptionPane.showMessageDialog(null,"data insert");
	// managecourses mc=new managecourses(editcourse.f1);
	// mc.actionPerformed(e);
	//updatequestion u=new updatequestion();
	
	//--------------
	   managecourses.x=0;
	   updatequestion.t1.removeAllItems();
	   deletequestion.t1.removeAllItems();
	  ResultSet rs=st.executeQuery("select  Question_No from question_insert where course_name='"+s+"' ");
	while(rs.next())
	{        
      managecourses.x++;
	  String s11=rs.getString("Question_No");
	 
	 updatequestion.t1.addItem(s11);
	deletequestion.t1.addItem(s11);
      editcourse.l8.setText("TOTAL QUESTION :"+managecourses.x);
	}
	

	//------------------
	
	con.close();
	
	t1.setText("");
	t2.setText("");
	t3.setText("");
	t4.setText("");
	t5.setText("");
	t6.setText("");
	t7.setText("");
	s1="";
	s2="";
	s3="";
	s4="";
	s5="";
	s6="";
	s7="";
	
	
	
	 }
	   catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
		 }
		 else
		 {
			 JOptionPane.showMessageDialog(null,"please insert data");
		 }			 
	}  
   } 
   }
		
 
	



class updatequestion extends JPanel implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7;
static JTextField t3,t4,t5,t6,t7;
	 static JComboBox t1;
	static JButton b1;
	ImageIcon img1;
	  Image adminuser;
	   static JTextArea t2;
	 static String s1;
	 updatequestion()
	 {
		 //s1=managecourses.sub_name; 
		 setLayout(null);
		 
		 Font f2=new Font("Arial Black",Font.BOLD,14);
	setFont(f2);
		 
		 img1=new ImageIcon("adminuser.png");
	adminuser=img1.getImage();
	
		 l1=new JLabel("Question No:");
		 l1.setBounds(20,20,130,50);
		 l1.setFont(f2);
		 add(l1);
		 
		// System.out.println(s1);
		 t1=new JComboBox();
		 
			// try
			// {
			  // Class.forName("com.mysql.cj.jdbc.Driver");
			
			// String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			// String db_uname="root";
			// String db_upass="simi";
			
			// Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			// Statement st=con.createStatement();
   // ResultSet rs=st.executeQuery("select Question_No from question_insert where course_name='"+s1+"'");
	// while(rs.next())
	// {        
      
	  // String s11=rs.getString("Question_No");
	  // System.out.println(s11);
	  // t1.addItem(s11);
      
	// }
		
	
	          // con.close();
			
			
		// }
		 // catch(Exception e1)
	   // {
		   // System.out.println(e1);
	   // }
		
					
		 
		 
		 
		 

		 t1.setBounds(150,30,60,30);
		 t1.setFont(f2);
		 add(t1); 
		 
		 l2=new JLabel("Question:");
		 l2.setBounds(20,115,110,50);
		 l2.setFont(f2);
		 add(l2);
		 
		 
		 t2=new JTextArea();
		 t2.setBounds(150,100,420,110);
		 t2.setFont(f2);
		 t2.setLineWrap(true);
	t2.setWrapStyleWord(true);
		 add(t2);

		 l3=new JLabel("Option 1:");
		 l3.setBounds(20,235,110,50);
		  l3.setFont(f2);
		 add(l3);
		 
		 
		 t3=new JTextField();
		 t3.setBounds(150,240,300,40);
		 t3.setFont(f2);
		 add(t3); 
		 
		 l4=new JLabel("option 2:");
		 l4.setBounds(20,310,110,50);
		 l4.setFont(f2);
		 add(l4);
		 
		 
		 t4=new JTextField();
		 t4.setBounds(150,310,300,40);
		 t4.setFont(f2);
		  add(t4);

		 l5=new JLabel("Option 3:");
		 l5.setBounds(20,390,130,30);
		 l5.setFont(f2);
		 add(l5);
		 
		 
		 t5=new JTextField();
		 t5.setBounds(150,390,300,40);
		 t5.setFont(f2);
		 add(t5);
		 
		 
		 
		  l6=new JLabel("Option 4:");
		 l6.setBounds(20,470,130,30);
		 l6.setFont(f2);
		 add(l6);
		 
		  t6=new JTextField();
		 t6.setBounds(150,470,300,40);
		 t6.setFont(f2);
		 add(t6);
		 
		 
		   l7=new JLabel(" Correct Option:");
		 l7.setBounds(13,550,150,30);
		 l7.setFont(f2);
		 add(l7);
		 
		   t7=new JTextField();
		 t7.setBounds(155,550,300,40);
		 t7.setFont(f2);
		 add(t7);
		 
		 b1=new JButton("UPDATE");
		 b1.setBounds(250,615,120,45);
		 	 b1.setBackground(Color.black);
	b1.setFont(f2);
	b1.setForeground(Color.white);
		 add(b1);
   
    // b3=new JButton("aaaaaa");
		 // b3.setBounds(100,5,100,50);
		 // add(b3);
   
   b1.addActionListener(this);
   t1.addActionListener(this);
  
	 }
	 
	
	

	
  
   public void actionPerformed(ActionEvent e)
   {  s1=editcourse.s33;
	   String s111=(String)t1.getSelectedItem();
	    String s2;
	   String s3;
	   String s4;
	   String s5;
	   String s6;
	   String s7;
	   
	   if(e.getSource()==t1)
	   {
	    s2=t2.getText();
	    s3=t3.getText();
	    s4=t4.getText();//////////////// JTextField t3,t4,t5,t6,t7;
	    s5=t5.getText();////////////////JTextArea t2;
	    s6=t6.getText();
	    s7=t7.getText();
	
				 
	   try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("Select * from question_insert where course_name='"+s1+"' AND Question_No='"+s111+"' ");
			
			if(rs.next())
			{
			  	//t2.setText(rs.getString(2));
	            t2.setText(rs.getString(3));
	            t3.setText(rs.getString(4));
	            t4.setText(rs.getString(5));
	            t5.setText(rs.getString(6));
	            t6.setText(rs.getString(7));
	            t7.setText(rs.getString(8));
			}
	   
			
			con.close();
	   }
	   
	    catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
	   
	   }
	   	   
	   ////===========================================
   
	   
	   if(e.getSource()==b1)
	   {
	    s2=t2.getText();
	    s3=t3.getText();
	    s4=t4.getText();
	    s5=t5.getText(); 
	    s6=t6.getText(); 
	    s7=t7.getText(); 
	     
		if(s2.length()>0&&s3.length()>0&&s4.length()>0&&s5.length()>0&&s6.length()>0&&s7.length()>0)
{
		  try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();


          
    int x=st.executeUpdate("Update question_insert set Question='"+s2+"',Option_1='"+s3+"',Option_2='"+s4+"',Option_3='"+s5+"',Option_4='"+s6+"', Correct_Option='"+s7+"'  where course_name='"+s1+"' AND Question_No='"+s111+"' ");
		 
			    JOptionPane.showMessageDialog(null," data Update");
			   
	
		 	con.close();
    //t1.setText("");
	t2.setText("");
	t3.setText("");
	t4.setText("");
	t5.setText("");
	t6.setText("");
	t7.setText("");

		

	   }
	   
	     catch(Exception e1)
	   {
		   System.out.println(e1);
       }
}
	    else{
			   JOptionPane.showMessageDialog(null," Invaild expression plz fill all data");
		  }
	   }  
	   
	   
// }
 // }
   // }
  
}
}

class  deletequestion extends JPanel implements ActionListener
{
			JLabel l1,l2,l3,l4,l5,l6,l7;
static JTextField t3,t4,t5,t6,t7;
	 static JComboBox t1;
	 static JButton b1;
	ImageIcon img1;
	  Image adminuser;
	   static JTextArea t2;
	 static String s222;
	deletequestion()
	{
		 setLayout(null);
		 
		 Font f2=new Font("Arial Black",Font.BOLD,14);
	setFont(f2);
		 
		 img1=new ImageIcon("adminuser.png");
	adminuser=img1.getImage();
	
		 l1=new JLabel("Question No:");
		 l1.setBounds(20,20,130,50);
		 l1.setFont(f2);
		 add(l1);
		 
		 
		 t1=new JComboBox();
		 t1.setBounds(150,30,60,30);
		 t1.setFont(f2);
		 add(t1); 
		 
		 l2=new JLabel("Question:");
		 l2.setBounds(20,115,110,50);
		 l2.setFont(f2);
		 add(l2);
		 
		 
		 t2=new JTextArea();
		 t2.setBounds(150,100,420,110);
		 t2.setFont(f2);
		 	 t2.setLineWrap(true);
	t2.setWrapStyleWord(true);
		 add(t2);

		 l3=new JLabel("Option 1:");
		 l3.setBounds(20,235,110,50);
		  l3.setFont(f2);
		 add(l3);
		 
		 
		 t3=new JTextField();
		 t3.setBounds(150,240,300,40);
		 t3.setFont(f2);
		 add(t3); 
		 
		 l4=new JLabel("option 2:");
		 l4.setBounds(20,310,110,50);
		 l4.setFont(f2);
		 add(l4);
		 
		 
		 t4=new JTextField();
		 t4.setBounds(150,310,300,40);
		 t4.setFont(f2);
		  add(t4);

		 l5=new JLabel("Option 3:");
		 l5.setBounds(20,390,130,30);
		 l5.setFont(f2);
		 add(l5);
		 
		 
		 t5=new JTextField();
		 t5.setBounds(150,390,300,40);
		 t5.setFont(f2);
		 add(t5);
		 
		 
		 
		  l6=new JLabel("Option 4:");
		 l6.setBounds(20,470,130,30);
		 l6.setFont(f2);
		 add(l6);
		 
		  t6=new JTextField();
		 t6.setBounds(150,470,300,40);
		 t6.setFont(f2);
		 add(t6);
		 
		 
		   l7=new JLabel(" Correct Option:");
		 l7.setBounds(13,550,150,30);
		 l7.setFont(f2);
		 add(l7);
		 
		   t7=new JTextField();
		 t7.setBounds(155,550,300,40);
		 t7.setFont(f2);
		 add(t7);
		 
		 b1=new JButton("DETETE");
		 b1.setBounds(250,615,120,45);
		 	 b1.setBackground(Color.black);
	b1.setFont(f2);
	b1.setForeground(Color.white);
		 add(b1);
   
   b1.addActionListener(this);
   t1.addActionListener(this);
	 }
	 
	 
	    public void actionPerformed(ActionEvent e)
   {   s222=editcourse.s33;
	   String s111=(String)t1.getSelectedItem();
	    String s2;
	   String s3;
	   String s4;
	   String s5;
	   String s6;
	   String s7;
	   
	   if(e.getSource()==t1)
	   {
	    s2=t2.getText();
	    s3=t3.getText();
	    s4=t4.getText();
	    s5=t5.getText();
	    s6=t6.getText();
	    s7=t7.getText();
	
				 
	   try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("Select * from question_insert where course_name='"+s222+"' AND Question_No='"+s111+"' ");
			
			if(rs.next())
			{
			  //t2.setText(rs.getString(2));
	            t2.setText(rs.getString(3));
	            t3.setText(rs.getString(4));
	            t4.setText(rs.getString(5));
	            t5.setText(rs.getString(6));
	            t6.setText(rs.getString(7));
	            t7.setText(rs.getString(8));
			}
	   
			// else
			// {
				 // JOptionPane.showMessageDialog(null," data not found");
			// }
			
			con.close();
	   }
	   
	    catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
	   
	   }
	   	   
	   ////===========================================
   
	   
	   if(e.getSource()==b1)
	   {
	    s2=t2.getText();
	    s3=t3.getText();
	    s4=t4.getText();
	    s5=t5.getText(); 
	    s6=t6.getText(); 
	    s7=t7.getText(); 
		if(s2.length()>0&&s3.length()>0&&s4.length()>0&&s5.length()>0&&s6.length()>0&&s7.length()>0)
{
		  try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();


          
    // int x=st.executeUpdate("Update question_insert set Question='"+s2+"',Option_1='"+s3+"',Option_2='"+s4+"',Option_3='"+s5+"',Option_4='"+s6+"', Correct_Option='"+s7+"'  where course_name='"+s1+"' AND Question_No='"+s111+"' ");
	st.executeUpdate("delete  from  question_insert where course_name='"+s222+"' AND Question_No='"+s111+"' ");
			    JOptionPane.showMessageDialog(null," data delete");
		              //managecourses.x=0;
				//newquestion.actionPerformed(e);
				// newquestion n=new newquestion();
			   
	
		 	con.close();
    //t1.setText("");
	t2.setText("");
	t3.setText("");
	t4.setText("");
	t5.setText("");
	t6.setText("");
	t7.setText("");
	
	
	
		updatequestion.t2.setText(" ");
	         	updatequestion.t3.setText(" ");
	        	updatequestion.t4.setText(" ");
	        	updatequestion.t5.setText(" ");
	        	updatequestion.t6.setText(" ");
	        	updatequestion.t7.setText(" ");

		

	   }
	   
	     catch(Exception e1)
	   {
		   System.out.println(e1);
       }
}
	    else{
			   JOptionPane.showMessageDialog(null," Invaild expression plz fill all data");
		  }
	   }








if(e.getSource()==b1)
{
	// newquestion n=new newquestion();
	// updatequestion.t1.removeAllItems();
    // t1.removeAllItems();
	 // n.actionPerformed(e);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 	   try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
	
	
	//--------------
	   managecourses.x=0;
	   updatequestion.t1.removeAllItems();
	   t1.removeAllItems();
	  ResultSet rs=st.executeQuery("select  Question_No from question_insert where course_name='"+s222+"' ");
	while(rs.next())
	{   managecourses.x++;     
      
	  String s11=rs.getString("Question_No");
	 
	 updatequestion.t1.addItem(s11);
	t1.addItem(s11);
      
	}
	editcourse.l8.setText("TOTAL QUESTION :"+managecourses.x);

	//------------------
	
	con.close();
	
	// t1.setText(" ");
	// t2.setText(" ");
	// t3.setText(" ");
	// t4.setText(" ");
	// t5.setText(" ");
	// t6.setText(" ");
	// t7.setText(" ");
	 }
	   catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
	 
	 
	 
	 
	 
	 
	 
	 
}	
	   
	   
// }
 // }
   // }
  
}
	 
	
}	

