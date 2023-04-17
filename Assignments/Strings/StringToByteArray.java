import java.util.*;
class StringToByteArray{  
    public static void main(String args[]){  
        String name="Srilatha";
		byte[] byteArr=name.getBytes();
	    System.out.println("String to Byte Array:"+Arrays.toString(byteArr));
    }
} 

class ByteArrayToString{  
    public static void main(String args[]){  
        byte[] byteArr={10,20,50,67,33,34,65,28};
		byte[] byteArr1={'s','r','i','l','a','t','h','a'};
	    String str=new String(byteArr);
		String str1=new String(byteArr1);
		System.out.println(str);
	    System.out.println(str1);
    }
}