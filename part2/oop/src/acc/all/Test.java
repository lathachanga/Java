package acc.all;
public class Test {

	public static void main(String[] args) {
		SA a1=new SA();
		a1.setAcc_Id(101);
		a1.setAcc_Name("Joshna");
		a1.setAcc_Amt(50000.00);
		a1.setMin_Bal(500.00);
		//double tot=a1.cal_Bal();
		//System.out.println(tot);
		Account_Service.get_Account(a1);
		
		CA a2=new CA();
		a2.setAcc_Id(102);
		a2.setAcc_Name("sowmya");
		a2.setAcc_Amt(45000.00);
		a2.setMin_Bal(5000.00);
		//double total=a2.cal_Bal();
		//System.out.println(total);
		Account_Service.get_Account(a2);
	}

}

