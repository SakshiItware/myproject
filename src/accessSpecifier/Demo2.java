package accessSpecifier;

public class Demo2 {

	public static void main(String[] args) {
		Demo1 demo1 = new Demo1();
		//demo1.test1();calling private method in another class is not allowed
		
		demo1.test2();//calling default method in another class
		
		//System.out.println(demo1.a);//cannot call default variable in another class
		
		System.out.println(demo1.b);//call default variable in another class but within same package
		
	//	demo.test3();//call protected variable in another class
		
		System.out.println(demo1.c);//call protected variable in another class
		
	}

		
		

	}


