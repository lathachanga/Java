package com.all;

public class CA extends Account{
private double min_Bal;
public double getMin_Bal() {
	return min_Bal;
}
public void setMin_Bal(double min_Bal) {
	this.min_Bal = min_Bal;
}
public void cal_Bal() {
	double balance=getAcc_Amt();
	balance=balance-getMin_Bal();
	System.out.println(getAcc_Name()+":"+"Balance:"+balance);
}
}
