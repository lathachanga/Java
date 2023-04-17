class Test{
	public static void main(String args[]){
		StringBuilder sb=new StringBuilder("Srilatha");
		//System.out.println(sb.append("Changa"));  //The append() method concatenates the given argument with this String.
		//System.out.println(sb.insert(3,"Changa")); //The insert() method inserts the given String with this string at the given position.
		//System.out.println(sb.replace(3,7,"Changa"));  //The replace() method replaces the given String from the specified beginIndex and endIndex.
	//	System.out.println(sb.delete(3,7)); //The delete() method of the StringBuffer class deletes the String from the specified beginIndex to endIndex.
       // System.out.println(sb.reverse());   //The reverse() method of the StringBuilder class reverses the current String.
	   StringBuffer sb1=new StringBuffer();
		System.out.println(sb1.capacity()); //The capacity() method of the StringBuffer class returns the current capacity of the buffer. The default capacity of the buffer is 16. If the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34.
		System.out.println(sb.capacity());
		
		
	/*	StringBuilder sb2=new StringBuilder();  
System.out.println(sb.capacity());//default 16  
sb.append("Hello");  
System.out.println(sb.capacity());//now 16  
sb.append("java is my favourite language");  
System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
sb.ensureCapacity(10);//now no change                The ensureCapacity() method of the StringBuffer class ensures that the given capacity is the minimum to the current capacity. If it is greater than the current capacity, it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34.
System.out.println(sb.capacity());//now 34  
sb.ensureCapacity(50);//now (34*2)+2  
System.out.println(sb.capacity());//now 70  */
	}
}