package emp.all;

public class permt extends User{
/*private double p_Sal;
public double getP_Sal() {
	return p_Sal;
}
public void setP_Sal(double p_Sal) {
	this.p_Sal = p_Sal;
}
public void sal() {

	double total=getP_Sal();
	System.out.println(total);
}*/
	private double pf;
	private double tax;
	private double sal;
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public void cal_NetSal() {
		double salary=getSal();
		salary=salary-getPf();
		salary=salary-getTax();
		System.out.println("Net Salary is:"+salary);
	}


}
