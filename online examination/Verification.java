import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


class Verification extends JPanel implements ActionListener
{ // static int x;
  // static String sub_name;
	JButton b1,b2,b3,b4;
	static JComboBox cb1;
	JLabel l1,l2;
	 ImageIcon img1,img2,img8;
	  Image back1,veri,adminpb;
	
	 Fdemo f1;
	Verification(Fdemo f)
	 {
		 f1=f;
//System.out.println("simiiiiiijainnnn"+sub_name);
		setLayout(null);
	Font f2=new Font("Arial Black",Font.BOLD,21);
	setFont(f2);
	Font f21=new Font("Arial Black",Font.BOLD,35);
	setFont(f21);
	Font f22=new Font("Arial Black",Font.BOLD,18);
	setFont(f22);
	
	
		img8=new ImageIcon("adminpb.jpg");
	adminpb=img8.getImage();
	
	
	img2=new ImageIcon("veri.png");
	veri=img2.getImage();
	
	
	l1=new JLabel("VERIFICATION");
	l1.setBounds(330,20,500,50);
	l1.setForeground(Color.black);
	l1.setFont(f21);
	add(l1);
	
	
	
		l2=new JLabel("User for verification:-");
	l2.setBounds(60,380,300,50);
	l2.setFont(f2);
	l2.setForeground(Color.black);
	add(l2);
	
		
		  cb1=new JComboBox();
	      //cb1.addItem();
          cb1.setBounds(350,380,250,50);
		  cb1.setFont(f22);
	    add(cb1);
	
	img1=new ImageIcon("back1.png");
	b1=new JButton(img1);
	b1.setBounds(10,10,100,45); 
	add(b1);
	
	b2=new JButton("details");
	b2.setBounds(650,380,200,50);
		b2.setBackground(Color.black);
	b2.setFont(f22);
	b2.setForeground(Color.white);
	add(b2);
	
	b3=new JButton("verify");
	b3.setBounds(400,520,150,50);
		b3.setBackground(Color.black);
	b3.setFont(f22);
	b3.setForeground(Color.white);
	add(b3);
	
	
	b4=new JButton("delete");
	b4.setBounds(400,620,150,50);
		b4.setBackground(Color.black);
	b4.setFont(f22);
	b4.setForeground(Color.white);
	add(b4);
	
	b1.addActionListener(f);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	cb1.addActionListener(this);
	
	
	

	 }
	 
	 public void paintComponent(Graphics g)
	 	{
		super.paintComponent(g);
	g.drawImage(adminpb,0,0,this);
	g.drawImage(veri,360,85,this);
	
	
}

	 
	 
	 
	 public void actionPerformed(ActionEvent e)
    {       
	
	    // System.out.println("naman");
		
		    String s1=(String)cb1.getSelectedItem();
	     String vs="Verify";
	  
		 
		 if(e.getSource()==b3)
		 {
			  
			  String s2="Verified";
			 //Details.ver_name=s1;
			 //Details d=new Details(f1);
			 //d.actionPerformed(e);
			   try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();


          
    int x=st.executeUpdate("Update user_regislog set Verification='"+s2+"' where UserName='"+s1+"' ");
		 
			    JOptionPane.showMessageDialog(null," User Verified");
			   cb1.removeAllItems();
					
  ResultSet rs=	st.executeQuery("select UserName from user_regislog where Verification='"+vs+"' ");
	while(rs.next())
	{          
      String vs1=rs.getString("UserName");
		  cb1.addItem(vs1); 
	}
	
		 	con.close();

	   }
	   
	     catch(Exception e1)
	   {
		   System.out.println(e1);
       }
}
	    
	  if(e.getSource()==b4)
	  {   
            //s1=(String)cb1.getSelectedItem();
			//String s22="Verify";
			// Details d=new Details(f1);
			 //d.actionPerformed(e);
			
		    try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();


   st.executeUpdate("delete  from   user_regislog where UserName='"+s1+"' AND Verification='"+vs+"' ");
			    JOptionPane.showMessageDialog(null," User Delete");
		           cb1.removeAllItems();
			   //this.actionPerformed(e);
			   		
  ResultSet rs=	st.executeQuery("select UserName from user_regislog where Verification='"+vs+"' ");
	while(rs.next())
	{          
      String vs1=rs.getString("UserName");
		  cb1.addItem(vs1); 
	}
			   
	
		 	con.close();

		

	   }
	   
	     catch(Exception e1)
	   {
		   System.out.println(e1);
       }



	  }	

if(e.getSource()==b2)
{
	  s1=(String)cb1.getSelectedItem();
			f1.card.show(f1.c,"Details");
	     System.out.println("naman"+s1);
			 
	  // // String s1="Verify";
	     // String s2=Details.l2.getText();
	    // String s3=Details.l3.getText();
	    // String s4=Details.l4.getText();
	    // String s5=Details.l5.getText();
	     // String s6=Details.l6.getText();
	     // String s7=Details.l7.getText();
	    // String s8=Details.l8.getText();
	    // String s9=Details.l9.getText();
	     // String s10=Details.l10.getText();
	     // String s11=Details.l11.getText();
				 
	   try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
ResultSet rs=st.executeQuery("Select * from user_regislog where Verification='"+vs+"' AND UserName='"+s1+"'");
			
			if(rs.next())
			{

	           Details. l2.setText("Registation No.  :- "+rs.getString(1));
	           Details. l3.setText("Registation Date :-  "+rs.getString(2));
	           Details. l4.setText("Registation Time :-  "+rs.getString(3));
	           Details. l5.setText("UserName           :-  "+rs.getString(4));
	           Details. l6.setText("Password            :-  "+rs.getString(5));
	           Details. l7.setText("Email                  :-  "+rs.getString(6));
	           Details. l8.setText("Contact No.         :-  "+rs.getString(7));
	           Details. l9.setText("Address               :-  "+rs.getString(8));
	           Details. l10.setText("D.O.B                 :-  "+rs.getString(9));
	           Details. l11.setText("Gender               :-  "+rs.getString(10));
			}
	   
			
			con.close();
	   }
	   
	    catch(Exception e1)
	   {
		   System.out.println(e1);
	   }


	 
	 }

}	
	
	 }
	 
	 
	 