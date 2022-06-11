import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

  class Logindemo extends JPanel implements KeyListener,ItemListener
  {
	//JPanel p2;
	JLabel l1,l2;
	static JTextField t1; 
	static JPasswordField p1;
	    JButton b1,b2,b3; 
		 JCheckBox c1;
      int i=1;
	  ImageIcon img1,img2,img3,img4;
	  Image back1 ,ll,logini,loginii;
	
	 Logindemo(Fdemo f)
	 {
		 
        // setResizeable(false);		
		 // setTittle("Login Page");
		 
		setLayout(null);
		 // p2=new JPanel();
		 // p2.setBounds(100,100,500,400);
		 // p2.setBackground(new Color(0,0,0,120));
		 // add(p2);
	Font f2=new Font("Arial Black",Font.BOLD,25);
	setFont(f2);
	
	// Font f21=new Font("Bahnschrift Condensed",Font.BOLD,17);
	// setFont(f21);
	
	Font f22=new Font("Bahnschrift Condensed",Font.BOLD,16);
	setFont(f22);
	
	img2=new ImageIcon("ll.png");	
        	ll=img2.getImage();
	
	img3=new ImageIcon("logini.png");	
        	logini=img3.getImage();
			
			img4=new ImageIcon("lo.png");	
        	loginii=img4.getImage();
	
	   //label
	// l1=new JLabel("Enter Name");
	// l1.setSize(180,50);
	// l1.setLocation(100,145);
    // l1.setFont(f2);
	// add(l1);
	
	t1=new JTextField("Enter Name");
	t1.setSize(300,50);
	t1.setLocation(365,315);
	t1.setOpaque(false);
	   t1.setFont(f2);
	   t1.setBorder(null);
	   t1.setForeground(Color.gray);
	add(t1);
	t1.addKeyListener(this);
	

	
	// l2=new JLabel("Enter Password");
	// l2.setSize(180,50);
	// l2.setLocation(100,245);
    // l2.setFont(f2);
	// add(l2); 
	
	p1=new JPasswordField("Enter Password");
	p1.setSize(300,50);
	p1.setLocation(365,425);
	 p1.setFont(f2);
	 p1.setOpaque(false);
	   p1.setForeground(Color.gray);
      p1.setEchoChar((char)0);
	p1.setBorder(null);
	add(p1);
	p1.addKeyListener(this);
	
		c1=new JCheckBox("Showpassword");
	c1.setBounds(302,490,200,20);
	c1.setForeground(Color.gray);
	c1.setOpaque(false);
	 c1.setFont(f22);
	add(c1);
    c1.addItemListener(this);	
	
	b3=new JButton("Forgetpassword?");
	b3.setBounds(525,490,200,20);
	b3.setForeground(Color.gray);
		b3.setOpaque(false);
	b3.setContentAreaFilled(false);
	b3.setBorderPainted(false);
	 b3.setFont(f22);
	
	add(b3);
	b3.addActionListener(f);
	
	
		img1=new ImageIcon("back1.png");
		b1=new JButton(img1);
	b1.setBounds(10,10,100,45); 
	add(b1);	
	
	b2=new JButton("LOGIN");
	b2.setSize(245,55);
	//b2.setBackground(Color.yellow);
	
	b2.setOpaque(false);
	b2.setContentAreaFilled(false);
	b2.setBorderPainted(false);
		 b2.setFont(f2);
		  b2.setForeground(Color.black);
	b2.setLocation(375,590);
	add(b2);
	
	
	 b1.addActionListener(f);
	 b2.addActionListener(f);
	
	 }
	 
	 
	 
	 	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	g.drawImage(ll,0,0,this);
	g.drawImage(logini,390,85,this);
	g.drawImage(loginii,305,305,this);

}
	 
	 
	 
	 
	 
	 
      public void itemStateChanged(ItemEvent e)
		  {
			  if(c1.isSelected())
			  {
				  
				 p1.setEchoChar((char)0);  
				  }
				  else
				  {
					p1.setEchoChar('*');
				  }
			  } 
			 
		  
		  
		  	 public void keyReleased(KeyEvent e1)
			 {
	
				 
				  if(t1.isFocusOwner())
				 {
				 String s1=t1.getText().trim();
				 
				if(s1.equals(""))
				 {
					 t1.setText("Enter Name");
					 t1.setForeground(Color.gray);
				 }
				 
				 }
			 



	             if(p1.isFocusOwner())
				 {
				 String s1=p1.getText().trim();
				if(s1.equals(""))
				 {
					 p1.setText("Enter Password");
					 p1.setForeground(Color.gray);
					 p1.setEchoChar((char)0);
				 }
				 }
			 }
			 
		  public void keyPressed(KeyEvent e1)
		  {
				  if(t1.isFocusOwner())
				 {
				 String s1=t1.getText();
			    if(s1.equals("Enter Name"))
				 {
					 t1.setText("");
					 t1.setForeground(Color.white);
				 }
				 
				 }
				 
				  if(p1.isFocusOwner())
				 {
				 String s1=p1.getText();
			   if(s1.equals("Enter Password"))
				{
					 p1.setText("");
					 p1.setForeground(Color.white);
					 p1.setEchoChar('*');
				 }
		  }

		// this.keyReleased(e1);
		  }
		  
		  public void keyTyped(KeyEvent e1)
		  {
			  
		  }
		  
		  
		  
		  
		  
	
	
}
 