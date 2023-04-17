class LinearSearch{
	public static int linearSearch(int a[], int key){
		for(int i=0;i<a.length;i++){
			if(a[i]==key){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[]args){
		int a[]={10,20,30,50,70,90};
		int key=70;
		int ar= linearSearch(a,key);
		System.out.println(key +"Element found at pos: "+ar);
	}
}