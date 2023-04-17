package emp.all;

public class Test {
	public static void main(String args[]) {
		permt a=new permt();
		a.setUser_id(101);
		a.setUser_Name("Srilatha");
		a.setUser_Dept("cooking");
		a.setSal(40000);
		a.setPf(1000);
		a.setTax(2000);
		//a.cal_NetSal();
		Details.get_Details(a);
		
		tempry b=new tempry();
		b.setUser_id(101);
		b.setUser_Name("bujji");
		b.setUser_Dept("cooking");
		b.setSal(20000);
		b.setPf(0);
		b.setTax(2000);
		//b.cal_NetSal();
		Details.get_Details(b);
	}

}
