class InsufficientFundException extends Exception{
	InsufficientFundException(String message){
		super(message);
	}
}
class Account{
	public void withdraw() throws InsufficientFundException{
		int amt=600;
		if(amt<500){
			throw new InsufficientFundException("No Money");
		}
		else{
			System.out.println("Enjoy");
		}
	}
	public static void main(String arrgs[])throws InsufficientFundException{
		Account a=new Account();
		a.withdraw();
	}
}