package autosuggetion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
	//	driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://www.google.com/");
		
		
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("oneplus");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		// OnePlus 10R 5G
		
		
		String exp="OnePlus Nord CE 5G";
		
		for(WebElement opt:list)
		{
			System.out.println(opt.getText());
	
			if(opt.getText().trim().equals(exp))
			{
				opt.click();
				break;
			}
			

			
		}
		
		
		
		
	}
	
}
