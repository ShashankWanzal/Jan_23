package logical_Program;

public class Count_No_of_Vowels
{

	// a_e_i_o_u
	
	public static void main(String[] args)
	{
	
		
		String str="Dishaa Institute of Technology";
		
		str=str.toLowerCase();
		
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			
			//i=1
			
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				count++;
			}
			
			
			
			
			
		}
		System.out.println(count);
		
		
		//a=? 
		//e=?
		//i=?
		//o?
		//u? 
	}
	
	
}
