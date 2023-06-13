package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 
{

	@Test
	public void m1()
	{
		Reporter.log("M1 is Running",true);
	}
	
	@Test
	public void m2()
	{
		Reporter.log("M2 is Running",true);
	}
	
	@Test
	public void m3()
	{
		Reporter.log("M3 is Running",true);
	}
	
	@Test
	public void m4()
	{
		Reporter.log("M4 is Running",true);
	}
	
	@Test
	public void m5()
	{
		Reporter.log("M5 is Running",true);
	}
	
	
}
