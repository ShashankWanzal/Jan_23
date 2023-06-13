package locators;

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
		
		Thread.sleep(2000);
		
		WebElement Un = driver.findElement(By.id("email"));
		
		Un.sendKeys("Shashank");
		
		WebElement btn = driver.findElement(By.name("login"));  
		
		btn.click();
		
		
	}
	
	
}
