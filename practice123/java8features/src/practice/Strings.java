package practice;

public class Strings {

	public static void main(String[] args) {
		String s=new String("Srilatha");
		// 1 object for new in heap
		//2 object for literal in scp
		
		String s1="Srilatha";
		//total two objects were created in scp it literaal share the reference
		//intern method used to get reference from scp
		System.out.println(s.intern()); //literal
		System.out.println(s1.intern());
		System.out.println(s.intern().hashCode()==s1.hashCode());

	}

}
