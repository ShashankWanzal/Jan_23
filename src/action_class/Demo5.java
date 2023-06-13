package action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5 
{
		public static void main(String[] args) throws InterruptedException
		{
		
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\shash\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			
		//	driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			
			WebElement month = driver.findElement(By.id("month"));
			
					
			Actions act=new Actions(driver);   
			
			act.click(month).perform();
			
			for(int i=1;i<=7;i++)
			{
				
				act.sendKeys(Keys.ARROW_DOWN).perform();
				
				Thread.sleep(1000);
			}
				
			
			for(int i=1;i<=9;i++)
			{
				
				act.sendKeys(Keys.ARROW_UP).perform();
				
				Thread.sleep(1000);
			}
			
			act.sendKeys(Keys.ENTER).perform();
			
			
			
			
		}
}
