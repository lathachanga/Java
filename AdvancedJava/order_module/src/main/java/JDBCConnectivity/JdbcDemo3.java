package JDBCConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JdbcDemo3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Srilatha@123");
		    Statement st=con.createStatement();
		    ResultSet rs= st.executeQuery("select * from college");
		     int id;
		     String name;
		     int marks;
		     String res;
		     while(rs.next()) {
		    	 id=rs.getInt("sid");
		    	 name=rs.getString("sname");
		    	 marks=rs.getInt("marks");
		    	 res=rs.getString("result");
		    	 System.out.println("student id is:"+id+"  student name is:"+name+" marks are :"+marks+" and the test result is:"+res);
		     }
		    
		}
		catch(Exception e) { 
			System.out.println(e);
		}
		
		

	}

}
