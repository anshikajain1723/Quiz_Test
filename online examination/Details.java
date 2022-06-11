import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Details extends JPanel //implements ActionListener
{
	
	  ImageIcon img1,img2;
	  Image background;
	  
	
   static JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
   JButton b1;                                  //global
 
//static String ver_name;
   
   Details(Fdemo f)
{
    setLayout(null);
	Font f1=new Font("Arial Black",Font.BOLD,40);
	setFont(f1);
	   
	   img2=new ImageIcon("adminuser.png");
	background=img2.getImage();
	   
	l1=new JLabel("USER DETAILS");
	l1.setBounds(300,20,400,50);
	l1.setFont(f1);
	add(l1);
	

	Font f2=new Font("Arial Black",Font.BOLD,20);
	setFont(f2);
	
	//l2=new JLabel("Registation No. :-  ");
	l2=new JLabel();
	l2.setBounds(220,140,500,50);
	l2.setFont(f2);
	add(l2);

	l3=new JLabel();
	l3.setBounds(220,190,500,50);
	l3.setFont(f2);
	add(l3);
	
	l4=new JLabel();
	l4.setBounds(220,240,500,50);
	//l3.setForeground(Color.red);
	l4.setFont(f2);
	add(l4);
	
		l5=new JLabel();
	l5.setBounds(220,290,500,50);
	//l3.setForeground(Color.red);
	l5.setFont(f2);
	add(l5);
	
		l6=new JLabel();
	l6.setBounds(220,340,500,50);
	//l3.setForeground(Color.red);
	l6.setFont(f2);
	add(l6);
	
		l7=new JLabel();
	l7.setBounds(220,390,700,50);
	//l3.setForeground(Color.red);
	l7.setFont(f2);
	add(l7);
	
		l8=new JLabel();
	l8.setBounds(220,440,500,50);
	//l3.setForeground(Color.red);
	l8.setFont(f2);
	add(l8);
	
		l9=new JLabel();
	l9.setBounds(220,490,700,50);
	//l3.setForeground(Color.red);
	l9.setFont(f2);
	add(l9);
	
		l10=new JLabel();
	l10.setBounds(220,540,500,50);
	//l3.setForeground(Color.red);
	l10.setFont(f2);
	add(l10);
	
		l11=new JLabel();
	l11.setBounds(220,590,500,50);
	//l3.setForeground(Color.red);
	l11.setFont(f2);
	add(l11);

	
	
  	img1=new ImageIcon("back1.png");
		b1=new JButton(img1);
	b1.setBounds(10,10,100,45); 
	add(b1);
	b1.addActionListener(f);
	
	
	
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


// public void actionPerformed(ActionEvent e)
// {
	
	     // System.out.println("naman"+ver_name);
	  
	    // String s1="Verify";
	     // String s2=l2.getText();
	    // String s3=l3.getText();
	    // String s4=l4.getText();//////////////// JTextField t3,t4,t5,t6,t7;
	    // String s5=l5.getText();////////////////JTextArea t2;
	     // String s6=l6.getText();
	     // String s7=l7.getText();
	    // String s8=l8.getText();
	    // String s9=l9.getText();
	     // String s10=l10.getText();
	     // String s11=l11.getText();
				 
	   // try
	   // {
		 // Class.forName("com.mysql.cj.jdbc.Driver");
			
			// String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			// String db_uname="root";
			// String db_upass="simi";
			
			// Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			// Statement st=con.createStatement();
			
// ResultSet rs=st.executeQuery("Select * from user_regislog Verification='"+s1+"' where UserName='"+ver_name+"'");
			
			// if(rs.next())
			// {

	            // l2.setText("Registation No. :-  "+rs.getString(1));
	            // l3.setText("Registation Date :-  "+rs.getString(2));
	            // l4.setText("Registation Time :-  "+rs.getString(3));
	            // l5.setText("UserName :-  "+rs.getString(4));
	            // l6.setText("Password :-  "+rs.getString(5));
	            // l7.setText("Email :-  "+rs.getString(6));
	            // l8.setText("Contact No. :-  "+rs.getString(7));
	            // l9.setText("Address :-  "+rs.getString(8));
	            // l10.setText("D.O.B :-  "+rs.getString(9));
	            // l11.setText("Gender :-  "+rs.getString(10));
			// }
	   
			
			// con.close();
	   // }
	   
	    // catch(Exception e1)
	   // {
		   // System.out.println(e1);
	   // }


	 
	 // }

}
