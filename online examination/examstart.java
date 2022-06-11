import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.DecimalFormat;

class examstart extends JPanel implements ActionListener
{

	  
          static JLabel l,l1,lt,l2,l3,l4,l5,l6,l7,l8,l9;
	    JButton b1,b2,b3,b4,b5; 
	  ImageIcon img1,img8;
	   Image adminpb;
	 static JRadioButton rb1,rb2,rb3,rb4;
     static ButtonGroup bg;
	  JLabel t1,t2,t3,t4;
	static  JTextArea t;
	static String s11,time;
  String user_answer;
     static String qq;
	 String sc="null";
	 String to="Time out";
	
	 static int eqm,cor,mo,tm,w;
	static float p,tm1;
	static Timer tt;
	static int hr,min,sec;
	String fmin,fsec,fhr;
	
		  
	 Fdemo f1;
	 examstart (Fdemo f)
	 {
		 f1=f;
		setLayout(null);
	Font f21=new Font("Arial Black",Font.BOLD,30);
	setFont(f21);
	Font f2=new Font("Arial Black",Font.BOLD,20);
	setFont(f2);
	
		Font f22=new Font("Arial Black",Font.BOLD,28);
	setFont(f22);
	
		Font f23=new Font("Arial Black",Font.BOLD,25);
	setFont(f23);



	img8=new ImageIcon("adminpb.jpg");
	adminpb=img8.getImage();


	l=new JLabel();
	l.setSize(500,50);
	l.setLocation(250,20);
	 l.setForeground(Color.black);
    l.setFont(f21);
	add(l);
	
	
    bg=new ButtonGroup();
	
		

		 l1=new JLabel("Remaning Time:");
		 l1.setBounds(150,110,200,50);
		 l1.setFont(f2);
		  l1.setForeground(Color.black);
		 add(l1);
		 
		 	 lt=new JLabel();
		 lt.setBounds(370,110,200,50);
		 lt.setFont(f22);
		  lt.setForeground(Color.black);
		 add(lt);
		 
		// System.out.println(s1);
		 // t1=new JComboBox();
		 
	 // t1.setBounds(320,120,60,30);
		 // t1.setFont(f2);
		 // add(t1); 
		 
		 l2=new JLabel();
		 l2.setBounds(145,225,150,50);
		 l2.setFont(f2);
		  l2.setForeground(Color.black);
		 add(l2);
		 
		 
		 t=new JTextArea();
		 t.setBounds(295,230,600,110);
		 t.setFont(f23);
	 t.setOpaque(false);
	  t.setForeground(Color.black);
//t.setEnabled(false);
t.setEditable(false);
	 t.setLineWrap(true);
	t.setWrapStyleWord(true);
	   t.setBorder(null);
		 add(t);

		 l3=new JLabel("Option 1:");
		 l3.setBounds(150,350,110,50);
		  l3.setFont(f2);
		   l3.setForeground(Color.black);
		 add(l3);
		 
		 
		 rb1=new JRadioButton ();
    rb1.setSize(400,60);
	rb1.setLocation(280,345);
	rb1.setOpaque(false);
	rb1.setCursor(new Cursor(Cursor.HAND_CURSOR));
	//rb1.setBackground(Color.red);
	 rb1.setForeground(Color.black);
			  rb1.setFont(f2);
		 
	bg.add(rb1);
	add(rb1);
		 
		 
		 // t1=new JLabel();
		 // t1.setBounds(290,350,300,40);
		 // t1.setFont(f2);
		 // add(t1); 
		 
		 l4=new JLabel("option 2:");
		 l4.setBounds(150,430,110,50);
		 l4.setFont(f2);
		  l4.setForeground(Color.black);
		 add(l4);
		 
		 
		 	 
		 rb2=new JRadioButton ();
    rb2.setSize(400,60);
	rb2.setLocation(280,425);
	rb2.setCursor(new Cursor(Cursor.HAND_CURSOR));
	 rb2.setFont(f2);
	 rb2.setOpaque(false);
	 rb2.setForeground(Color.black);
	bg.add(rb2);
	add(rb2);
		 
		 
		 // t2=new JLabel();
		 // t2.setBounds(290,430,300,40);
		 // t2.setFont(f2);
		  // add(t2);

		 l5=new JLabel("Option 3:");
		 l5.setBounds(150,510,130,30);
		 l5.setFont(f2);
		  l5.setForeground(Color.black);
		 add(l5);
		 
		 
		 	 
		 rb3=new JRadioButton ();
    rb3.setSize(400,60);
	rb3.setLocation(280,500);
	rb3.setCursor(new Cursor(Cursor.HAND_CURSOR));
			  rb3.setFont(f2);
			  rb3.setOpaque(false);
			   rb3.setForeground(Color.black);
	bg.add(rb3);
	add(rb3);
		 
		 
		 // t3=new JLabel();
		 // t3.setBounds(290,510,300,40);
		 // t3.setFont(f2);
		 // add(t3);
		 
		 
		 
		  l6=new JLabel("Option 4:");
		 l6.setBounds(150,590,130,30);
		 l6.setFont(f2);
		  l6.setForeground(Color.black);
		 add(l6);
		 
		 	 
		 rb4=new JRadioButton ();
    rb4.setSize(400,60);
	rb4.setLocation(280,580);
	//rb4.setBackground(Color.green);
	 rb4.setForeground(Color.black);
	 rb4.setOpaque(false);
	rb4.setCursor(new Cursor(Cursor.HAND_CURSOR));
	
			  rb4.setFont(f2);
			 
	bg.add(rb4);
	add(rb4);
		 
		  // t4=new JLabel();
		 // t4.setBounds(290,590,300,40);
		 // t4.setFont(f2);
		 // add(t4);
		 
		 
		   // l7=new JLabel(" Correct Option:");
		 // l7.setBounds(130,630,150,30);
		 // l7.setFont(f2);
		 // add(l7);
		 
		   // t7=new JTextField();
		 // t7.setBounds(290,630,300,40);
		 // t7.setFont(f2);
		 // add(t7);
		 
		 
		  l8=new JLabel();
		 l8.setBounds(150,740,300,50);
		 l8.setFont(f2);
		  l8.setForeground(Color.black);
		 add(l8);
	
		img1=new ImageIcon("back1.png");
		b1=new JButton(img1);
	b1.setBounds(10,10,100,45); 
	add(b1);	
	
		 b2=new JButton("PREVIOUS");
		 b2.setBounds(150,690,250,45);
		 b2.setBackground(Color.black);
	b2.setFont(f2);
	b2.setForeground(Color.white);
		 add(b2);
	
	b3=new JButton("SUBIMT");
	b3.setSize(250,45);
	b3.setLocation(530,830);
		b3.setFont(f2);
		b3.setBackground(Color.black);
	b3.setForeground(Color.white);
		
	add(b3);
	
	b4=new JButton("NEXT");
	b4.setSize(250,45);
	b4.setLocation(530,690);
	 b4.setBackground(Color.black);
	b4.setFont(f2);
	b4.setForeground(Color.white);
	add(b4);
	
	 l9=new JLabel();
		 l9.setBounds(150,780,300,50);
		 l9.setFont(f2);
		 l9.setForeground(Color.black);
		 add(l9);
		 
		 
		 
		 	b5=new JButton("ClearOption");
	b5.setSize(250,45);
	b5.setLocation(530,760);
	 b5.setBackground(Color.black);
	b5.setFont(f2);
	b5.setForeground(Color.white);
	add(b5);
	
	
	 b1.addActionListener(this);
	 b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
rb1.addActionListener(this);
rb2.addActionListener(this);
rb3.addActionListener(this);
rb4.addActionListener(this);
	


////timer-----------------------------------



		DecimalFormat df=new  DecimalFormat("00");
		
 tt=new Timer(1000,new ActionListener()/////util v import hai or swing v isliye ye likha esa javax.swing.Timer
			{
		public void actionPerformed(ActionEvent e)
		{   
		
			if(min==0&&sec==0&&hr==0)
			{ 
				 to="Time out";
				tt.stop();
				lt.setText("Time out");
			  JOptionPane.showMessageDialog(null,"TIME OUT");
                   



			 time=lt.getText();
	        try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();


 ResultSet rs=st.executeQuery("Select * from question_insert where course_name='"+s11+"' AND Correct_Option=user_answer ");
while(rs.next())
{
	cor++;
}
		
			 w=Exam.at-cor;//1-0=
	
			 
			  mo=eqm*cor;
		
			 
			  tm=Exam.n*eqm;
			  tm1=tm;
			 
			  p=(mo*100)/tm1;
			  System.out.println(p);
		
			result.l1.setText("Course Name:       "+s11); 
			result.l2.setText("Time Taken:          "+to); 
			result.l3.setText("Total Question:        "+Exam.n); 
			result.l4.setText("Attempted Questions:  "+Exam.at); 
			result.l5.setText("Correct Questions:       "+cor); 
			result.l6.setText("Wrong Questions          "+w); 
			result.l7.setText("Marks Obtained:         "+mo); 
			result.l8.setText("Total Marks:            "+tm); 
			result.l9.setText("Percentage:            "+new DecimalFormat("##.##").format(p)+"%"); 
			 
			 
			 
			 
		
			   f1.card.show(f1.c,"result");

			
			con.close();
	   }
	   
	    catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
		   
		
		   
		   
   
	   


//---------------------------------------------------------------------
					
			}
		
		
			if(sec==-1)
			{
			sec=59;
			min--;
			}
			if(min==-1)
			{
			min=59;
			hr--;
			}
			if(min<1&&hr<1)
			{
				lt.setForeground(Color.red);
			}
			
			
		
			fhr=df.format(hr);
			fmin=df.format(min);
			fsec=df.format(sec);
		    lt.setText(fhr+":"+fmin+":"+fsec);
			//lt.setText("Remaning Time:  "+fhr+":"+fmin+":"+fsec);
			sec--;
			
	
		}
	});
		//tt.start();
		








	
	//--------------------------------------------------
	
	
	 }
	 
	 	// public void paintComponent(Graphics g)
	// {
		// super.paintComponent(g);
         // if(rb1.isSelected())
		 // {
			 // g.setColor(Color.green);
		 // }
	
