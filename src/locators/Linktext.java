package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext
{

	
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\eclipse-workspace\\Jan23_Selenium\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ischoolconnect.com/blog/thought-of-the-day-quotes-to-start-your-day-right/");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		String text = driver.findElement(By.partialLinkText("All the best for exam")).getText();
		
		System.out.println(text);
		
	}
	
}
