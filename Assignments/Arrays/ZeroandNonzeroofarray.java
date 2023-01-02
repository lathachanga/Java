import java.util.Arrays;
import java.util.Scanner;
class Array{
	public static void main(String args[]){
		int a[]={2,5,3,0,4,6,0,9};
		int pos=0;
		 System.out.println("The array created is: "+Arrays.toString(a));
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				a[pos]=a[i];
				pos++;
			}
		}
		while(pos<a.length){
			a[pos]=0;
			pos++;
		}
		 System.out.println("The array created is: "+Arrays.toString(a));
	}
}