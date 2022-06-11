import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

class adminuser extends JPanel
{
	   JButton b1,b2;
	
	    ImageIcon img1,img2,img3,img4;
	  Image adminuser,adminusericon,admin,user;
	  
	 
	adminuser(Fdemo f)
	{
		setLayout(null);
		Font f1=new Font("forte",Font.BOLD,20);
	    setFont(f1);
		
				img1=new ImageIcon("adminuser.png");
	adminuser=img1.getImage();

	img2=new ImageIcon("adminusericon.png");	
	adminusericon=img2.getImage();
		
	img3=new ImageIcon("admin.png");
	img4=new ImageIcon("user1.png");
	
	
		
		
		
		
	b1=new JButton(img3);
	b1.setBounds(390,350,220,50); 
	add(b1);	

	
	b2=new JButton(img4);
	b2.setBounds(390,450,220,50);
	add(b2);
	
	 b1.addActionListener(f);
	b2.addActionListener(f);
	
	
	
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	g.drawImage(adminuser,0,0,this);
	g.drawImage(adminusericon,400,100,this);
}
}