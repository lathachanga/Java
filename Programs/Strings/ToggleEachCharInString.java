class ToggleEachCharInString{
	public static void main(String args[]){
		String s="PrePInsTa";
		String s1="";
		for(int i=0;i<s.length();i++){
			if(Character.isUppercase(s.charAt(i))){
				s1=s1+Character.toLowerCase(s.charAt(i));
			}
			else{
				s1=s1+Character.toUpperCase(s.charAt(i));
			}
		}
		System.out.println("Toggle String:"+s1);
	}
}