package practice;

public class Test {
	
	public static int m1() {
		try {
		//System.out.println(10/0);
			return 1;
		}
		catch(Exception e) {
			//System.out.println(e);
			return 2;
        }
			finally {
				System.exit(0);
			return 3;
		}
		
		
	}
  public static void main(String args[]) {
	  System.out.println(m1());
  }
}
