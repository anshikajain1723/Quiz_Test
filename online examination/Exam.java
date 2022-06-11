import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


class Exam extends JPanel implements ActionListener
{ 
	JButton b1,b2;
	static JComboBox cb1;
	 static JLabel l1,l2,l3,l4,l5,l6,l7;
	 
	 ImageIcon img1,img2,img8;
	  Image back1,adminpb,exami;
	   static int x1,m,h,sec;
		 static int y1;
		 static int z1;
		 static int total_ques;
		  static int at;
	static int n;
	
	 Fdemo f1;
	Exam(Fdemo f)
	 {
		 f1=f;

		setLayout(null);
	Font f2=new Font("Arial Black",Font.BOLD,35);
	setFont(f2);
	Font f21=new Font("Arial Black",Font.BOLD,28);
	setFont(f21);
	Font f22=new Font("Arial Black",Font.BOLD,16);
	setFont(f22);
	
	
		img8=new ImageIcon("adminpb.jpg");
	adminpb=img8.getImage();
	
	img2=new ImageIcon("exami.png");
	exami=img2.getImage();
	
	
	l1=new JLabel();
	l1.setBounds(285,20,400,50);
	l1.setFont(f2);
	l1.setForeground(Color.black);
	add(l1);
	
	
	
		l2=new JLabel("Select Cource:-");
	l2.setBounds(130,400,300,50);
	l2.setFont(f21);
		l2.setForeground(Color.black);
	add(l2);
	
		
		  cb1=new JComboBox();
	      //cb1.addItem();
          cb1.setBounds(450,400,300,50);
	      cb1.setFont(f22);
		  cb1.setForeground(Color.black);
	    add(cb1);
	
	img1=new ImageIcon("back1.png");
	b1=new JButton(img1);
	b1.setBounds(10,10,100,45); 
	add(b1);
	
	b2=new JButton("START");
	b2.setBounds(370,520,200,50);
	b2.setBackground(Color.black);
	b2.setFont(f21);
	b2.setForeground(Color.white);
	add(b2);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	cb1.addActionListener(this);
	//intstructions-------------------
	
	l3=new JLabel();//"--:Instructions:--"
	l3.setBounds(370,580,600,50);
	l3.setFont(f22);
		l3.setForeground(Color.black);
	add(l3);
	
	l4=new JLabel();//1.There are total 2 question each with 5 marks in this course.
	l4.setBounds(240,620,700,50);
	l4.setFont(f22);
		l4.setForeground(Color.black);
	add(l4);
	
	l5=new JLabel();//"2.Maximum time is 00:00:00."
	l5.setBounds(240,650,600,50);
	l5.setFont(f22);
		l5.setForeground(Color.black);
	add(l5);
	
	l6=new JLabel();//"3.There is no negative marking for any question."
	l6.setBounds(240,680,600,50);
	l6.setFont(f22);
		l6.setForeground(Color.black);
	add(l6);
	
	l7=new JLabel();//"4.After time up you will be automatically submit."
	l7.setBounds(240,710,600,50);
	l7.setFont(f22);
		l7.setForeground(Color.black);
	add(l7);
	
	 }
	 
	 
	 	 
