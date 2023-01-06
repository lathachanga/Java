package oop.all;
class Account extends Bank{
	public void cal_Bal(){
		
	}
	private int acc_Id;
	private String acc_Name;
	private double acc_Amt;
	public void setAcc_Id(int id){
		this.acc_Id=id;
	}
	public int getAcc_Id(){
		return acc_Id;
	}
	
	public void setAcc_Name(String name){
		this.acc_Name=name;
	}
	public String getAcc_Name(){
		return acc_Name;
	}
	
	public void setAcc_Amt(double amt){
		this.acc_Amt=amt;
	}
	public double getAcc_Amt(){
		return acc_Amt;
	}
}