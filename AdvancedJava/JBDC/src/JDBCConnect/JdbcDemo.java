package JDBCConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		try {
			//load required driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection using DriverManager
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Srilatha@123");
			Statement st=con.createStatement();
			st.executeUpdate("create table employee(eid int,ename varchar(25),esal int)");
			System.out.println("Created successfully");
			
			
			}catch(Exception e) {
				System.out.println(e);
			
		}

	}

}
