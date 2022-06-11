import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Fdemo extends JFrame implements ActionListener
{
	CardLayout card;
	Container c=getContentPane();
	onlinesys os;
	adminuser au;
	admin ad;
	adminpanel ap;
	managecourses mc;
	addcourse ac;
	Courseresult cr;
	editcourse ec;
	Homedemo hd;
	Logindemo ld;
	welcome wc;
	result res;
	Users us;
	UserEditDetails ued;
	adminlogin al;
	examstart es;
	Exam e1;
	Regisdemo rd;
	Verification vf;
	Details ds;
	Forgetpass fp;
	User_course_result ucr;
	users_result ur;
	course_result cr1;
	
	menudemo md;
	
	Fdemo()
	{
		card=new CardLayout();
		setLayout(card);
		
		os=new onlinesys(this);
		add("online",os);
		
	    au=new adminuser(this);
		add("adminuser",au);
		
		ad=new admin(this);
		add("admin",ad); 
		
		hd=new Homedemo(this);
		add("home",hd);
		
		ld=new Logindemo(this);
		add("Login",ld);
		
		wc=new welcome(this);
		add("welcome",wc);
		
		es =new examstart(this);
		add("examstart",es);

		e1=new Exam(this);
		add("Exam",e1);
		
		res=new result(this);
		add("result",res);
		
		us=new Users(this);
		add("Users",us);	
		
		ued=new UserEditDetails(this);
		add("UserEditDetails",ued);
		
		cr=new Courseresult(this);
		add("Courseresult",cr);
		
		 rd=new Regisdemo(this);
		 add("Regis",rd);	

		 vf=new Verification(this);
		 add("Verification",vf);
		 
		 ds=new Details(this);
		 add("Details",ds);
		 
		 al=new adminlogin(this);
         add("adminlogin",al);		 
		 
		  ap=new adminpanel(this);
         add("adminpanel",ap);
		 
		ucr=new User_course_result(this);
		 add("User_course_result",ucr);
		 
		 
		 	ur=new users_result(this);
		 add("users_result",ur);
		 
		 
		  	cr1=new course_result(this);
		 add("course_result",cr1);
		 
		 
		  mc=new managecourses(this);
         add("managecourses",mc);
		 
		 ac=new addcourse(this);
		 add("addcourse",ac); 
		 
		 ec=new editcourse(this);
		 add("editcourse",ec);
		 
		  fp=new Forgetpass(this);
		 add("forget",fp);
		 
		 md=new menudemo();
		 add("menu",md);
	}
	
	public void actionPerformed(ActionEvent e)
{ 
        //onlinesys----------------------------------
		
		if(e.getSource()==os.b1)
		{
			card.show(c,"adminuser");
		}
		
		
		  //User_course_result----------------------------------
		
		if(e.getSource()==ucr.b1)
		{
			card.show(c,"welcome");
			User_course_result.t1.setText("");
		}
		
		
		///users_result-------------------------------------------------------------------
		if(e.getSource()==ur.b1)
		{
			card.show(c,"Users");
			users_result.t1.setText("");
		}
		
		
		
		
		
		///course_result-------------------------------------------------------------------
		if(e.getSource()==cr1.b1)
		{
			card.show(c,"Courseresult");
			course_result.t1.setText("");
		}
		
		
		
		
		   //forgetpasss--------------------------------------------------------------------
		
		if(e.getSource()==fp.b1)
		{
			card.show(c,"Login");
		}
		
		//Courseresult---------------------------------------
		
			if(e.getSource()==cr.b1)
		{
			card.show(c,"adminpanel");
		}

           
			
		//UserEditDetails-------------------------------------------------------	
				if(e.getSource()==ued.b1)
		{
			card.show(c,"welcome");
		}

		
		
		
		

		//adminuser--------------------------------------
		if(e.getSource()==au.b1)
		{
			card.show(c,"adminlogin");
		}
		
		if(e.getSource()==au.b2)
		{
			card.show(c,"home");
		}
		
		//homedemo-------------------------------------------
		if(e.getSource()==hd.b1)
		{
			card.show(c,"Login");
		}
		
		if(e.getSource()==hd.b2)
		{
			card.show(c,"Regis");
		}
		
		if(e.getSource()==hd.b3)
		{
			card.show(c,"adminuser");
		}
		
		
		
		
		//registation---------------------------
		// if(e.getSource()==rd.b3)
		// {
			// card.show(c,"home");
		// }
		
		//verification--------------------------------------
		if(e.getSource()==vf.b1)
		{
			card.show(c,"adminpanel");
		}
		// if(e.getSource()==vf.b2)
		// {
			// card.show(c,"Details");
			////ds.actionPerformed(e);
		// }
		
		
		
		
		//details--------------------------------
		if(e.getSource()==ds.b1)
		{
			card.show(c,"adminpanel");
			ds.l2.setText("");
			ds.l3.setText("");
			ds.l4.setText("");
			ds.l5.setText("");
			ds.l6.setText("");
			ds.l7.setText("");
			ds.l8.setText("");
			ds.l9.setText("");
			ds.l10.setText("");
			ds.l11.setText("");
		}
		
		
		
		
		//welcome------------------------------------
	
		// if(e.getSource()==wc.b1)
		// {
			// card.show(c,"UserEditDetails");
				
		// }
		
			// if(e.getSource()==wc.b2)
		// {
			// card.show(c,"Exam");
		// }
		
		
		if(e.getSource()==wc.b4)
		{
			card.show(c,"Login");
			JOptionPane.showMessageDialog(null,"Logout Successfully","Logout",JOptionPane.INFORMATION_MESSAGE);
		    ld.t1.setText("");
		    ld.p1.setText("");
			// ld.p1.addKeyListener(ld);
		}
		
		
		
		
		//exam------------------------------------
	// if(e.getSource()==e1.b1)
		// {
			// card.show(c,"welcome");
		// }
		
		
		//examstart------------------------------
		
		// if(e.getSource()==es.b1)
		// {
			// card.show(c,"Exam");
		// }
		
		
		// if(e.getSource()==es.b2)
		// {
			// card.show(c,"result");
		// }
		
		//addcourse------------------------------------------------
		  
		if(e.getSource()==ac.b1)
		{
			card.show(c,"managecourses");
		}
		
		
		
//////Users----------------------------------------------	
		if(e.getSource()==us.b1)
		{
			card.show(c,"adminpanel");
		}
		
		
		
		
		
		
		
		
		//adminpanel------------------------------------
		
		if(e.getSource()==ap.b1)
		{
			card.show(c,"managecourses");
		}
		
		
		
		if(e.getSource()==ap.b2)
		{
			card.show(c,"Courseresult");
			
               try
			{
		    Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
  ResultSet rs=	st.executeQuery("select subject_name from subject ");
		Courseresult.cb1.removeAllItems();
          
	while(rs.next())
	{          
		

    String s=rs.getString("subject_name");
		  Courseresult. cb1.addItem(s);
		  
      
	}
		   
		
	          con.close();
		}
		 catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
		
			
			
		}	
			
		
		
		if(e.getSource()==ap.b3)
		{
			card.show(c,"adminuser");
			JOptionPane.showMessageDialog(null,"Logout Successfully","Logout",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(e.getSource()==ap.b4)
		{   
	          String ved="Verified";
	   try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
	
			
  ResultSet rs=	st.executeQuery("select UserName from user_regislog where Verification='"+ved+"' ");
		    Users.cb1.removeAllItems();
	while(rs.next())
	{          
      String vs1=rs.getString("UserName");
	   Users. cb1.addItem(vs1); 
	}
 }
		 
	   catch(Exception e1)
	   {
		   System.out.println(e1);
	   }  
			card.show(c,"Users");
		}
		
		
		
		
		
		if(e.getSource()==ap.b5)
		{	   
	           String vs="Verify";
	   try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
	
			
  ResultSet rs=	st.executeQuery("select UserName from user_regislog where Verification='"+vs+"' ");
		    Verification.cb1.removeAllItems();
	while(rs.next())
	{          
      String vs1=rs.getString("UserName");
	   Verification. cb1.addItem(vs1); 
	}
 }
		 
	   catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
			
			card.show(c,"Verification");
		}
		
		
			if(e.getSource()==ap.b6)
		{
			card.show(c,"adminpasswordchange");
		}
		
		//editcourse-----------------------------------
		
		if(e.getSource()==ec.b1)
		{
			card.show(c,"managecourses");
			updatequestion.t1.removeAllItems();
				updatequestion.t2.setText(" ");
	         	updatequestion.t3.setText(" ");
	        	updatequestion.t4.setText(" ");
	        	updatequestion.t5.setText(" ");
	        	updatequestion.t6.setText(" ");
	        	updatequestion.t7.setText(" ");
			
			    deletequestion.t1.removeAllItems();
				deletequestion.t2.setText(" ");
	         	deletequestion.t3.setText(" ");
	        	deletequestion.t4.setText(" ");
	             deletequestion.t5.setText(" ");
	        	deletequestion.t6.setText(" ");
	            deletequestion.t7.setText(" ");
			mc.actionPerformed(e);
			managecourses.x=0;
			
		}
		
		
		//managecourses---------------------------------
		
		if(e.getSource()==mc.b1)
		{
			card.show(c,"adminpanel");
		}
		
		
		if(e.getSource()==mc.b2)
		{
			card.show(c,"addcourse");
		}
		// if(e.getSource()==mc.b3)
		// {
			// card.show(c,"editcourse");
		// }
		
		//adminlogin-----------------------------------
		
			if(e.getSource()==al.b1)
		{
			card.show(c,"adminuser");
		}
		
		else if(e.getSource()==al.b2)
		{
		String s1=al.t1.getText();
		String s2=al.p1.getText();
		String s3="adminlogin";
			
			try
			{
						 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
          ResultSet rs=	st.executeQuery("select * from user_regislog where UserName='"+s1+"' AND Password='"+s2+"' AND Verification='"+s3+"' ");

	if(rs.next())
	{

			card.show(c,"adminpanel");
	

	}
		

	     else
			{
				JOptionPane.showMessageDialog(null,"Invalid username and password");
			}
	          con.close();
	       al.t1.setText("");
        	al.p1.setText("");
			
		}
		 catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
		}
		
		
		//result------------------------------
		
		// if(e.getSource()==res.b1)
		// {
			// card.show(c,"examstart");
		// }
		
		
		
	
		
		
		//logindemo----------------------------------------------
		if(e.getSource()==ld.b1)
		{
			//card.show(c,"home");
			card.previous(c);
			
		}
		
		
		if(e.getSource()==ld.b3)
		{
			card.show(c,"forget");
			
		}
		
		
		else if(e.getSource()==ld.b2)
		{
			String s1=ld.t1.getText();
			String s2=ld.p1.getText();
			String s3="Verified";
			wc.sp=s2;
			 System.out.println(wc.sp);
		if(s1.length()!=10&&s2.length()!=14)
		{
			try
			{
						 Class.forName("com.mysql.cj.jdbc.Driver");
			
			String db_ur1="jdbc:mysql://localhost:3306/simidb?useSSL=false";
			String db_uname="root";
			String db_upass="simi";
			
			Connection con=DriverManager.getConnection(db_ur1,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
          ResultSet rs=	st.executeQuery("select * from  user_regislog where UserName='"+s1+"' AND Password='"+s2+"' AND Verification='"+s3+"' ");

	     if(rs.next())
	    {
	       card.show(c,"welcome");
		   welcome.l1.setText("Welcome "+s1);
		   Exam.l1.setText("All The Best "+s1);
		  welcome.user_name=s1;
		  UserEditDetails.user_pass=s2;
		
	    }
		

	     else
			{
				
				int x=1;
				ResultSet rs1=st.executeQuery("Select Verification from user_regislog where UserName='"+s1+"' AND Password='"+s2+"'");
				if(rs1.next())
				{
				   x=2;   
				}
				
				if(x==2)
				{
			 
				JOptionPane.showMessageDialog(null,"verification incomplete");
				
			   }
			   if(x==1)
			   {
				   JOptionPane.showMessageDialog(null,"Invalid username and password");  
					ld.t1.setText("");
					ld.p1.setText("");
					// Fdemo f=new Fdemo();				   
		       }
			}
			//======================== 
			 
			 
	
		  
			 
			 
			 //=========================
	          con.close();
			
		}
		 catch(Exception e1)
	   {
		   System.out.println(e1);
	   }
		 }
		 
		 else
		 {
			 JOptionPane.showMessageDialog(ld.b2,"Invalid Expression");   
	        
	       	
		 }
	  }
			
}
	
}




class demo
{
	public static void main(String ar[])
	{ 
	int w=980;
	int h=1850;
		Fdemo f=new Fdemo();
        f.setVisible(true);
        // f.setSize(980,980);
        // f.setLocation(100,10);
			Toolkit t=Toolkit.getDefaultToolkit();
		Dimension d=t.getScreenSize();
    f.setBounds((d.width-w)/2,(d.width-h)/2,w,h);
       
	   Image i=t.getImage("icon.png");
	   f.setIconImage(i);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
