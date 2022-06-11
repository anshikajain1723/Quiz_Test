import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;

class adminpanel extends JPanel implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6;
	JLabel l1;
	
	   ImageIcon img1,img2,img3,img4,img5,img6,img7,img8;
	  Image manage,logout,user,passchange,verification,result,adminpb;
	
	adminpanel (Fdemo f)
	 {
		setLayout(null);
	Font f2=new Font("Arial Black",Font.BOLD,40);
	setFont(f2);
	
	Font f21=new Font("Arial Black",Font.BOLD,18);
	setFont(f21);	
	
	Font f22=new Font("Arial Black",Font.BOLD,15);
	setFont(f22);
	
	l1=new JLabel("ADMIN PANEL");
	l1.setSize(400,50);
	l1.setLocation(350,20);
	l1.setForeground(Color.black);
	l1.setFont(f2);
	add(l1);
	
	
	img8=new ImageIcon("adminpb.jpg");
	adminpb=img8.getImage();
	
	
	img7=new ImageIcon("massage.png");
	
	img1=new ImageIcon("manage1.png");
	manage=img1.getImage();
	
	b1=new JButton("Manage Course");
	b1.setBounds(220,150,200,50);
		b1.setBackground(Color.black);
	b1.setFont(f22);
	b1.setForeground(Color.white);
	add(b1);
	
	
	img2=new ImageIcon("result.png");
	result=img2.getImage();
	
	b2=new JButton("Course Result");
	b2.setBounds(220,350,200,50);
	b2.setBackground(Color.black);
	b2.setFont(f21);
	b2.setForeground(Color.white);
	add(b2);
	
	img3=new ImageIcon("logout.png");
	logout=img3.getImage();
	
	b3=new JButton("Logout");
	b3.setBounds(220,550,200,50);
	b3.setBackground(Color.black);
	b3.setFont(f21);
	b3.setForeground(Color.white);
	add(b3);
	
	img4=new ImageIcon("user.png");
	user=img4.getImage();
	
	b4=new JButton("Users");
	b4.setBounds(730,150,200,50);
	b4.setBackground(Color.black);
	b4.setFont(f21);
	b4.setForeground(Color.white);
	add(b4);
	
	
		img5=new ImageIcon("verification.png");
	verification=img5.getImage();
	
	b5=new JButton("Verification");
	b5.setBounds(730,350,200,50);
	b5.setBackground(Color.black);
	b5.setFont(f21);
	b5.setForeground(Color.white);
	add(b5);
	
	img6=new ImageIcon("passchange.png");
	passchange=img6.getImage();
	
	b6=new JButton("Password Change");
	b6.setBounds(730,550,200,50);
	b6.setBackground(Color.black);
	b6.setFont(f22);
	b6.setForeground(Color.white);
	add(b6);
	
	b1.addActionListener(f);
	b2.addActionListener(f);
	b3.addActionListener(f);
	b4.addActionListener(f);
	b5.addActionListener(f);
	b6.addActionListener(this);

	 }
	
		public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	g.drawImage(adminpb,0,0,this);
	g.drawImage(manage,30,100,this);
	g.drawImage(result,30,300,this);
	g.drawImage(logout,30,500,this);
	g.drawImage(user,530,100,this);
	g.drawImage(verification,530,285,this);
	g.drawImage(passchange,530,500,this);
}
	
	
	public void actionPerformed(ActionEvent e)
	{ 
	   String x="";
	   String s1="adminlogin";
	   
	   if(e.getSource()==b6)
	   {
		  
	  x=JOptionPane.showInputDialog(b6,"Enter New Password","change password",JOptionPane.INFORMATION_MESSAGE);
	  // if(x==null)
		 // x="";
	   // }    
             	
	if(x!=null)
	{
	if(x.length()>0)
	{
	 try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
         st.executeUpdate("update user_regislog set Password='"+x+"' where Verification='"+s1+"' ");

	    JOptionPane.showMessageDialog(b6,"your password has been changed Successfully","Password Changed",JOptionPane.PLAIN_MESSAGE,img7);
	con.close();
	
	   }
	
	
	
	catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
	} else
	{
	 JOptionPane.showMessageDialog(b6,"invald expression","Warning",JOptionPane.WARNING_MESSAGE);
		this.actionPerformed(e);
//	x=JOptionPane.showInputDialog(null,"Enter New Password");
	 
	}
	}  
		   
	   
		 }
}
}

		
	 
	 
	
