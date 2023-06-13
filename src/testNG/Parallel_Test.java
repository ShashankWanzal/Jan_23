package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public class Parallel_Test 
{
	
	@Parameters("BrowserName")
	@org.testng.annotations.Test
	public void Test(String BrowserName)
	{

		
		WebDriver driver=null;
		
		
		if(BrowserName.equals("Chrome"))
		{
			
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\shash\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
			 driver=new ChromeDriver();
			
			//driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Reporter.log("Chrome browser is opening",true);
			
		}
		
		
		
		else if(BrowserName.equals("Edge"))
		{
			
			System.setProperty("webdriver.edge.browser",
					"C:\\Users\\shash\\eclipse-workspace\\Jan23_Selenium\\Drivers\\msedgedriver.exe");
			
			
			 driver=new EdgeDriver();
			
			//driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Reporter.log("Edge browser is opening",true);
			
		}
		

		
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement UN = driver.findElement(By.id("email"));
		
		boolean result = UN.isEnabled();
		
		SoftAssert soft =new SoftAssert();
		
		soft.assertFalse(result);
		
		driver.close();
		
		soft.assertAll();
		

		
	}
	
	
}
