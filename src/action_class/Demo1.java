package action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 
{

	
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
	//	driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://www.flipkart.com/");
		
		
		//Step 1
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Terms of Use']"));
		
		//Step 2
		
		Actions act=new Actions(driver);
		
		
		//Step 3
		
		
		act.moveToElement(link).contextClick().perform();
		
		// mouse 
		
		
		
		
	}
	
}
