class InsufficientFundException extends Exception{
	InsufficientFundException(String message){
		super(message);
	}
}
class Account{
	public void withdraw() throws InsufficientFundException{
		int amt=1400;
		if(amt<500){
			try{
				throw new InsufficientFundException("No Money");
			}
			catch(Exception e){
				
			}
		}
		else{
			System.out.println("Enjoy");
		}
	}
	public static void main(String arrgs[]){
		Account a=new Account();
		a.withdraw();
	}
}