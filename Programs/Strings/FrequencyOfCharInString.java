class FrequencyOfCharInString{
	public static void main(String args[]){
		String s="srilatha changa";
		int[] freq=new int[s.length()];
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++){
			freq[i]=1;
			for(int j=i+1;j<s.length();j++){
				if(ch[i]==ch[j]){
					freq[i]++;
					ch[j]='0';
				}
			}
		}
		System.out.println("Srring is : "+s);
		System.out.println("Frequency of a String:");
		for(int i=0;i<freq.length;i++){
			if((ch[i]!=' ')&&(ch[i]!='0')){
				System.out.println(ch[i]+" "+freq[i]);
			}
		}
	}
}