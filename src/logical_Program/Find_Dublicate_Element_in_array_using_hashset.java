package logical_Program;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Find_Dublicate_Element_in_array_using_hashset 
{

	public static void main(String[] args)
	{
	
		
		String ar[]= {"Ved","prajkta","komal","naved","komal"};
		
		
		for(int i=0;i<=ar.length-1;i++)

		{
			System.out.println(ar[i]);
		}
		
		System.out.println("===============================");
		
		
		HashSet<String> set=new HashSet<String>();   // block duplicates 
		
		for(String str:ar)
		{
			
			if(!set.add(str))   // !set => add ! if 
			{
				System.out.println(str);
				
			}
			
		}
		
		
		
	}
	
}
