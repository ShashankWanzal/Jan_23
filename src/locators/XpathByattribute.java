package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByattribute 
{

	
	public static void main(String[] args) throws InterruptedException
	{
	

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\eclipse-workspace\\Jan23_Selenium\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		WebElement UN = driver.findElement(By.xpath("//input[@id='email']"));
		
		UN.sendKeys("VedPrasad");
		
		WebElement Pass = driver.findElement(By.xpath("//input[@name='pass']"));
		
		Pass.sendKeys("Thakare");
		
	//	driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	//	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		
		//driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		
		String text = driver.findElement(By.xpath("//div[contains(text(),'for')]")).getText();
		
		System.out.println(text);
		
	}
	
	
	
}
