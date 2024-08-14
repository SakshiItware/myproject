package thisAndSuper;

public class Sample 
{

	  int a=90;
	  
	public static void main(String[] args) {
		Sample sample = new Sample();
           sample.add();
	}
    public void add()
    {
    	int a=10;
    	int sum = a+100;
    	System.out.println(sum);
    	
    	int sum1 = this.a+100;
    	System.out.println(sum1);
    	
   
    }
}
