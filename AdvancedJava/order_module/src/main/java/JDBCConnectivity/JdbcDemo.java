package JDBCConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class JdbcDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Srilatha@123");
		    Statement st=con.createStatement();
		    st.executeUpdate("create table college(sid int,sname varchar(20),marks int,result varchar(10))");
		    System.out.println("Table created successfully"); 
		}
		catch(Exception e) { 
			System.out.println(e);
		}
		
		

	}

}
