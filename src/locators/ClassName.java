package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName 
{

	
	public static void main(String[] args) throws InterruptedException
	{
	
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\eclipse-workspace\\Jan23_Selenium\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("file:///C:/Users/shash/OneDrive/Desktop/Screenshot/HTML/Jan%20Batch/new.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("abc")).sendKeys("harish");
		driver.findElement(By.className("abc")).sendKeys("harish");
		
		driver.findElement(By.name("abcd")).sendKeys("  harish");
		
		driver.findElement(By.name("abcd")).sendKeys("  harish@gmail.com");
	}
	
}
