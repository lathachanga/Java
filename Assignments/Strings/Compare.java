class StringCompareEmp{
   public static void main(String args[]){
      String str = "Hello World";
      String anotherString = "hello world";
      Object objStr = str;
      System.out.println( str.compareTo(anotherString) );
      System.out.println( str.compareToIgnoreCase(anotherString) );
      System.out.println( str.compareTo(objStr.toString()));
   }
}

class StringCompareEqual{
   public static void main(String []args){
      String s1 = "tutorialspoint";
      String s2 = "tutorialspoint";
      String s3 = new String ("Tutorials Point");
      System.out.println(s1.equals(s2));
      System.out.println(s2.equals(s3));
   }
}
class StringCompareequl{
   public static void main(String []args){
      String s1 = "tutorialspoint";
      String s2 = "tutorialspoint";
      String s3 = new String ("Tutorials Point");
      System.out.println(s1 == s2);
      System.out.println(s2 == s3);
   }
}