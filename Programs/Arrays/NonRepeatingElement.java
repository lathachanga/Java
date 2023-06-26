public class NonRepeatingElement{
	static void repeating(int a[]){
		boolean b;
		for(int i=0;i<a.length;i++){
			b=false;
			for(int j=0;j<a.length;j++){
				if(i!=j&&a[i]==a[j]){
					b=true;
					break;
				}
			}
			if(b==false){
				System.out.println(a[i]+" ");
			}
		}
	}
	public static void main(String args[]){
		int a[]={2,5,3,8,2,5,7,8,9};
		System.out.println("Non Repeating elements are:");
		repeating(a);
	}
}