// }



	 
	 		public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	g.drawImage(adminpb,0,0,this);
	
	
	
}

public void actionPerformed(ActionEvent e)
	 {
	 if(e.getSource()==rb1)
	 {
         if(rb1.isSelected())
		   {   
	   
	   
	              user_answer="1";
	   System.out.println(s11);
	   System.out.println(qq);
	   
	        try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement(); 
 ResultSet rs=st.executeQuery("Select * from question_insert where course_name='"+s11+"' AND Question_No='"+qq+"' ");
			
			if(rs.next())
			{
			   
			   
			   if(rs.getString(9).equals("null"))
			   {
		        Exam.at++;   
				 
	           Exam.x1--; 
			   }
 
 st.executeUpdate("Update question_insert set user_answer='"+user_answer+"' where course_name='"+s11+"' AND Question_No='"+qq+"' ");
			}
			con.close();
	   }
	   
	    catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
		   
			
	   
	              // user_answer="1";
			      rb1.setForeground(Color.green);
	              rb2.setForeground(Color.black);
	              rb3.setForeground(Color.black);
	              rb4.setForeground(Color.black);
				  l8.setText("Question attempted: "+Exam.at);
				   l9.setText("Question remaining: "+Exam.x1);
				  System.out.println(Exam.at);
		   }
		   
	   }
	 
	else if(e.getSource()==rb2)
	 {
         if(rb2.isSelected())
		    {     

	               user_answer="2";


  
	   
	        try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement(); 
			
 ResultSet rs=st.executeQuery("Select * from question_insert where course_name='"+s11+"' AND Question_No='"+qq+"' ");
			
			if(rs.next())
			{
			   
			   
			   if(rs.getString(9).equals("null"))
			   {
		        Exam.at++;   
				  Exam.x1--; 
	   
			   }
  st.executeUpdate("Update question_insert set user_answer='"+user_answer+"' where course_name='"+s11+"' AND Question_No='"+qq+"' ");
			}
			con.close();
	   }
	   
	    catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
		





		
	              rb2.setForeground(Color.green);
			      rb1.setForeground(Color.black);
	              rb3.setForeground(Color.black);
	              rb4.setForeground(Color.black);
				  l8.setText("Question attempted: "+Exam.at);
				   l9.setText("Question remaining: "+Exam.x1);
				  System.out.println(Exam.at);
		   }
		   
	   }	

	 else  if(e.getSource()==rb3)
	 {
         if(rb3.isSelected())
		   {   

			   user_answer=""+3;
			   
			   
			  	   
	        try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement(); 
			
 ResultSet rs=st.executeQuery("Select * from question_insert where course_name='"+s11+"' AND Question_No='"+qq+"' ");
			
			if(rs.next())
			{
			   
			   
			   if(rs.getString(9).equals("null"))
			   {
		        Exam.at++;   
				 Exam.x1--;  
	   
			   }
  st.executeUpdate("Update question_insert set user_answer='"+user_answer+"' where course_name='"+s11+"' AND Question_No='"+qq+"' ");
			}
			con.close();
	   }
	   
	    catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
			   
			   
			   
			   
			   
			   
	          rb3.setForeground(Color.green);
			  rb1.setForeground(Color.black);
	              rb2.setForeground(Color.black);
	              rb4.setForeground(Color.black);
				  l8.setText("Question attempted: "+Exam.at);
				   l9.setText("Question remaining: "+Exam.x1);
				  System.out.println(Exam.at);
		   }
		   
	   } 
	   
	 else  if(e.getSource()==rb4)
	 {
         if(rb4.isSelected())
		   {       
         	   user_answer=""+4;
			   
			   
			   
			  	        try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement(); 
			
 ResultSet rs=st.executeQuery("Select * from question_insert where course_name='"+s11+"' AND Question_No='"+qq+"' ");
			
			if(rs.next())
			{
			   
			   
			   if(rs.getString(9).equals("null"))
			   {
		        Exam.at++;   
				  Exam.x1--; 
	   
			   }
  st.executeUpdate("Update question_insert set user_answer='"+user_answer+"' where course_name='"+s11+"' AND Question_No='"+qq+"' ");
			}
			con.close();
	   }
	   
	    catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
		 
			   
			   
	          rb4.setForeground(Color.green);
			  rb1.setForeground(Color.black);
	              rb2.setForeground(Color.black);
	              rb3.setForeground(Color.black);
				  l8.setText("Question attempted: "+Exam.at);
				   l9.setText("Question remaining: "+Exam.x1);
				 
		   }
		   
	   }
	   
	   
	   
	   if(e.getSource()==b4)
	   {  
   // String sc="null";
   if(Exam.y1<Exam.n)
   {
	   
	   Exam. z1++;
		     try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement(); 
  // st.executeUpdate("Update question_insert set user_answer='"+user_answer+"' where course_name='"+s11+"' AND Question_No='"+qq+"' ");
 ResultSet rs=st.executeQuery("Select * from question_insert where course_name='"+s11+"' LIMIT "+Exam.z1+",1 ");
			
			if(rs.next())
			{
			   
			   
			   if(rs.getString(9).equals("null"))
			   {
				   
				   
	               bg.clearSelection();
			      rb1.setForeground(Color.black);
	              rb2.setForeground(Color.black);
	              rb3.setForeground(Color.black);
	              rb4.setForeground(Color.black);
				   
			   }
			   else{
				   if(rs.getString(9).equals("1"))
				{
					rb1.setSelected(true);
					 rb1.setForeground(Color.green);
					   rb2.setForeground(Color.black);
	              rb3.setForeground(Color.black);
	              rb4.setForeground(Color.black);
				}
				
				else if(rs.getString(9).equals("2"))
				{
					rb2.setSelected(true);
					 rb2.setForeground(Color.green);
					 rb1.setForeground(Color.black);
	              rb3.setForeground(Color.black);
	              rb4.setForeground(Color.black);
				}
				
				else if(rs.getString(9).equals("3"))
				{
					rb3.setSelected(true);
					 rb3.setForeground(Color.green);
					   rb2.setForeground(Color.black);
	              rb1.setForeground(Color.black);
	              rb4.setForeground(Color.black);
				}
				 
				 else if(rs.getString(9).equals("4"))
				{
					rb4.setSelected(true);
					 rb4.setForeground(Color.green);
					   rb2.setForeground(Color.black);
	              rb3.setForeground(Color.black);
	              rb1.setForeground(Color.black);
				}
				   
			   }
			   
			   
	             // Exam.x1--;     
	              Exam.y1++;     
           
			  	
	            examstart. t.setText(rs.getString(3));
	           examstart. rb1.setText(rs.getString(4));
	           examstart. rb2.setText(rs.getString(5));
	           examstart. rb3.setText(rs.getString(6));
	           examstart.  rb4.setText(rs.getString(7));
	          qq=rs.getString(2);
				 
			   
			   
			   
				   
			   
			}
			
		
	
			
	       l2.setText("Question "+Exam.y1+":");
	          // l9.setText("Question remaining: "+Exam.x1);
	 	 
				System.out.println(Exam.y1+"nnn");

			con.close();
	   }
	   
	    catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
		   
		   
	   }
	   }
	   
	    if(e.getSource()==b2)
	   {   
    if(Exam.y1>1)	
	{   

         

         // qq=Exam.store;
       	Exam.z1--;
	   System.out.println(Exam. z1);
   
		     try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement(); 
 ResultSet rs=st.executeQuery("Select * from question_insert where course_name='"+s11+"' LIMIT "+Exam.z1+",1 ");
			
			if(rs.next())
			{
				
				
				
				
				
				   if(rs.getString(9).equals("null"))
			   {
				   // Exam.x1++;
				   
	               bg.clearSelection();
			      rb1.setForeground(Color.black);
	              rb2.setForeground(Color.black);
	              rb3.setForeground(Color.black);
	              rb4.setForeground(Color.black);
				   
			   }
			   
			   else{
				   if(rs.getString(9).equals("1"))
				{
					rb1.setSelected(true);
					 rb1.setForeground(Color.green);
					   rb2.setForeground(Color.black);
	              rb3.setForeground(Color.black);
	              rb4.setForeground(Color.black);
				}
				
				else if(rs.getString(9).equals("2"))
				{
					rb2.setSelected(true);
					 rb2.setForeground(Color.green);
					 rb1.setForeground(Color.black);
	              rb3.setForeground(Color.black);
	              rb4.setForeground(Color.black);
				}
				
				else if(rs.getString(9).equals("3"))
				{
					rb3.setSelected(true);
					 rb3.setForeground(Color.green);
					   rb2.setForeground(Color.black);
	              rb1.setForeground(Color.black);
	              rb4.setForeground(Color.black);
				}
				 
				 else if(rs.getString(9).equals("4"))
				{
					rb4.setSelected(true);
					 rb4.setForeground(Color.green);
					   rb2.setForeground(Color.black);
	              rb3.setForeground(Color.black);
	              rb1.setForeground(Color.black);
				}
				   
			   }
				
				
				
				
				
				
				
				
	              //Exam.x1++;     
	              Exam.y1--;     
			  	
	            examstart. t.setText(rs.getString(3));
	           examstart. rb1.setText(rs.getString(4));
	           examstart. rb2.setText(rs.getString(5));
	           examstart. rb3.setText(rs.getString(6));
	           examstart.  rb4.setText(rs.getString(7));
			    qq=rs.getString(2);
  
	         
			   
			}

			
			
	       l2.setText("Question "+Exam.y1+":");
	           l9.setText("Question remaining: "+Exam.x1);
	      // l9.setText("Question remaining: "+Exam.x1);
	 	  // Exam. z1++;
			System.out.println(Exam.y1+"pp");
	
			con.close();
	   }
	   
	    catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
		   
	   
	   }
	   }
	    
		
		 if(e.getSource()==b5)
	   {
		
	
			
			 // if(rb1.isSelected())
		   // {   
	   
	   
	            
	   
	   
	        try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement(); 
 ResultSet rs=st.executeQuery("Select * from question_insert where course_name='"+s11+"' AND Question_No='"+qq+"' ");
			
			if(rs.next())
			{
			   
			   
			   if(rs.getString(9)!=sc)
			   {
		          Exam.at--;   
				  Exam.x1++; 
			   }
 
 st.executeUpdate("Update question_insert set user_answer='"+sc+"' where course_name='"+s11+"' AND Question_No='"+qq+"' ");
			}
			con.close();
	   }
	   
	    catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
		   
			
	   
	             bg.clearSelection();
			rb1.setForeground(Color.black);
		   rb2.setForeground(Color.black);
		   rb3.setForeground(Color.black);
	        rb4.setForeground(Color.black);
				  l8.setText("Question attempted: "+Exam.at);
				   l9.setText("Question remaining: "+Exam.x1);
				  System.out.println(Exam.at);
		   }
		   
	   
	 
			
			
			
			
			
			
			
			
			
			
			
			//////////////////////////////////////////////////////////
		         // Exam.at--;   
				  // Exam.x1++; 
		// l9.setText("Question remaining: "+Exam.x1);
		  // l8.setText("Question attempted: "+Exam.at);
	   
		
		
		
		
		
	   if(e.getSource()==b1)
	   {   
             // Exam.x1=0;
             // Exam.y1=0;
		    f1.card.show(f1.c,"Exam");
			t.setText("");
			rb1.setText("");
			rb2.setText("");
			rb3.setText("");
			rb4.setText("");
			cor=0;
			
			//tt.stop();
	       // lt.setText("00:00:00");
			// hr=0;
			// min=0;
			// sec=0;
			
			//bg.clearSelection();
			//l2.setText("Question: "+Exam.y1+":");
			//l8.setText("Question attempted: ");
			//l9.setText("Question remaining: "+Exam.x1);
			
			
	   }
	   
	   
	   
	       if(e.getSource()==b3)
	   { 
             tt.stop();
			 time=lt.getText();
	        try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();


 ResultSet rs=st.executeQuery("Select * from question_insert where course_name='"+s11+"' AND Correct_Option=user_answer ");
while(rs.next())
{
	cor++;
}
		
			 w=Exam.at-cor;//1-0=
	
			 
			  mo=eqm*cor;
		
			 
			  tm=Exam.n*eqm;
			  tm1=tm;
			 
			  p=(mo*100)/tm1;
		
			result.l1.setText("Course Name:       "+s11); 
			result.l2.setText("Time Taken:          "+time); 
			result.l3.setText("Total Question:        "+Exam.n); 
			result.l4.setText("Attempted Questions:  "+Exam.at); 
			result.l5.setText("Correct Questions:       "+cor); 
			result.l6.setText("Wrong Questions          "+w); 
			result.l7.setText("Marks Obtained:         "+mo); 
			result.l8.setText("Total Marks:            "+tm); 
			result.l9.setText("Percentage:            "+new DecimalFormat("##.##").format(p)); 
			 
			 
			 
			 
		
			   f1.card.show(f1.c,"result");

			
			con.close();
	   }
	   
	    catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
		   
		
		   
		   
   
	   }
	   
	   
	   
	   
	   
	 }
}

