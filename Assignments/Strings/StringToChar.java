class StringToCharExample2{  
public static void main(String args[]){  
String s="hello";    
for(int i=0; i<s.length();i++){  
        char c = s.charAt(i);  
        System.out.println("char at "+i+" index is: "+c);  
}   
}} 
 
class StringToCharExample3{  
public static void main(String args[]){  
String s1="hello";    
char[] ch=s1.toCharArray();    
for(int i=0;i<ch.length;i++){    
System.out.println("char at "+i+" index is: "+ch[i]);   
}  
}}  