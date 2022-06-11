import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class result extends JPanel implements ActionListener
{

	  
      static  JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9;
	    JButton b2,b3; 
	  ImageIcon img2,img3;
	  Image resultb,resulti;
	Fdemo f1;
	result(Fdemo f)
	 {
		 f1=f;
		setLayout(null);
	Font f2=new Font("Arial Black",Font.BOLD,35);
	setFont(f2);
	
	Font f21=new Font("Bahnschrift Condensed",Font.BOLD,25);
	setFont(f21);
	
	img2=new ImageIcon("resultb.jpg");
           resultb=img2.getImage();
		   
		   img3=new ImageIcon("resulti.png");
           resulti=img3.getImage();
	
	
	   //label
	l=new JLabel("RESULT");
	l.setSize(400,50);
	l.setLocation(390,220);
    l.setFont(f2);
	l.setForeground(Color.white);
	add(l);
	
	
	
	l1=new JLabel();//"Course Name:"

	l1.setBounds(280,290,400,50);
    l1.setFont(f21);
	l1.setForeground(Color.white);
	add(l1);
	
	l2=new JLabel();//"Time Taken:"
	l2.setBounds(280,350,400,50);
    l2.setFont(f21);
	l2.setForeground(Color.white);
	add(l2);
	
	
		l3=new JLabel();//"Total Question:"
	l3.setBounds(280,410,400,50);
    l3.setFont(f21);
	l3.setForeground(Color.white);
	add(l3);
	
	
		l4=new JLabel();//"Attempted Questions:"
	l4.setBounds(270,470,400,50);
    l4.setFont(f21);
	l4.setForeground(Color.white);
	add(l4);
	
	
		l5=new JLabel();//"Correct Questions:"
	l5.setBounds(280,530,400,50);
    l5.setFont(f21);
	l5.setForeground(Color.white);
	add(l5);
	
		l6=new JLabel();//"Wrong Questions:"
	l6.setBounds(280,590,400,50);
    l6.setFont(f21);
	l6.setForeground(Color.white);
	add(l6);
	
		l7=new JLabel();//"Marks Obtained:"
	l7.setBounds(280,650,400,50);
    l7.setFont(f21);
	l7.setForeground(Color.white);
	add(l7);
	
		l8=new JLabel();//"Total Marks:"
	l8.setBounds(280,710,400,50);
    l8.setFont(f21);
	l8.setForeground(Color.white);
	add(l8);
	
	
		l9=new JLabel();//"Percentage:"
	l9.setBounds(280,770,400,50);
    l9.setFont(f21);
	l9.setForeground(Color.white);
	add(l9);
	
	
	
	
		// img1=new ImageIcon("back1.png");
		// b1=new JButton(img1);
	// b1.setBounds(10,10,100,45); 
	// add(b1);	
	
	b2=new JButton();// save
	b2.setSize(150,50);
	b2.setLocation(720,850);
	b2.setOpaque(false);
	b2.setContentAreaFilled(false);
	b2.setBorderPainted(false);
	add(b2);
	
	b3=new JButton();
	b3.setSize(150,50);
	b3.setLocation(105,855);
	b3.setOpaque(false);
	b3.setContentAreaFilled(false);
	b3.setBorderPainted(false);
	add(b3);
	
	
	
	
	//b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);

	
	 }
	 
	 
	 	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	g.drawImage(resultb,0,0,this);
		g.drawImage(resulti,360,0,this);
	
}

public void actionPerformed(ActionEvent e)
{
	 
	if(e.getSource()==b2)
	{
		
	   try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();

	 
			
st.executeUpdate("insert into result values('"+examstart.s11+"','"+examstart.time+"','"+Exam.n+"','"+Exam.at+"','"+examstart.cor+"','"+examstart.w+"','"+examstart.mo+"','"+examstart.tm+"',round('"+examstart.p+"',2),'"+welcome.user_name+"')");
		
		
		
			f1.card.show(f1.c,"welcome");
			JOptionPane.showMessageDialog(null,"Result saved ","RESULT",JOptionPane.PLAIN_MESSAGE);
			con.close();
			
	l1.setText(" ");
	l2.setText(" ");
	l3.setText(" ");
	l4.setText(" ");
	l5.setText(" ");
	l6.setText(" ");
	l7.setText(" ");
	l8.setText(" ");
	l9.setText(" ");
			
	   }
	   
	    catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
	
	}
	
	
	if(e.getSource()==b3)
	{
		  f1.card.show(f1.c,"welcome");
     l1.setText(" ");
	l2.setText(" ");
	l3.setText(" ");
	l4.setText(" ");
	l5.setText(" ");
	l6.setText(" ");
	l7.setText(" ");
	l8.setText(" ");
	l9.setText(" ");
	
		  
		  
	}
	
	 
	 
}	
}