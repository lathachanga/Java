class Var{
int a=20;  //instance variable
int d=50;  //instance variable
static int b =30;    //static variable
public static void main(String[] args){
    int c=40;   //local variable
  //System.out.println(c);
 // System.out.println(b);
var v1 = new Var();
  System.out.println(v1.a);
  System.out.println(v1.d);
  System.out.println(b);
  System.out.println(Var.b);
 System.out.println(v1.b);
 
var v2= new Var();
v2.b=300;
  System.out.println(v2.a);
  System.out.println(v2.d);
  System.out.println(b);
  System.out.println(Var.b);
 System.out.println(v2.b);
 System.out.println(v1.b);

}
}