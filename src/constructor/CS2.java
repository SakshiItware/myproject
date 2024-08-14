package constructor;

public class CS2 {

	int a = 10;
	int b = 20;   
	
	// variable initialize
	public CS2() {
	    a = 90;
		b = 100;
	}
	
	public static void main(String[] args) {
	CS2 CS2 = new CS2();
	CS2 .addition();

		
	}

	public void addition()
	{
		
		int sum=a+b;
		System.out.println("Sum is "+sum);
	}
}
