package JDBCConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo4 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Srilatha@123");
			Statement st=con.createStatement();
		/*	String sql = "UPDATE employee " +
		            "SET ename = 'Manasa' WHERE eid =101";*/
		    st.executeUpdate("update employee set ename='Manasa' where eid=101");
		    ResultSet rs = st.executeQuery("select * from employee");
		 //  ResultSet rs= st.executeQuery("update employee set name='Manasa' where id=101");
		//   ResultSet r= st.executeQuery("update employee set name='Manasa' where id=101");
		   int id;
		   String name;
		   int sal;
		   while(rs.next()) {
			   id=rs.getInt("eid");
			   name=rs.getString("ename");
			   sal=rs.getInt("esal");
			   System.out.println("Employee id is:"+id+" and name:"+name+"  and sal:"+sal);
		   }
		  
			}catch(Exception e) {
				System.out.println(e);
			
		}

	}

}
