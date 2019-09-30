package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class ConnectMySQL {
	@Test
	public void testDB() throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium", "root", "swapnil@3");
		System.out.println("Connected to MySQl DB");

		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("select * from seleniumusers");

		while (rs.next())
       {
			String firstname = rs.getString("firstname");
			System.out.println("Database record is" + firstname);

			String email = rs.getString("email");
			System.out.println("Database record is " + email);

		}
	}

}
