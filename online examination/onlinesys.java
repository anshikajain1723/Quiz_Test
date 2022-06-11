import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

class onlinesys extends JPanel
{
	  
	  JButton b1;
	  ImageIcon img1,img2,img3;
	  Image onlineimage2,next,side;
	  
	
	onlinesys(Fdemo f)
	{
	  

	img1=new ImageIcon("onlineimage2.jpg");
	onlineimage2=img1.getImage();	
	

	
	 img2=new ImageIcon("next.png");
       setLayout(null);

	 b1=new JButton(img2);
		 b1.setBounds(800,715,150,60);
		 add(b1);
	

 b1.addActionListener(f);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		Font f=new Font("Algerian",Font.BOLD,50);
		setFont(f);
	
			g.drawImage(onlineimage2,0,0,this);
			// g.drawImage(side,385,300,this);
			
			//g.drawImage(next,350,330,this);
			
		g.setColor(Color.white);
	g.drawString("ONLINE EXAMINATION SYSTEM",95,80);
								
			}
	
}