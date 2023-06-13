package logical_Program;

public class Missing_Number 
{

	//12345679
	public static void main(String[] args)
	{
	
		int a[]= {1,2,4,5,6,7,8,9};  //8
		
		
		int sum1=0;
		int sum2=0;
		
		
		for(int i=0;i<=a.length-1;i++) //1
		{
			
			
		sum1=sum1+a[i];  // sum1+a[i]=	1+a[1]=1+2=3									0+a[0]=0+1
		
		System.out.print(sum1+ " ");
			
		}
		
		System.out.println();
		
		for(int i=0;i<=a.length+1;i++)
		{
			
			
			sum2=sum2+i;
			System.out.print(sum2+ " ");
		}
		
		System.out.println();
		System.out.println(sum2-sum1);
		
		
		
		
	}
	
	
}
