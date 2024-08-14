package constructor;

public class B extends A{
	
	public B()
	{
		this(11);
		//super(33);
		System.out.println("Class b constructor");
		
	}
	public B(int b)
	{
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		B b= new B();
		
		

	}

}
