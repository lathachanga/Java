class Acc{
	int id;
	String name;
	double amt;
	public void insert(int id,String name,double amt){
		this.id=id;
		this.name=name;
		this.amt=amt;
	}
	public void deposit(double amount){
		this.amt=amt+amount;
		System.out.println(amt+"deposited");
	}
	public void withdraw(double amount){
		if(amt<amount){
			System.out.println("Insufficient balance");
		}
		else{
			this.amt=amt-amount;
			 System.out.println(amount+"Withdrawed");
		}
	}
	public void balance(){
		System.out.println(amt+"Balance");
	}
	public void details(){
		System.out.println("Id:"+this.id+" "+"Name:"+this.name+" "+"Amount"+this.amt);
	}
}
 public class Account{
	public static void main(String args[]){
		Acc a1=new Acc();
		Acc a2=new Acc();
		a1.insert(101,"Srilatha",2000);
		a1.deposit(500);
		a1.withdraw(500);
		a1.balance();
		a1.details();
		
		a2.insert(102,"Pavan",3000);
		a2.deposit(500);
		a2.withdraw(500);
		a2.balance();
		a2.details();
	}
}