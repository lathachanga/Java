public class Test{  
   public static void main(String args[]){
	   //private data member  
        private String college;  
           //getter method for college  
        public void setCollege(String college){  
            this.college=college;  
        }  
        public String getCollege(){  
           return college;  
        }
		Test t =new Test();
		System.out.println(t.getCollege());
    }

 }  
/*Now, you can't get the value of the college, you can only change the value of college data member.

System.out.println(s.getCollege());//Compile Time Error, because there is no such method  
System.out.println(s.college);*/