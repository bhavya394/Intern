import java.sql.*;

	import java.util.*;

public class insertion 
{
	
		public static void main(String[] args) throws Exception
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","bhavya","bhavya");
			  Scanner sc=new Scanner(System.in);
			  System.out.println("Enter number of records to be inserted : ");  
			  int n=sc.nextInt();
			  for(int i=0;i<n;i++)
			  {
			  System.out.println("Enter  Movie Name:");
			  String mname=sc.next();
			  System.out.println("Enter Hero Name:");
			  String mh=sc.next();
			  System.out.println("Enter HeroIn Name: ");
			  String mhe=sc.next();
			    PreparedStatement pstmt=con.prepareStatement("insert into mcrew values(?,?,?)");
			    pstmt.setString(1,mname);
			    pstmt.setString(2,mh);
			    pstmt.setString(3,mhe);
			    
			    pstmt.executeUpdate();
			    System.out.println("rowsaffected");
			  	}
			  con.close();

		}
	}


