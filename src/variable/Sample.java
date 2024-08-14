package variable;

public class Sample  {
int a = 10;//global variable  
     
   public static void main(String[] args) {
	Sample s= new Sample();
	s.test2();
   }
		public void test1() {
		
			int x = 100;//local variable
			
			}
			
	public void test2() {
     int y=90;//local variable
      int sub = y- a;
      int sum= a+y; 
      System.out.println("Addition is"+ sum);
	}    
      
   }

      
      
