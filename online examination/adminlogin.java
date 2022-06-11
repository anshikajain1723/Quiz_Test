import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class adminlogin extends JPanel implements ActionListener
{
	JLabel l1,l2,l3;
	 JTextField t1; 
	 JPasswordField p1;
	    JButton b1,b2; 
		 JCheckBox c1;
      int i=1;
	  ImageIcon img1,img2;
	  Image back1,jj;
	
	adminlogin (Fdemo f)
	 {
		setLayout(null);
	Font f2=new Font("Arial Black",Font.BOLD,35);
	setFont(f2);
	
	Font f22=new Font("Arial Black",Font.BOLD,30);
	setFont(f22);
	Font f21=new Font("Arial Black",Font.BOLD,25);
	setFont(f21);
	
	
	
	img2=new ImageIcon("jj.jpg");	
        	jj=img2.getImage();
	
	
	
	   //label
	   
	   
	  	l3=new JLabel("ADMIN LOGIN");
	l3.setSize(500,50);
	l3.setLocation(350,25);
    l3.setFont(f2);
	l3.setForeground(Color.white);
	add(l3); 
	   
	// l1=new JLabel("Enter Name");
	// l1.setSize(180,50);
	// l1.setLocation(100,145);
    // l1.setFont(f22);
	// add(l1);
	
	t1=new JTextField(10);
	t1.setSize(498,85);
	t1.setOpaque(false);
	t1.setLocation(290,373);
	t1.setForeground(Color.white);
	t1.setBorder(null);
	t1.setFont(f22);
	add(t1);
	

	
	// l2=new JLabel("Enter Password");
	// l2.setSize(180,50);
	// l2.setLocation(100,450);
    // l2.setFont(f2);
	// add(l2); 
	
	p1=new JPasswordField(10);
	p1.setSize(498,85);
	p1.setLocation(290,487);
	p1.setEchoChar('*');
	p1.setForeground(Color.white);
	p1.setOpaque(false);
	p1.setBorder(null);
	p1.setFont(f22);
	add(p1);
	
		c1=new JCheckBox("Remember me");
	c1.setBounds(560,580,300,40);
     c1.setForeground(Color.black);
	 c1.setFont(f21);
	c1.setOpaque(false);
	
   c1.setFocusable(false); 

	add(c1);	
	
	
	
	
		img1=new ImageIcon("back1.png");
		b1=new JButton(img1);
	b1.setBounds(10,10,100,45); 
	add(b1);		
	
	b2=new JButton("LOGIN");
	b2.setSize(600,62);
	
	b2.setBackground(Color.gray);
	b2.setForeground(Color.black);
	b2.setLocation(200,670);
	b2.setFont(f2);
	add(b2);
	
	c1.addActionListener(this);
	b1.addActionListener(f);
	b2.addActionListener(f);
	
	 }
	 
	 
	 	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	g.drawImage(jj,0,0,this);

}
	 
	 
	 
	 
	 public void actionPerformed(ActionEvent e)
		  {
			  if(e.getSource()==c1)
			  {
				  i++;
				  if(i%2==0)
				  {
				 p1.setEchoChar((char)0);  
				  }
				  else
				  {
					p1.setEchoChar('*');
				  }
			  } 
			 
		  }
	
	
}