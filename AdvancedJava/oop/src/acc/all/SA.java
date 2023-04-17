package acc.all;
public class SA extends Account {
	  private double min_Bal;
	  public double getMin_Bal() {
		return min_Bal;
	}
	public void setMin_Bal(double min_Bal) {
		this.min_Bal = min_Bal;
	}
	public double cal_Bal(){
		 
	  double balance=getAcc_Amt();
		balance=balance-getMin_Bal();
		balance= balance+0.0;
		return balance;
		
	  }
	}