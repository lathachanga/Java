package order_module;

import java.util.ResourceBundle;

public class Component {
   public int user_login() {
	   ResourceBundle rb=ResourceBundle.getBundle("Config");
	   String ename=rb.getString("username");
	   String epass=rb.getString("password");
	   System.out.println(ename);
	   return 1;
   }
	public static void main(String[] args) {
		Component c=new Component();
        c.user_login();
	}

}
