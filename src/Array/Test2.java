package Array;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int[]number = new  int[5];
		number[0]=4;
		number[1]=1;
		number[2]=5;
		number[3]=3;
		number[4]=2;
		
		System.out.println("=====printing array using for loop====");
				
		for(int i=0;i<=number.length-1;i++) {
			System.out.println(number[i]);
		}
			System.out.println("======printing array in ascending order======");
			
			Arrays.sort(number);//to sort our Array
			for(int i=0;i<=number.length-1;i++)
			{
				System.out.println(number[i]);
				
			}
			System.out.println("=======printing array in descending order====");
			
			for(int i=number.length-1;i>=0;i--) {
				
				System.out.println(number[i]);
			}
		}

	}


