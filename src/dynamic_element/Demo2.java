package dynamic_element;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
	//	driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://kite.zerodha.com/");
		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("oppo Mobiles");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		Thread.sleep(2000);
		
		String rating = driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[4]")).getText();
		
		System.out.println(rating);
		
		String review = driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[6]")).getText();
		
		System.out.println(review);
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}
	
}
