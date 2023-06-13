package logical_Program;

public class Comparison_Array
{

	
	// 1234567
	// 1234578
	
	public static void main(String[] args)
	{
	
		int num1[]= {1,2,3,4,5,6,7};
		int num2[]= {1,2,3,4,5,7,8};
		
		
		boolean status=true;
		
		if(num1.length==num2.length)
		{
			
			
			for(int i=0;i<=num1.length-1;i++)
			{
				
				
				if(num1[i]!=num2[i])  //(num1[5]!=num2[5]) =(6!=7)
				{
					
					status=false;
				}
				
			}
			
			
			
		if(status==true)
		{
			System.out.println("both array are matching");
		}
		else
			
		{
			System.out.println("Data Mismatch found betw two array");
		}
		
			
		}
		else 
		{
			System.out.println("both arrays are not matching, length is different");
		}
		

			
			
		}
	
	
}
