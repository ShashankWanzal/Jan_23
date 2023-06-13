package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample2 
{

	@BeforeClass
	public void OpenBrowser()
	{
		Reporter.log("------Open Browser------",true);
		
	}
	
	@BeforeMethod
	public void logInApp()
	{
		Reporter.log("------Pre Condition :UN & Pass--------",true);
	}
	
	@Test
	public void VerifyPN()
	{
		Reporter.log("-----Test is pass-------",true);
		Assert.fail();
		
	}
	
	

	
	@AfterMethod
	public void LogOutApp()
	{
	
		Reporter.log("------Post Condition : Log Out-------",true);
		
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		
		Reporter.log("--------Close Browser--------",true);
		
	}
	
	
}
