package constructor;

public class CS3 {

	 String a;
	 int b;
	 
	 //use of constructor to initialize variables
	 //user defined without parameter
	 public CS3 ()
	 {
		 a="India";
		 b=90;
	 }
	 
	//use of constructor to initialize variables
	//user defined with parameter
	 public CS3(String x,int y)//MH 22
	 {
		 a=x;//MH
		 b=y;//22
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CS3 c3= new CS3();//created object using without parameter constructor 
      c3.display();
      
      CS3 c4= new CS3();//created object using without parameter constructor 
      c4.display();
      
      CS3 c5= new CS3();
      c5.display();
	}

	public void display()
	{
		System.out.println("value of a is "+a);
		System.out.println("value of a is "+b);
	}
}
