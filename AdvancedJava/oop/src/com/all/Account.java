package com.all;

public class Account extends Bank {
   public void cal_Bal() {};
   private int acc_Id;
   private String acc_Name;
   private double acc_Amt;
public int getAcc_Id() {
	return acc_Id;
}
public void setAcc_Id(int acc_Id) {
	this.acc_Id = acc_Id;
}
public String getAcc_Name() {
	return acc_Name;
}
public void setAcc_Name(String acc_Name) {
	this.acc_Name = acc_Name;
}
public double getAcc_Amt() {
	return acc_Amt;
}
public void setAcc_Amt(double acc_Amt) {
	this.acc_Amt = acc_Amt;
}
   
}