	 		public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	g.drawImage(adminpb,0,0,this);
	g.drawImage(exami,10,-70,this);
	
	
}
	 
  public void actionPerformed(ActionEvent e)
   {   
       
	   String s1=(String)cb1.getSelectedItem();
		examstart.s11=s1; 
		 x1=0;
         y1=0;
         z1=0;
		 at=0;
	////////////////////////////////////////////////////////////////////	 
		 if(e.getSource()==cb1)
		 {
			 
			 // examstart.hr=0;
			 // examstart.min=0;
			 // examstart.sec=0;
			 // examstart.tt.stop();
			 
			 
			 System.out.println("kk");
          if(cb1.getSelectedIndex()==0)
		{	
	   l3.setText("");
	   l4.setText("");
	   l5.setText("");
	   l6.setText("");
	   l7.setText("");
	   
	         }
		 try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
   ResultSet rs1=st.executeQuery("select  Question_No from question_insert where course_name='"+s1+"' ");
             total_ques=0;
	while(rs1.next())
	{  
       total_ques++;       
	}
	
	
	if(total_ques>0)
	{
	
	
	
	
			ResultSet rs=st.executeQuery("Select * from subject where subject_name='"+s1+"' ");
			
			if(rs.next())
			{
		               
	            l3.setText("--:Instructions:--");
   			 l4.setText("1.There are total "+total_ques+" question each with "+rs.getString(5)+" marks in this course.");
	            l5.setText("2.Maximum time is "+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4)+".");
	           l6.setText("3.There is no negative marking for any question.");
	            l7.setText("4.After time up you will be automatically submit.");
				  
			 h=Integer.parseInt(rs.getString(2));//
			examstart.hr=h;
			 m=Integer.parseInt(rs.getString(3));//
			examstart.min=m;
		   sec=Integer.parseInt(rs.getString(4));//		
		  examstart.sec=sec;
			examstart.eqm=Integer.parseInt(rs.getString(5));
			
			System.out.println(examstart.hr);
		}
	}
	else 
	{
		if(total_ques==0 && cb1.getSelectedIndex()!=0)
		{
		 l3.setText("--:Instructions:--");
   		 l4.setText("1.No more questions...................Sorry");
		 l5.setText("");
		 l6.setText("");
		 l7.setText("");
		
		//examstart.tt.stop();
		 
		 }
		
	   
		
	}
				con.close();
	   }
	   
	    catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
	   
		 }
		 
		 
		 
		 
		 
		////////////////////////////////////////////////////////// 
		 
	   if(e.getSource()==b2)
		   
	   {	
	 
	 
	      
	   String user_answer="null";

 
	            examstart.bg.clearSelection();
			    examstart.  rb1.setForeground(Color.black);
	            examstart.  rb2.setForeground(Color.black);
	            examstart.  rb3.setForeground(Color.black);
	           examstart.   rb4.setForeground(Color.black);


        if(cb1.getSelectedIndex()>0)
		{
	   f1.card.show(f1.c,"examstart");
	   
		}
		
		
		else{
			JOptionPane.showMessageDialog(b2,"Invaild expression please select any one option");
		}
	   examstart.l.setText("Course Name: "+s1);
		 
	   try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("Select * from question_insert where course_name='"+s1+"' ");
			
			if(rs.next())
			{
			  	//t2.setText(rs.getString(2));
	            examstart. t.setText(rs.getString(3));
   			  examstart. rb1.setText(rs.getString(4));
	           examstart. rb2.setText(rs.getString(5));
	           examstart. rb3.setText(rs.getString(6));
	           examstart. rb4.setText(rs.getString(7));
	           examstart.qq=rs.getString(2);
			}
			
           
   ResultSet rs1=st.executeQuery("select  Question_No from question_insert where course_name='"+s1+"' ");
	while(rs1.next())
	{   x1++;     
        y1=1;
		
	//  String s11=rs1.getString("Question_No");
	
	}
	n=x1;
	        
 int x= st.executeUpdate("Update question_insert set user_answer='"+user_answer+"' ");

	 // if(x1>0)
	 // {
		 // x1--;
	 // }
	examstart.l2.setText("Question "+y1+":");
	examstart.l9.setText("Question remaining: "+x1);
	
	examstart.l8.setText("Question attempted: "+at);
	examstart.cor=0;
	examstart.w=0;
	examstart.mo=0;
	 	//z1++;
		if(total_ques>0)
		{
		   examstart.lt.setForeground(Color.black);
	     	examstart.hr=h;
			examstart.min=m;
		  examstart.sec=sec;
		examstart.tt.start();
		}
		else{
			
		examstart.tt.stop();
			examstart.lt.setText("00:00:00");
		}
		con.close();
	   }
	   
	    catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
	   
	   }
	   
	   
	   	   if(e.getSource()==b1)
	   {   
           
		    f1.card.show(f1.c,"welcome");
	   l3.setText("");
	   l4.setText("");
	   l5.setText("");
	   l6.setText("");
	   l7.setText("");
	   
	   }
   }
  }
