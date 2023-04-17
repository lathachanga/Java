class Palidrome{
	public static void main(String args[]){
		String name="sriltha";
		boolean flag=true;
		name=name.toLowerCase();
		for(int i=0;i<name.length()/2;i++){
			if(name.charAt(i)!=name.charAt(name.length()-i-1)){
				flag= false;
				break;
			}
		}
		if(flag){
            System.out.println("Given String is palidrome");
		}
		else{
			 System.out.println("Given String is not palidrome");
		}
	}
}