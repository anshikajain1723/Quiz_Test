import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;

class menudemo extends JPanel
{
	JTabbedPane tp;
	InsertDemo id;
	 SearchDemo sd;
	UpdateDemo ud;
    ShowDemo shd;
	 DeleteDemo dd;
	menudemo()
	{
       setLayout(new BorderLayout());
	   tp=new JTabbedPane();
       id=new InsertDemo();
	   tp.add("Insert",id);
	   
	   sd=new SearchDemo ();
	   tp.add("Search",sd);
	   
	    ud=new UpdateDemo();
	    tp.add("Update",ud);
	   
	   shd=new ShowDemo();
	   tp.add("show",shd);
	   
	   dd=new DeleteDemo();
	   tp.add("Delete",dd);
		add(tp);
	}
}


class InsertDemo extends JPanel implements ActionListener
{
	JLabel u1,u2,u3,u4,u5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1;
	
	 InsertDemo()
	 {
		 setLayout(null);
		 u1=new JLabel("Enter Roll No.");
		 u1.setBounds(100,40,100,100);
		 add(u1);
		 
		 
		 t1=new JTextField(10);
		 t1.setBounds(250,70,120,30);
		 add(t1); 
		 
		 u2=new JLabel("Enter Name");
		 u2.setBounds(100,100,100,100);
		 add(u2);
		 
		 
		 t2=new JTextField(10);
		 t2.setBounds(250,130,120,30);
		 add(t2);

		 u3=new JLabel("Physics Marks");
		 u3.setBounds(100,160,100,100);
		 add(u3);
		 
		 
		 t3=new JTextField(10);
		 t3.setBounds(250,190,120,30);
		 add(t3); 
		 
		 u4=new JLabel("Chemistry Marks");
		 u4.setBounds(100,220,100,100);
		 add(u4);
		 
		 
		 t4=new JTextField(10);
		 t4.setBounds(250,250,120,30);
		 add(t4);

		 u5=new JLabel("Maths Marks");
		 u5.setBounds(100,280,100,100);
		 add(u5);
		 
		 
		 t5=new JTextField(10);
		 t5.setBounds(250,310,120,30);
		 add(t5);
		 
		 b1=new JButton("Insert");
		 b1.setBounds(250,390,120,30);
		 add(b1);
   
   b1.addActionListener(this);
	 }
   public void actionPerformed(ActionEvent e)
   {
	   String s1=t1.getText();
	   String s2=t2.getText();
	   String s3=t3.getText();
	   String s4=t4.getText();
	   String s5=t5.getText();
	
		 if(s1.length()>0&&s2.length()>0&&s3.length()>0&&s4.length()>0&&s5.length()>0)
		 {			 
	   try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
	st.executeUpdate("insert into ins values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
	JOptionPane.showMessageDialog(null,"data insert");
	
	con.close();
	
	t1.setText(" ");
	t2.setText(" ");
	t3.setText(" ");
	t4.setText(" ");
	t5.setText(" ");
	 }
	   catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
		 }else
		 {
			 JOptionPane.showMessageDialog(null,"please insert data");
		 }			 
	}  
	   
   }
		
 
	



class SearchDemo extends JPanel implements ActionListener
{
	JLabel u1,u2,u3,u4,u5;
	JTextField t1,t2,t3,t4,t5;
		JButton b1,b2;
		
		SearchDemo()
		{
			setLayout(null);
		 u1=new JLabel("Enter Roll No.");
		 u1.setBounds(100,40,100,100);
		 add(u1);
		 
		  t1=new JTextField(10);
		 t1.setBounds(250,70,120,30);
		 add(t1); 
		 
		  b1=new JButton("Search");
		 b1.setBounds(400,70,120,30);
		 add(b1);
		 
		  u2=new JLabel("Enter Name");
		 u2.setBounds(100,100,100,100);
		 add(u2);
		 
		 
		 t2=new JTextField(10);
		 t2.setBounds(250,130,120,30);
		 add(t2);

		 u3=new JLabel("Physics Marks");
		 u3.setBounds(100,160,100,100);
		 add(u3);
		 
		 
		 t3=new JTextField(10);
		 t3.setBounds(250,190,120,30);
		 add(t3); 
		 
		 u4=new JLabel("Chemistry Marks");
		 u4.setBounds(100,220,100,100);
		 add(u4);
		 
		 
		 t4=new JTextField(10);
		 t4.setBounds(250,250,120,30);
		 add(t4);

		 u5=new JLabel("Maths Marks");
		 u5.setBounds(100,280,100,100);
		 add(u5);
		 
		 
		 t5=new JTextField(10);
		 t5.setBounds(250,310,120,30);
		 add(t5);
		 
		 b2=new JButton("Update");
		 b2.setBounds(250,390,120,30);
		 add(b2);
		 
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 
		}
		
		  public void actionPerformed(ActionEvent e)
   {
	   String s1=t1.getText();
	    String s2;
	   String s3;
	   String s4;
	   String s5;
	   
	   if(e.getSource()==b1)
	   {
	    s2=t2.getText();
	    s3=t3.getText();
	    s4=t4.getText();
	    s5=t5.getText();
	
				 
	   try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery("Select * from ins where rollno='"+s1+"' ");
			
			if(rs.next())
			{
			  	t2.setText(rs.getString(2));
	            t3.setText(rs.getString(3));
	            t4.setText(rs.getString(4));
	            t5.setText(rs.getString(5));
			}
			
			else
			{
				 JOptionPane.showMessageDialog(null," data not found");
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
	    s2=t2.getText();
	    s3=t3.getText();
	    s4=t4.getText();
	    s5=t5.getText(); 


       try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();

          
    int x=st.executeUpdate("Update ins set name='"+s2+"',phy='"+s3+"',chem='"+s4+"',math='"+s4+"'  where rollno= '"+s1+"' ");
		  
		  if(x>0)
		  {
			   JOptionPane.showMessageDialog(null," data Update");
			   
	t2.setText(" ");
	t3.setText(" ");
	t4.setText(" ");
	t5.setText(" ");
		  }
		  
		  else{
			   JOptionPane.showMessageDialog(null," data not Update");
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
  



class  UpdateDemo extends JPanel
{
	
	    JLabel u1;
		JTextField t1;
		JButton b1;
	UpdateDemo()
	{
		setLayout(null);
		 u1=new JLabel("Enter Roll No.");
		 u1.setBounds(100,40,100,100);
		 add(u1);
		 
		  t1=new JTextField(10);
		 t1.setBounds(250,70,120,30);
		 add(t1); 
		 
		  b1=new JButton("Update");
		 b1.setBounds(250,150,120,30);
		 add(b1);
    }
}

class ShowDemo  extends JPanel
{
	ShowDemo()
	{
		
	}
	
}

class DeleteDemo extends JPanel
{
	
	  JLabel u1;
		JTextField t1;
		JButton b1;
	DeleteDemo()
	{
		setLayout(null);
		 u1=new JLabel("Enter Roll No.");
		 u1.setBounds(100,40,100,100);
		 add(u1);
		 
		  t1=new JTextField(10);
		 t1.setBounds(250,70,120,30);
		 add(t1); 
		 
		  b1=new JButton("Delete");
		 b1.setBounds(250,150,120,30);
		 add(b1);
	}
}