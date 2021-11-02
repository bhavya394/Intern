import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Retrieve 
{

		public static void main(String args[]) throws Exception{
		    String url ="jdbc:oracle:thin:@localhost:1521:XE";
		    String uname="bhavya";
		    String pass="bhavya";
		    String query="select * from mcrew";
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    Connection con=DriverManager.getConnection(url,uname,pass);
		    Statement st=con.createStatement();
		    ResultSet rs=st.executeQuery(query);
		    while(rs.next())
		         System.out.println(rs.getString(1)+"-"+rs.getString(2)+"-"+rs.getString(3));
		    st.close();
		    con.close();
		}
	}


