package logical_Program;

import java.util.Scanner;

public class Fibonacci_Series
{

	
	// Three four 
	
	public static void main(String[] args)
	{
	
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter 1st number=");
		
		int firstvalue = scan.nextInt();
		
		
		//System.out.println(firstvalue);
		
		System.out.println("Enter 2nd number=");
		
		int secondvalue = scan.nextInt();
		
		
		//System.out.println(firstvalue+secondvalue);
		
		System.out.println("Enter 3nd number=");
		
		int how_much_record_we_want = scan.nextInt();
		
		
		
		for(int i=3;i<=how_much_record_we_want;i++)
		{
			int number = firstvalue+secondvalue;  //8+13=21
			
			System.out.print(number+ " ");
			
			firstvalue=secondvalue;
			secondvalue=number;
			
			
			/*
			 * 
			 
			 first= second //  First =>8
			 Second =number // Second =>13
			 
			 * 
			 * 
			 */
			
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	
}
