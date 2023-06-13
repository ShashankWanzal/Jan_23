package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3 
{

	public static void main(String[] args)
	{
	
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\eclipse-workspace\\Jan23_Selenium\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/shash/OneDrive/Desktop/Screenshot/HTML/Jan%20Batch/new.html");
		
		driver.findElement(By.xpath("html/body/input[2]")).sendKeys("abc");
		
		driver.findElement(By.xpath("/html//input[4]")).sendKeys("123345");
		
		
	}
	
}
