package Exceptions;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class SqlException
{
	
	public static String query="select * from employee";
	public static void main(String args[])
	{
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String userid="admin";
		String password="admin";
		Connection con=DriverManager.getConnection(userid);
		
		PreparedStatement ps=con.prepareStatement(query);
		String email="r@gmail.com";
		ps.setString(1,email);
		}
		catch(Exception e)
		{
	
		}
	}
}
	
