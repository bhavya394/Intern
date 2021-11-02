import java.sql.*;

import java.util.*;
public class Insertion_Data {
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
		  //Statement stmt=con.createStatement();
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter number of records to be inserted : ");
		  
		  int n=sc.nextInt();
		  for(int i=0;i<n;i++)
		  {
		  
		  System.out.println("Enter  Movie Name:");
		  String name=sc.next();
		  
		  System.out.println("Enter Hero Name:");
		  String heroname=sc.next();
		  
		  System.out.println("Enter HeroIn Name: ");
		  String heroinname=sc.next();
		  
		  System.out.println("Enter year : ");
		  String year=sc.next();
		  
		  System.out.println("Enter Director name: ");
		  String directorname=sc.next();
		  
		    PreparedStatement pstmt=con.prepareStatement("insert into Movies values(?,?,?,?,?)");
		    pstmt.setString(1,name);
		    pstmt.setString(2,heroname);
		    pstmt.setString(3,heroinname);
		    pstmt.setString(4,year);
		    pstmt.setString(5,directorname);
		    //pstmt.setString(2,name);
		    
		    pstmt.executeUpdate();
		    System.out.println("rowsaffected");
		  	}
		  con.close();

	}
}
