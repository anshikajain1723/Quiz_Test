import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class UserEditDetails extends JPanel implements ActionListener
{
	
	  ImageIcon img1,img2;
	  Image background;
	  
	static String user_pass;
   static JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
   JButton b1,b2;
      //JRadioButton rb1,rb2;
   //JComboBox cb1,cb2,cb3;
  // ButtonGroup bg;
   static JTextField t5,t6,t7,t8,t9;                                                               //global
 Fdemo f1;
//static String ver_name;
   
  UserEditDetails(Fdemo f)
{
	f1=f;
    setLayout(null);
	Font f1=new Font("Arial Black",Font.BOLD,40);
	setFont(f1);
	
	Font f22=new Font("Arial Black",Font.BOLD,20);
	setFont(f22);
	   
	   img2=new ImageIcon("adminuser.png");
	background=img2.getImage();
	   
	l1=new JLabel("USER DETAILS");
	l1.setBounds(300,20,400,50);
	l1.setFont(f1);
	add(l1);
	

	Font f2=new Font("Arial Black",Font.BOLD,20);
	setFont(f2);
	
	
	l2=new JLabel("Registation No.    :-");
	l2.setBounds(220,140,500,50);
	l2.setFont(f2);
	add(l2);

	l3=new JLabel("Registation Date   :-");
	l3.setBounds(220,210,500,50);
	l3.setFont(f2);
	add(l3);
	
	l4=new JLabel("Registation Time  :-");
	l4.setBounds(220,280,500,50);
	//l3.setForeground(Color.red);
	l4.setFont(f2);
	add(l4);
	
		l5=new JLabel("UserName            :- ");
	l5.setBounds(220,350,500,50);
	//l3.setForeground(Color.red);
	l5.setFont(f2);
	add(l5);
	
	
	t5=new JTextField();
	t5.setBounds(480,350,335,40);
	//l3.setForeground(Color.red);
	t5.setFont(f2);
	add(t5);
	
		l6=new JLabel("Password             :-");
	l6.setBounds(220,420,500,50);
	//l3.setForeground(Color.red);
	l6.setFont(f2);
	add(l6);
	
	
	t6=new JTextField();
	t6.setBounds(480,420,335,40);
	//l3.setForeground(Color.red);
	t6.setFont(f2);
	add(t6);
	
		l7=new JLabel("Email                   :-");
	l7.setBounds(220,490,600,50);
	//l3.setForeground(Color.red);
	l7.setFont(f2);
	add(l7);
	
	t7=new JTextField();
	t7.setBounds(480,490,335,40);
	//l3.setForeground(Color.red);
	t7.setFont(f2);
	add(t7);
	
	
		l8=new JLabel("Contact No.          :-");
	l8.setBounds(220,560,500,50);
	//l3.setForeground(Color.red);
	l8.setFont(f2);
	add(l8);
	
	
	t8=new JTextField();
	t8.setBounds(480,560,335,40);
	//l3.setForeground(Color.red);
	t8.setFont(f2);
	add(t8);
	
		l9=new JLabel("Address                :-");
	l9.setBounds(220,630,700,50);
	//l3.setForeground(Color.red);
	l9.setFont(f2);
	add(l9);
	
	t9=new JTextField();
	t9.setBounds(480,630,330,40);
	//l3.setForeground(Color.red);
	t9.setFont(f2);
	add(t9);
	
		l10=new JLabel("D.O.B                   :-");
	l10.setBounds(220,700,500,50);
	//l3.setForeground(Color.red);
	l10.setFont(f2);
	add(l10);
	
			  	//JComboBox
	// cb1=new JComboBox();
	// for(int i=1; i<=31;i++)
	// {   
        // if(i<10)
		// {
		 // cb1.addItem("0"+i);
	    // }
		// else
		// {
			// cb1.addItem(""+i);
		// }
	// }
	 // cb1.setSize(60,40);
	 // cb1.setFont(f2);
	// cb1.setLocation(480,700);
    // add(cb1);
	
	// cb2=new JComboBox();
	// for(int j=1; j<=12;j++)
	// {
		 // if(j<10)
		// {
		 // cb2.addItem("0"+j);
	    // }
		// else
		// {
		 // cb2.addItem(""+j);
		// }
	// }
	// cb2.setSize(60,40);
	// cb2.setLocation(575,700);
	// cb2.setFont(f2);
    // add(cb2);
	
	// cb3=new JComboBox();
	// for(int k=2000; k<=2021;k++)
	// {
		// cb3.addItem(k);
	// }
	 // cb3.setSize(90,40);
	 // cb3.setFont(f2);
	// cb3.setLocation(670,700);
    // add(cb3);
	
		l11=new JLabel("Gender                :-");
	l11.setBounds(220,770,500,50);
	//l3.setForeground(Color.red);
	l11.setFont(f2);
	add(l11);
	
	
	
	//JRadioButton 
    // bg=new ButtonGroup();
	// rb1=new JRadioButton ("Male");
    // rb1.setSize(100,40);
	// rb1.setFont(f2);
	// rb1.setLocation(480,770);
	
	// bg.add(rb1);
	// add(rb1);
	
	// rb2=new JRadioButton ("Female");
    // rb2.setSize(130,40);
	// rb2.setFont(f2);
	// rb2.setLocation(620,770);
	// bg.add(rb2);
	// add(rb2);

	
	
  	img1=new ImageIcon("back1.png");
		b1=new JButton(img1);
	b1.setBounds(10,10,100,45); 
	add(b1);
	b1.addActionListener(f);	
	
	b2=new JButton("EDIT");
	b2.setBounds(350,850,200,50); 
		b2.setBackground(Color.black);
	b2.setFont(f22);
	b2.setForeground(Color.white);
	add(b2);
	b2.addActionListener(this);
	
	
	
	 }
	 
 public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	    g.drawImage(background,0,0,this);
		g.drawLine(220,70,700,70);
		g.drawLine(220,71,700,71);
	    g.setColor(Color.white);
		g.drawLine(220,72,700,72);
	
} 


public void actionPerformed(ActionEvent e)
{  

if(e.getSource()==b2)
{

	   String s5=t5.getText();
	     String s6=t6.getText();
	     String s7=t7.getText();
	    String s8=t8.getText();
	    String s9=t9.getText();
		
		     
		if(s5.length()>0&&s6.length()>0&&s7.length()>0&&s8.length()>0&&s9.length()>0)
{
		  try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();


          
    int x=st.executeUpdate("Update user_regislog set UserName='"+s5+"',Password='"+s6+"',Email='"+s7+"',Contact='"+s8+"', Address='"+s9+"' where UserName='"+welcome.user_name+"' AND Password='"+user_pass+"' ");
		 
			    JOptionPane.showMessageDialog(null," data Edit Successfully");
			   f1.card.show(f1.c,"welcome");
	//System.out.println()
		 	con.close();
    //t1.setText("");
	
	
	t5.setText("");
	t6.setText("");
	t7.setText("");
	t8.setText("");
	t9.setText("");

		

	   }
	   
	     catch(Exception e1)
	   {
		   System.out.println(e1);
       }
}
	    else{
			   JOptionPane.showMessageDialog(null," Invaild expression plz fill all data");
		  }
	   }  
	   
	   
}	   
		

	 
	 }


