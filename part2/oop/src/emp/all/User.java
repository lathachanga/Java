package emp.all;
public class User extends Employee {
	public void cal_NetSal() {};
private int user_id;
private String user_Name;
private String user_Dept;

public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getUser_Name() {
	return user_Name;
}

public String getUser_Dept() {
	return user_Dept;
}
public void setUser_Dept(String user_Dept) {
	this.user_Dept = user_Dept; 
}
public void setUser_Name(String user_Name) {
	this.user_Name = user_Name;
}


}
