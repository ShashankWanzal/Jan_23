package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_TC2 
{

	@Test(groups= {"Paytm"})
	public void Test1()
	{
		
		Reporter.log("Test 1 is running",true);
		
	}
	
	@Test(groups= {"Paytm"})
	public void Test7()
	{
		
		Reporter.log("Test 7 is running",true);
		
	}
	
	@Test(groups= {"Paytm"})
	public void Test2()
	{
		
		Reporter.log("Test 2 is running",true);
		
	}
	
	@Test(groups= {"Gpay"})
	public void Test3()
	{
		//Assert.fail();
		Reporter.log("Test 3 is running",true);
		
	}
	
	@Test(groups= {"Gpay"})
	public void Test4()
	{
		
		Reporter.log("Test 4 is running",true);
		
	}
	
	@Test(groups= {"Gpay"})
	public void Test5()
	{
		//Assert.fail();
		Reporter.log("Test 5 is running",true);
		
	}
	
	@Test(groups= {"PhonePay"})
	public void Test6()
	{
		
		Reporter.log("Test 6 is running",true);
		
	}
	
	
	@Test(groups= {"PhonePay"})
	public void Test8()
	{
		
		Reporter.log("Test 8 is running",true);
		
	}
	
	@Test(groups= {"PhonePay"})
	public void Test9()
	{
		
		Reporter.log("Test 9 is running",true);
		
	}
	
	@Test(groups= {"Bhim"})
	public void Test10()
	{
		
		Reporter.log("Test 10 is running",true);
		
	}
	
	@Test(groups= {"Bhim"})
	public void Test11()
	{
		//Assert.fail();
		Reporter.log("Test 11 is running",true);
		
	}
	
	@Test(groups= {"Bhim"})
	public void Test12()
	{
		
		Reporter.log("Test 12 is running",true);
		
	}
	

	
	
}
