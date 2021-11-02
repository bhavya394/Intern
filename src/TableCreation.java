
import java.sql.*;
public class TableCreation 
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","bhavya","bhavya");
	    PreparedStatement pstmt=con.prepareStatement("create table mcrew(mname varchar2(50),mh varchar2(50),mhe varchar2(50))");
	    pstmt.executeUpdate();
	    con.close();
	}

}
