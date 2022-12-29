class Test{
	public static void main(String args[]){
		int num=50;
		if(num<=1){
			System.out.println("0");
			//return 0;
		}
		else{
			int div=2;
			while(div<num){
				if(num%div!=0){
					div++;
				}
				else{
					num = num/div;
					//div=2;
					
				}
			}
			System.out.println(num);
			//return num;
		}
	}
}
class Large{
	public static void main(String args[]){
		int num=50;
		num=num/2;
		System.out.println(num);
	}
}