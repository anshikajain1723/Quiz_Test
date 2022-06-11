import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
  class Forgetpass extends JPanel implements KeyListener,ActionListener
  {
	
	JTextField t1; 
	
	    JButton b1,b2; 
		
     
	  ImageIcon img1,img2,img7;
	  Image back1 ,for1,passchange;
	
	 Forgetpass(Fdemo f)
	 {
		 
      
		 
		setLayout(null);
		
	Font f2=new Font("Bahnschrift Condensed",Font.BOLD,18);
	setFont(f2);
	
	Font f21=new Font("Arial Black",Font.BOLD,18);
	setFont(f21);
	
	Font f22=new Font("Bahnschrift Condensed",Font.BOLD,15);
	setFont(f22);
	
	img2=new ImageIcon("for.jpg");	
        	for1=img2.getImage();
	
	
	
	img7=new ImageIcon("massage.png");
	
	t1=new JTextField("Phone No./Email Address");
	t1.setSize(300,45);
	t1.setLocation(553,297);
	t1.setOpaque(false);
	   t1.setFont(f2);
	   t1.setBorder(null);
	   t1.setForeground(Color.gray);
	   t1.addKeyListener(this);
	add(t1);

	

	

	
	
		// img1=new ImageIcon("Back to Login");
		b1=new JButton("Back to Login?");
	b1.setBounds(693,388,200,30); 
	b1.setOpaque(false);
	b1.setContentAreaFilled(false);
	b1.setBorderPainted(false);
		 b1.setFont(f22);
		  b1.setForeground(Color.black);
	add(b1);	
	
	
	
	
	b2=new JButton("ResetPassword");
	b2.setSize(300,30);
	b2.setOpaque(false);
	b2.setContentAreaFilled(false);
	b2.setBorderPainted(false);
		 b2.setFont(f21);
		  b2.setForeground(Color.black);
	b2.setLocation(551,360);
	add(b2);
	b2.addActionListener(this);
	
	
	 b1.addActionListener(f);
	 b2.addActionListener(f);
	
	 }
	 
	 
	 
	 	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	g.drawImage(for1,0,0,this);


}
	 

		  	 public void keyReleased(KeyEvent e1)
			 {

				 String s1=t1.getText().trim();
				 
				if(s1.equals(""))
				 {
					 t1.setText("Phone No./Email Address");
					 t1.setForeground(Color.gray);
				 }
				 
				 }

			 
		  public void keyPressed(KeyEvent e1)
		  {
				 
				 String s1=t1.getText();
			    if(s1.equals("Phone No./Email Address"))
				 {
					 t1.setText("");
					 t1.setForeground(Color.black);
				 }
				 
				 }

		  public void keyTyped(KeyEvent e1)
		  {
			  
		  }
		  
		  	public void actionPerformed(ActionEvent e)
	{ 
	   String x="";
	   String s1=t1.getText();
	   
	   if(e.getSource()==b2)
	   {
		  
	  x=JOptionPane.showInputDialog(null,"Enter New Password","Reset password",JOptionPane.INFORMATION_MESSAGE);
	    
             	
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
			
       int x1=  st.executeUpdate("update user_regislog set Password='"+x+"' where Email='"+s1+"' OR Contact='"+s1+"' ");
if(x1!=0)
{
	    JOptionPane.showMessageDialog(null,"your password has been changed Successfully","Password Changed",JOptionPane.PLAIN_MESSAGE,img7);
		t1.setText("");
}
else{
	    JOptionPane.showMessageDialog(null,"invald ","Password Changed",JOptionPane.PLAIN_MESSAGE,img7);
	
}
	con.close();
	
	   }
	
	
	
	catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
	} else
	{
	 JOptionPane.showMessageDialog(null,"invald expression","Warning",JOptionPane.WARNING_MESSAGE);
		this.actionPerformed(e);
//	x=JOptionPane.showInputDialog(null,"Enter New Password");
	 
	}
	}  
		   
	   
		 }
		  
		  
		  
	
	
}
  }