package JDBCConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class JdbcDemo2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Srilatha@123");
		    Statement st=con.createStatement();
		    st.executeUpdate("insert into college values(111,'Srilatha',98,'pass')");
		    st.executeUpdate("insert into college values(112,'Joshna',98,'pass')");
		    st.executeUpdate("insert into college values(113,'Monica',98,'pass')");
		    st.executeUpdate("insert into college values(114,'Jaya',98,'pass')");
		    st.executeUpdate("insert into college values(115,'Sandhya',98,'pass')");
		    System.out.println("Table created successfully"); 
		}
		catch(Exception e) { 
			System.out.println(e);
		}
		
		

	}

}
