package multiple_Element_handling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 
{

	
	public static void main(String[] args)
	{
	
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		
		
		for(WebElement op:links)
		{
			
		System.out.println(op.getText());	
		}
		
		
		
	}
	
}
