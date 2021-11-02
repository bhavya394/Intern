import java.sql.*;
public class RetriveData {
	public static void main(String args[]) throws Exception{
	    String url ="jdbc:oracle:thin:@localhost:1521:XE";
	    String uname="system";
	    String pass="manager";
	    String query="select * from Movies";
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection(url,uname,pass);
	    Statement st=con.createStatement();
	    ResultSet rs=st.executeQuery(query);
	    while(rs.next())
	         System.out.println(rs.getString(1)+"-"+rs.getString(2)+"-"+rs.getString(3)+"-"+rs.getString(4)+"-"+rs.getString(5));
	    st.close();
	    con.close();
	}
}

