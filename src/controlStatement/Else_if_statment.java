package controlStatement;

public class Else_if_statment {

	public static void main(String[] args) 
	{
		//>=60-->first class
		//>=50-->2nd class
		//>=40-->just pass
		//<40-->fail
		
		//if marks greater than 60 or equal to then first class 
		//else if marks greater than or equal to 50 then 2nd class
		//else if marks greater than or to 40 then just pass
		//else less than 40 fail
		
		int marks=90;
		if(marks>=60)
		{
			System.out.println("FIRST CLASS");
		}
		else if(marks>=50)	
		{
		System.out.println("SECOND CLASS");
       }
		else if(marks>=40) 
		{
		 System.out.println("JUST PASS");	
		}
		else
		{
			System.out.println("FAIL");
		}

	     }
		
       }

