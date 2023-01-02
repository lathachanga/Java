import java.util.*;
class Number{
	public static void main(String args[]){
		int a[]={1,2,4,8,5};
		int n=a.length;
		int large,small;
		large=small=a[0];
		for(int i=0;i<n;i++){
			if(a[i]>large){
				large=a[i];
			}
			if(a[i]<small){
				small=a[i];
			}
		}
		System.out.println("small value:"+small);
		System.out.println("large value:"+large);
	}
}