package webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\eclipse-workspace\\Jan23_Selenium\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		WebElement UN = driver.findElement(By.id("email"));
		
		UN.sendKeys("abc");
		
		Thread.sleep(2000);
		//1. SendKeys => Use to send data to the tab or text box
		
		System.out.println("==========================================================");
		
		UN.clear();
		
		//2. Clear =>Use to clear the tab
		
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		System.out.println("==========================================================");
		//3. Click => Use to click on any web element 
		
		
	//	driver.findElement(By.xpath("//a[text()='Cancel']")).click();
		
		System.out.println("==========================================================");
		
		//4. isEnable=> it is use to verify element is enable or disable
		
		WebElement Name = driver.findElement(By.name("email"));
		
		boolean result = Name.isEnabled();  // True ---> false
		
		System.out.println(result);
		
		
		if(result==true)
		{
			System.out.println("Email address or mobile number is enable");
		}
		
		else
		{
			

			System.out.println("Email address or mobile number is Disable");
			
		}
		
		System.out.println("==========================================================");
		
		driver.navigate().back();
		
		//driver.navigate().back();
		
		
		// 5. is Selected=> use to verify radio button/checkbox is select or not 
		
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		
		boolean radio = driver.findElement(By.xpath("(//input[@name='sex'])[2]")).isSelected();
		
		System.out.println(radio);
		
		driver.findElement(By.xpath("//img[contains(@class,'_8idr img')]")).click();
		
		// 6. is display=> verify element is present on webpage
		
		
		
		boolean logo = driver.findElement(By.xpath("//img[contains(@class,'fb_logo ')]")).isDisplayed();
		
		if(logo==true)
		{
			System.out.println("FB Logo is present");
		}
		else
		{
			System.out.println("FB Logo is absent");
		}
		
		
		//7. Get Text=>  Use get text present in webpage
		
		String act = driver.findElement(By.xpath("//div[contains(text(),' for a celebrity')]")).getText();
		
		String exp="Create a Page for a celebrity, brand or business.";
		
		//System.out.println(act);
		
		if(act.equals(exp))
		{
			System.out.println("Text is matching Test case is pass");
			System.out.println(act);
			
		}
		
		else
		{
			System.out.println("Text is not matching , test case is fail");
		}
		
		
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
	
		
		
		
	}
	
	
}
