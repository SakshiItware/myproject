 package variable;

  public class Sample2
{

   int x=8;// non static global variable
   static int y=10;//static global variable
   
	public static void main(String[] args)
	{
		//call variable
		//to call non static global variable--> need to create object of class
		//objectName.variableName
		Sample2 sample2= new Sample2();
		System.out.println("calling non static global variablr "+sample2.x);
		
		sample2.test1();
		test2();
		//call static global variable 
		//static variable from same class--> call just by variable name 
		System.out.println("calling static global variable "+y);
		
		
		// call global variable from another c class
		// to call non static global variable from another class-->create object of class
		Sample3 s3= new Sample3();// create object of another class
		System.out.println("calling non static variable from another class"+ Sample3.m);
		
	}
    public void test1()// non static regular method
   {
	int sum=10+x;//using global non static variable in non static method
	int sub=90-y;//using global static global variable in non static method
	System.out.println("sum is "+sum);
	System.out.println("sub is "+sub);
    }
	
   public static void test2()//static regular method
  {
  int sum = 10+y;
  int sub=90-y;
   }
 
}
  
  