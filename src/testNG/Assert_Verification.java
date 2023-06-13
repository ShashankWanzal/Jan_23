package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Verification
{

	//7. Assert Fail
	
	@Test
	public void test()
	{
		
		String act="Hi";   //
		String exp="Hi";

		//Assert.fail("Not in Scope");
		Assert.assertEquals(act, exp,"Act & Exp are not matching");
		
		
		
	}
	
	@Test
	public void test1()
	{
		
		String act=null;  

		Assert.assertNotNull(act,"Act is empty");
		
		boolean result=true;
		
		Assert.assertFalse(result,"Result is not false");
		Reporter.log("Test1 is running",true);
		
	}
	
	/*
	
	6. Assert Not Null
	@Test
	public void test()
	{
		
		String act=null;   //

		Assert.assertNotNull(act,"Act is empty");
		
		
	}
	
	/*
	
	5.Assert Null
	@Test
	public void test()
	{
		
		String act=null;   //
	
		Assert.assertNull(act,"Act is not empty");
		
		
	}
	
	/*
	
	4.Assert False
	@Test
	public void test()
	{
		
	
		boolean result=true;
		
		Assert.assertFalse(result,"Result is not false");
		
		
	}
	
	
	/*
	 *
	3. Assert True
	
	@Test
	public void test()
	{
		
		boolean actresult=false;
		

		Assert.assertTrue(actresult,"Result is not true");


	}
	
	2.Assert Not Equals
	
	/* 
	@Test
	public void test()
	{
		
		String act="Hi";   //
		String exp="Hii";

		Assert.assertNotEquals(act, exp,"Act & Exp Are matching");
		
		
	}
	
	1.Assert Equals
	
	/*
	@Test
	public void test()
	{
		
		String act="Hi";   //
		String exp="Hi";

		Assert.assertEquals(act, exp,"Act & Exp are not matching");
		
		
	}
	*/
	
	
	
	
}
