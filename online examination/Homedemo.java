import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

class Homedemo extends JPanel
{
	   JButton b1,b2,b3;
	 ImageIcon img1,img2,img3,img4,img5;
	  Image  homeimage,homeicon,login,regisimage,back1;
	Homedemo(Fdemo f)
	{
		setLayout(null);
		Font f1=new Font("forte",Font.BOLD,20);
	    setFont(f1);
		
		
			img1=new ImageIcon("homeimage.png");	
        	homeimage=img1.getImage();	
			img2=new ImageIcon("homeicon.png");	
        	homeicon=img2.getImage();	
			img3=new ImageIcon("loginimage.png");
			img4=new ImageIcon("regisimage.png");
			img5=new ImageIcon("back1.png");
		
	b1=new JButton(img3);
	b1.setBounds(390,400,220,50); 

	add(b1);	
	
	b2=new JButton(img4);
	b2.setBounds(390,500,220,50); 
	add(b2);
	
	b3=new JButton(img5);
	b3.setBounds(10,10,100,45); 
	add(b3);
	
	 b1.addActionListener(f);
	b2.addActionListener(f);
	b3.addActionListener(f);
	
	
	
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	g.drawImage(homeimage,0,0,this);
	g.drawImage(homeicon,380,100,this);
}
}