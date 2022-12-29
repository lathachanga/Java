class AnonyArray{
public static void cal_Marks(int[] marks){
int total=0;
for(int mark : marks){
   //total=total+mark;
     total+=mark;
   System.out.println(mark);
}
System.out.println("Total="+total);
}

public static void main(String args[]){
    cal_Marks(new int[]{35,36,27,56});
}
}