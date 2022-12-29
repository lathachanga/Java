class Arr{
public static void main(String[] args){
//declaration
 int[] id;
String name[];
 float []sal;

//creation
 id=new int[4];
name=new String[4];
sal=new float[4];

//initilazion
id[0]=10;
id[1]=20;
id[2]=30;
id[3]=40;
System.out.println(id);
System.out.println("Array length is:"+id.length);
System.out.println(id[0]);
for(int i:id){
System.out.println(i);
}

name[0]="Joshna";
name[1]="Srilatha";
name[2]="Sowmyaa";
name[3]="Joshna";
System.out.println(name);
System.out.println("Array length is:"+name.length);
System.out.println(name[0]);
for(String s: name){
System.out.println(s);
}

sal[0]=4500.0f;
sal[1]=5500.0f;
sal[2]=650.00f;
sal[3]=750.00f;
System.out.println(sal);
System.out.println("Array length is:"+sal.length);
System.out.println(sal[0]);
for(float f:sal){
System.out.println(f);
}

String[] enames = {"Sowmya","Sandhya","Srilatha","Sathvika"};
System.out.println(enames);
for(String ename: enames){
System.out.println(ename);
}
}

}