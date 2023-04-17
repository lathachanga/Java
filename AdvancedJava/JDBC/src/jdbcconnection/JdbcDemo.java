package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Srilatha@123");
		Statement st=connect.createStatement();
		st.executeUpdate("create table Employee(eid int,ename varchar(20),esal int)");
		System.out.println("successfull");
	}

}
