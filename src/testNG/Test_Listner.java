package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Test_Listner implements ITestListener
{

	
	@Override
	public void onFinish(ITestContext context) 
	{
			System.out.println("Test is compleated");
	}
	
	/*
	//@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
	
	} */
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
	
		System.out.println("Test case is fail capture the snap");
		
	}
	
/*	@Override
	public void onTestSkipped(ITestResult result)
	{
		
	}
	*/
	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Method is started");
	}

	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test is pass");
	}
	
	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("Test is started");
	}
	
/*	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
	
	}*/
	
	
	
	
}
