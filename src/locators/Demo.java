package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\eclipse-workspace\\Jan23_Selenium\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		// dynamic Xpath/ css selector use 
		
		WebElement searchbox = driver.findElement(By.id("APjFqb"));
		
		
		Thread.sleep(2000);
		
		searchbox.sendKeys("hi");
		
		WebElement btn = driver.findElement(By.name("btnK"));
		
		btn.click();
		
		
		
	}
}
