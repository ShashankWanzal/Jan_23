package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Run_failed_test
{

	@Test
	public void Test1()
	{
		
		Reporter.log("Test 1 is running",true);
		
	}
	
	@Test
	public void Test7()
	{
		
		Reporter.log("Test 7 is running",true);
		
	}
	
	@Test
	public void Test2()
	{
		
		Reporter.log("Test 2 is running",true);
		
	}
	
	@Test
	public void Test3()
	{
		//Assert.fail();
		Reporter.log("Test 3 is running",true);
		
	}
	
	@Test
	public void Test4()
	{
		
		Reporter.log("Test 4 is running",true);
		
	}
	
	@Test
	public void Test5()
	{
		//Assert.fail();
		Reporter.log("Test 5 is running",true);
		
	}
	
	@Test
	public void Test6()
	{
		
		Reporter.log("Test 6 is running",true);
		
	}
	
	
	
}
