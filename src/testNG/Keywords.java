package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords 
{

	@Test(timeOut=1000)
	public void m1() throws InterruptedException
	{
		Reporter.log("M1 is running",true);
		Thread.sleep(11000);
	}
	
	@Test
	public void m2()
	{
		Reporter.log("M2 is running",true);
	}
	
	
	@Test(timeOut=100)
	public void m3() throws InterruptedException
	{
		Reporter.log("M3 is running",true);
		//Thread.sleep(10000);
	}
	
	@Test(dependsOnMethods= {"m1","m3"})
	public void m4()
	{
		Reporter.log("M4 is running",true);
	}
	
	
	
	
	
	/*
	@Test(timeOut=1000)
	public void m1() throws InterruptedException
	{
		Reporter.log("M1 is running",true);
		Thread.sleep(11000);
	}
	
	@Test
	public void m2()
	{
		Reporter.log("M2 is running",true);
	}
	
	
	@Test
	public void m3()
	{
		Reporter.log("M3 is running",true);
	}
	
	@Test
	public void m4()
	{
		Reporter.log("M4 is running",true);
	}
	
	
	/*
	@Test(priority=5)
	public void m1()
	{
		Reporter.log("M1 is running",true);
	}
	
	@Test(priority=2)
	public void m2()
	{
		Reporter.log("M2 is running",true);
	}
	
	
	@Test(priority=-4,enabled=false)
	public void m3()
	{
		Reporter.log("M3 is running",true);
	}
	
	@Test(priority=1)
	public void m4()
	{
		Reporter.log("M4 is running",true);
	}
	
	
	
/*	@Test(invocationCount=10)
	public void m1()
	{
		Reporter.log("M1 is running",true);
	}

	@Test(priority=5)
	public void m1()
	{
		Reporter.log("M1 is running",true);
	}
	
	@Test(priority=1)
	public void m2()
	{
		Reporter.log("M2 is running",true);
	}
	
	
	@Test(priority=4)
	public void m3()
	{
		Reporter.log("M3 is running",true);
	}
	
	@Test(priority=1)
	public void m4()
	{
		Reporter.log("M4 is running",true);
	}
	
	@Test(priority=-3)
	public void m5()
	{
		Reporter.log("M5 is running",true);
	}
	
	@Test(priority=6)
	public void m6()
	{
		Reporter.log("M6 is running",true);
	}
	*/
	
}
