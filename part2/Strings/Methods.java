class Method{
	public static void main(String args[]){
		String name="Srilatha Changa";
		System.out.println("String length:"+name.length());
		System.out.println("String charAt:"+name.charAt(10));
		System.out.println("String indexOf:"+name.indexOf("a"));
		System.out.println("String substring:"+name.substring(0,8));
		System.out.println("String UpperCase:"+name.toUpperCase());
		System.out.println("String LowerCase:"+name.toLowerCase());
		String num=name.trim();
		System.out.println("String Trim:"+num);
	}
}