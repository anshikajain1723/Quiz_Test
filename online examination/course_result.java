import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class course_result extends JPanel 
{

	 static JLabel l;
     static JTextArea t1;
	static  JScrollPane t2;
	   JButton b1; 
	  ImageIcon img1,img2;
	  Image ucr;
	Fdemo f1;
	
	course_result(Fdemo f)
	 {
		 f1=f;
		setLayout(null);
	Font f2=new Font("Arial Black",Font.BOLD,35);
	setFont(f2);
	
	Font f21=new Font("Arial Black",Font.BOLD,25);
	setFont(f21);
	
	
		Font f22=new Font("Bahnschrift Condensed",Font.BOLD,18);
	setFont(f22);
	
	img2=new ImageIcon("ucr1.jpg");
           ucr=img2.getImage();
		  
	
	
	   //label
	
	
		l=new JLabel();
	l.setSize(400,50);
	l.setLocation(550,55);
    l.setFont(f21);
	//l.setForeground(Color.white);
	l.setForeground(Color.black);
	add(l);
	
	
	
    t1=new JTextArea();
	
	// t1.setLineWrap(true);
	// t1.setWrapStyleWord(true);
   t2=new JScrollPane(t1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
   t2.setBounds(1,160,960,820);
   t1.setEditable(false);
  // t1.setBackground(Color.cyan);
   	t1.setOpaque(false);
   	t2.setOpaque(false);
	t1.setForeground(Color.black);
	t2.getViewport().setOpaque(false);
	  t1.setBorder(null);
       t1.setFont(f22);
   add(t2);
	

		img1=new ImageIcon("back1.png");
		b1=new JButton(img1);
	b1.setBounds(10,10,100,45); 
	add(b1);
	
b1.addActionListener(f);
	
	 }
	 
	 
	 	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	g.drawImage(ucr,0,0,this);
	
	
}

	 
	 
}	
