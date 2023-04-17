class RemoveSpacesFromString1{
	public static void main(String args[]){
		String s="Srilatha is a good girl";
		char[] ch=s.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<ch.length;i++){
			if((ch[i]!=' ')&&(ch[i]!= '\t')){
				sb.append(ch[i]);
			}
		}
		System.out.println(sb);
}
}