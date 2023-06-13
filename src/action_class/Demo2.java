package action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2

{

	
	public static void main(String[] args) throws InterruptedException
	{
	
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
	//	driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		
		
		//Step 1
		
		WebElement droupdown = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		
		//Step 2
		
		Actions act=new Actions(driver);
		
		
		//Step 3
		
		
		act.click(droupdown).perform();
		
		//key class
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(2000);
		
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
	}
	
}
