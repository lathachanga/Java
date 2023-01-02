import java.io.*;
import java.util.*;
class Array{
	public static boolean areEqual(int arr1[],int arr2[]){
		int n=arr1.length;
		int m=arr2.length;
		if(n!=m){
			return false;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0;i<n;i++)
			if(arr1[i]!=arr2[i]){
				return false;
			}
		return true;
		
	}
	public static void main(String args[]){
		int arr1[]={10,20,40,50,30,90};
		int arr2[]={20,30,10,40,50};
		
		if(areEqual(arr1,arr2)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}