package oop.all;
class SA extends Account{
	private double min_Bal;
	public void setMin_Bal(int bal){
		this.min_Bal=bal
	}
	public double getMin_Bal(){
		return min_Bal;
	}
	public void cal_Bal(){
		double balance=getAcc_Amt();
		balance=balance-getMin_Bal();
		System.out.println(getAcc_Name+":"+"Balance"+balance);
	}
}