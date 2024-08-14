package constructor;

public class A {
	
 public A()
 {
	   this(12);
	 // this("Velocity");
	
	 System.out.println("User defined zero parameter constructor");
	 
 }
 
    public A(int a)
    {
    	System.out.println("User defined single parameter constructor");
    	System.out.println(a);
    }

    public A(String name)
    {
    	System.out.println(name);
    	
    }
	public static void main(String[] args) {
		
		A a= new A();
		
		//A a1= new A(99);

	}

}
