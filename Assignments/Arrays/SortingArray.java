import java.util.Arrays;  
class Sorting{
	public static void main(String args[]){
		int a[]={1,5,7,3,8,6,9,3,6,4,2};
		Arrays.sort(a);
		System.out.println("Sorted elements are:");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}