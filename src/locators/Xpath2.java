package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\eclipse-workspace\\Jan23_Selenium\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[text()=' (9) Timesheets to Approve']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[contains(@class,'oxd-button')])[5]")).click();  
		
		
	}
}
