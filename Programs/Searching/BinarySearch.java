class BinarySearch{
	public static void binarySearch(int a[],int first,int last,int key){
		int mid=(first+last)/2;
		while(first<=last){
			if(a[mid]<key){
				first=mid+1;
			}
			else if(a[mid]==key){
				System.out.println("element found at paosition: "+mid);
			}
			else{
				last=mid-1;
			}
			
		}
		if(first>last){
			System.out.println("Element Not found");
		}
	}
    public static void main(String args[]){
	 int a[]={12,43,65,45,87,98};
	 int key=98;
	 int last=a.length-1;
	 binarySearch(a,0,last,key);
	 
    }
}