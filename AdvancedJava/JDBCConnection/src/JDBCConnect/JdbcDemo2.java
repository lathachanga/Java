package JDBCConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Srilatha@123");
			Statement st=con.createStatement();
			st.executeUpdate("insert into employee values(101,'Srilatha',30000)");
			st.executeUpdate("insert into employee values(102,'Joshna',30000)");
			st.executeUpdate("insert into employee values(103,'Monica',30000)");
			st.executeUpdate("insert into employee values(104,'Jaya',30000)");
			st.executeUpdate("insert into employee values(105,'Sandhya',30000)");
			st.executeUpdate("insert into employee values(106,'Usha',30000)");
			System.out.println("Data inserted successfully");
			}catch(Exception e) {
				System.out.println(e);
			
		}

	}

}
