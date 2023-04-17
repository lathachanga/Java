package emp.all;

public class tempry extends User{
	/*private double t_Sal;

	public double getT_Sal() {
		return t_Sal;
	}

	public void setT_Sal(double t_Sal) {
		this.t_Sal = t_Sal;
	}
	public void sal() {
		double total=getT_Sal();
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
