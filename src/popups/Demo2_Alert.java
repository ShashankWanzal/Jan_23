package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2_Alert 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		
		driver.findElement(By.id("promtButton")).click();
		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		
		String text = alt.getText();
		
		System.out.println(text);
		
		alt.dismiss();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Elements']")).click();
		
		
	}
}
