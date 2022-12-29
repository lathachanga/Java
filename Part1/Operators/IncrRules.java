class Operator{
public static void main(String args[]){
int x=5++;  // compile error
int y=10;
int z=++(++x);  //compile error
final int var=20;
  var++;
}
}