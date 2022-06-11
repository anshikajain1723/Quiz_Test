import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Regisdemo extends JPanel implements ActionListener
{
	
	  ImageIcon img1,img2;
	  Image back1,regis;
	   JTextField t1,t3,t4,t5;
      JPasswordField t2;
   JLabel l1,l2,l3,l4,l5,l6,l7,l8;
   JButton b1,b2,b3;                                  //global
   JRadioButton rb1,rb2;
   JComboBox cb1,cb2,cb3;
   ButtonGroup bg;
   JCheckBox c1;
   Fdemo f1;
   Regisdemo(Fdemo f)
{  f1=f;
    setLayout(null);
	Font f1=new Font("forte",Font.BOLD,40);
	setFont(f1);
	
	Font f11=new Font("Arial Black",Font.BOLD,20);
	setFont(f11);
	
	img2=new ImageIcon("regis.jpg");	
        regis=img2.getImage();
	
	
	   //label
	l1=new JLabel("REGISTATION FORM");
	l1.setSize(600,50);
	l1.setLocation(300,20);
	l1.setFont(f1);
	l1.setForeground(Color.white);
	add(l1);
	
	l2=new JLabel("UserName:");
	l2.setSize(130,50);
	l2.setForeground(Color.white);
	l2.setLocation(150,145);
	l2.setFont(f11);
	add(l2);

	l3=new JLabel("Password:");
	l3.setSize(150,50);
	l3.setLocation(150,245);
	l3.setForeground(Color.white);
	l3.setFont(f11);
	add(l3);	
	
	l4=new JLabel("Email:");
	l4.setSize(120,50);
	l4.setLocation(150,345);
	l4.setForeground(Color.white);
	l4.setFont(f11);
	add(l4);
	
		
	l5=new JLabel("Contact No.:");
	l5.setSize(150,50);
	l5.setFont(f11);
	l5.setLocation(130,445);
	l5.setForeground(Color.white);
	add(l5);	
	
	l6=new JLabel("Address:");
	l6.setSize(120,50);
	l6.setLocation(150,545);
	l6.setForeground(Color.white);
	l6.setFont(f11);
	add(l6);
	
	l7=new JLabel("D.O.B:");
	l7.setSize(120,50);
	l7.setFont(f11);
	l7.setLocation(150,645);
	l7.setForeground(Color.white);
	add(l7);
	
	l8=new JLabel("Gender:");
	l8.setSize(110,50);
	l8.setFont(f11);
	l8.setForeground(Color.white);
	l8.setLocation(150,730);
	add(l8);

	
	//textfield
	t1=new JTextField(10);
	t1.setSize(280,42);
	t1.setLocation(300,150);
	t1.setFont(f11);
	add(t1);
	
	t2=new JPasswordField(10);
	t2.setSize(280,42);
	t2.setFont(f11);
	t2.setLocation(300,250);
	add(t2);
	
	t3=new JTextField(10);
	t3.setSize(280,42);
	t3.setFont(f11);
	t3.setLocation(300,350);
	add(t3);
	

	
	t4=new JTextField(10);
	t4.setSize(280,42);
	t4.setFont(f11);
	t4.setLocation(300,450);
	add(t4);
	
	t5=new JTextField(10);
	t5.setSize(280,42);
	t5.setFont(f11);
	t5.setLocation(300,550);
	add(t5);
	
		  	//JComboBox
	cb1=new JComboBox();
	for(int i=1; i<=31;i++)
	{   
        if(i<10)
		{
		 cb1.addItem("0"+i);
	    }
		else
		{
			cb1.addItem(""+i);
		}
	}
	 cb1.setSize(60,50);
	cb1.setLocation(300,650);
	cb1.setFont(f11);
    add(cb1);
	
	cb2=new JComboBox();
	for(int j=1; j<=12;j++)
	{
		 if(j<10)
		{
		 cb2.addItem("0"+j);
	    }
		else
		{
		 cb2.addItem(""+j);
		}
	}
	cb2.setSize(60,50);
	cb2.setLocation(380,650);
	cb2.setFont(f11);
    add(cb2);
	
	cb3=new JComboBox();
	for(int k=2000; k<=2021;k++)
	{
		cb3.addItem(k);
	}
	 cb3.setSize(100,50);
	cb3.setLocation(465,650);
	cb3.setFont(f11);
    add(cb3);
	
	//JRadioButton 
    bg=new ButtonGroup();
	rb1=new JRadioButton ("Male");
    rb1.setSize(100,50);
	rb1.setFont(f11);
	rb1.setOpaque(false);
	rb1.setLocation(300,730);
	
	bg.add(rb1);
	add(rb1);
	
	rb2=new JRadioButton ("Female");
    rb2.setSize(150,50);
	rb2.setLocation(400,730);
	rb2.setOpaque(false);
	rb2.setFont(f11);
	bg.add(rb2);
	add(rb2);
	
	
	
	
	//Jbutton
	b2=new JButton("RESET");
	b2.setSize(170,45);
	b2.setBackground(Color.black);
	b2.setForeground(Color.white);
	b2.setLocation(150,810);
	b2.setFont(f11);
	add(b2);
	
	
	b1=new JButton("SUBMIT");
	b1.setSize(170,45);
		b1.setBackground(Color.black);
	b1.setForeground(Color.white);
	b1.setLocation(390,810);
	b1.setFont(f11);
	add(b1);
	

	
  	img1=new ImageIcon("back1.png");
		b3=new JButton(img1);
	b3.setBounds(10,10,100,45); 
	add(b3);
	
	b3.addActionListener(this);
	b1.addActionListener(this);
	b2.addActionListener(this);
	
	
	 }
	 
	 
	 	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	g.drawImage(regis,0,0,this);
	
}
	 
	 
	 
	 public void actionPerformed(ActionEvent e)
	 {  
		 int x1=0;
		 //int x2=CURDATE();
		 //int x3=CURTIME();
		 if(e.getSource()==b1)
		 {
	   String s1=t1.getText();
	   String s2=t2.getText();
	   String s3=t3.getText();
	   String s4=t4.getText();
	   String s5=t5.getText();
	
	   
	  String s6=(String)cb1.getSelectedItem();
	  String s7=(String)cb2.getSelectedItem();
	   int s8=(Integer)cb3.getSelectedItem();
	   String s9=""+s6+"-"+s7+"-"+s8;
	  String s11="Verify"; 
	  
	   String s10="";
	   if(rb1.isSelected())
	{
          s10=rb1.getLabel();
	}
	else if(rb2.isSelected())
	{
	s10=rb2.getLabel();
	}
	
	
	   
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
			
st.executeUpdate("insert into user_regislog(regis_no,regis_date,regis_time, UserName,Password,Email,Contact,Address,DOB,gender,Verification) values('"+x1+"',CURDATE(),(TIME_FORMAT(CURTIME(),'%h:%i:%s %p')),'"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s9+"','"+s10+"','"+s11+"')");
	
	JOptionPane.showMessageDialog(null,"Registation completed");
	f1.card.show(f1.c,"Login");
	//Verification v=new Verification(f1);
	//v.actionPerformed(e);
	
///================================================
   //System.out.println("naman");
		   
	  
	
  ResultSet rs=	st.executeQuery("select UserName from user_regislog where Verification='"+s11+"' ");
	//Verification.cb1.removeAllItems();		
	while(rs.next())
	{          
      String vs1=rs.getString("UserName");
		 Verification.cb1.addItem(vs1); 
	}
 

	
////=======================================================	
	
	con.close();
	
	t1.setText("");
	t2.setText("");                       
	t3.setText("");
	t4.setText("");
	t5.setText("");
	bg.clearSelection();
	cb1.setSelectedIndex(0);
	cb2.setSelectedIndex(0);
	cb3.setSelectedIndex(0);
	
	 
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
	 
	 if(e.getSource()==b2)
	 {
		 	t1.setText("");
	t2.setText("");                       
	t3.setText("");
	t4.setText("");
	t5.setText("");
	bg.clearSelection();
	cb1.setSelectedIndex(0);
	cb2.setSelectedIndex(0);
	cb3.setSelectedIndex(0);
	 }
	 
	 
	  if(e.getSource()==b3)
	 {
		 f1.card.show(f1.c,"home");
	t1.setText("");
	t2.setText("");                       
	t3.setText("");
	t4.setText("");
	t5.setText("");
	bg.clearSelection();
	cb1.setSelectedIndex(0);
	cb2.setSelectedIndex(0);
	cb3.setSelectedIndex(0);
	 }
	 
	 
	 
	 }
	 }


