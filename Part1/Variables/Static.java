class Static{
      static String Org_Name="Tcs";
      int eid=101;
      double sal=45000;
  public static void main(String args[]){
     
      System.out.println(Org_Name);
      System.out.println(Static.Org_Name);
      Static s1=new Static();
      Static s2=new Static();
      System.out.println(s1.eid);
      System.out.println(s1.sal);
      System.out.println(s2.eid);
      System.out.println(s2.sal);
      System.out.println(s1.Org_Name);
      System.out.println(s2.Org_Name);
  }
}