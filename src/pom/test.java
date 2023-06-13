package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
	//	driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://kite.zerodha.com/");
		
		
		KiteLoginPage a1=new KiteLoginPage(driver);
		
		a1.enterUN();
		Thread.sleep(2000);
		a1.enterpass();
		Thread.sleep(2000);
		a1.button();
	
		
		
		Thread.sleep(5000);
		
		Verify_PN a2=new Verify_PN(driver);
		
		a2.verifyProfileName("DF435");
		
		
		
	}
	
}
