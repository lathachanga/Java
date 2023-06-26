class Exception{
	public static void main(String args[]){
		try{
			throw 10;
		}
		catch(int e){
			System.out.println("got "+e);
		}
	}
}