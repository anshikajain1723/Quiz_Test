import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class addcourse extends JPanel implements ActionListener
{
	JButton b1,b2;
	
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4,t5;
	 ImageIcon img1,img2,img8;
	  Image back1,addb,adminpb;
	  Fdemo f1;
	
	addcourse(Fdemo f)
	 {
		 f1=f;
		
		setLayout(null);
	Font f2=new Font("Arial Black",Font.BOLD,18);
	setFont(f2);
	
		Font f21=new Font("Arial Black",Font.BOLD,35);
	setFont(f21);
	
	Font f22=new Font("Arial Black",Font.BOLD,20);
	setFont(f22);
	
	
	img2=new ImageIcon("addb.png");
	addb=img2.getImage();
	
	img8=new ImageIcon("adminpb.jpg");
	adminpb=img8.getImage();
	
	l1=new JLabel("ADD COURSES");
	l1.setBounds(330,20,400,50);
		l1.setForeground(Color.black);
	l1.setFont(f21);
	add(l1);
	
	l2=new JLabel("SUBJECT NAME");
	l2.setBounds(390,325,400,50);
		l2.setForeground(Color.black);
	l2.setFont(f22);
	add(l2);
	
	t1=new JTextField();
	t1.setBounds(300,375,350,50);
		t1.setFont(f2);
	
	add(t1);
	
	l3=new JLabel("TIME:-");
		l3.setForeground(Color.black);
	l3.setBounds(300,450,400,50);
	 l3.setFont(f2);
	add(l3);
	
	t2=new JTextField();
	t2.setBounds(400,450,50,50);
		t2.setFont(f2);
	add(t2);
	
	l4=new JLabel(":");
	l4.setBounds(470,450,10,50);
	l3.setForeground(Color.black);
	 l4.setFont(f2);
	add(l4);
	
	
	t3=new JTextField();
	t3.setBounds(500,450,50,50);
		t3.setFont(f2);
	add(t3);
	
	
	l5=new JLabel(":");
	l5.setBounds(570,450,10,50);
	l3.setForeground(Color.black);
	 l5.setFont(f2);
	add(l5);
	
	t4=new JTextField();
	t4.setBounds(600,450,50,50);
		t4.setFont(f2);
	add(t4);
	
	l6=new JLabel("EACH QUESTION MARK:-");
	l6.setBounds(300,550,280,50);
	l6.setForeground(Color.black);
	l6.setFont(f2);
	add(l6);
	
	
		t5=new JTextField();
	t5.setBounds(600,550,50,50);
		t5.setFont(f2);
	add(t5);
	
	
	
		img1=new ImageIcon("back1.png");
		b1=new JButton(img1);
	b1.setBounds(10,10,100,45); 
	add(b1);
	
	b2=new JButton("add course");
	b2.setBounds(380,640,200,50);
		b2.setBackground(Color.black);
	b2.setFont(f2);
	b2.setForeground(Color.white);
	add(b2);
	
	b1.addActionListener(f);
	b2.addActionListener(this);

	 }
	 
	 
	 
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	g.drawImage(adminpb,0,0,this);
	g.drawImage(addb,330,75,this);
	
	
}
	 
	 
	 
         public void actionPerformed(ActionEvent e)
		 {
			 
			 
			// mc.revalidate();
				//mc.repaint();
	   String s1=t1.getText();
	   String s2=t2.getText();
	   String s3=t3.getText();
	   String s4=t4.getText();
	   // String d1=l4.getText();
	   // String d2=l5.getText();
	   
	   // String s=""+s2+d1+s3+d2+s4;
	   String s5=t5.getText();
	  
	   
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
			
st.executeUpdate("insert into subject(subject_name,ques_time_hr,ques_time_min ,ques_time_sec,each_ques_mark) values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");





//----------------------------------


		
			
  ResultSet rs=	st.executeQuery("select subject_name from subject ");
	 managecourses.cb1.removeAllItems();
	while(rs.next())
	{          
		 //System.out.println("sita");

      String ss=rs.getString("subject_name");
		  managecourses.cb1.addItem(ss);
         
      
	}
		   
		
	         
	    
			
		
		
	   



	//--------------------------
	JOptionPane.showMessageDialog(null,"subject added");
      //managecourses mc=new managecourses(f1);
	f1.card.show(f1.c,"managecourses");
	
	con.close();
	
	t1.setText("");
	t2.setText("");
	t3.setText("");
	t4.setText("");
	t5.setText("");
	
	 
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
			 
			 
		 	 
	
	
