package JDBCConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo6 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Srilatha@123");
			Statement st=con.createStatement();
			st.executeUpdate("drop table employee");// drop means it will delete the table 
		   System.out.println("Successfully deleted ");
		  
			}catch(Exception e) {
				System.out.println(e);
			
		}

	}

}
