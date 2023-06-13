package multiple_Element_handling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4_Select_Checkbox_in_Reverse_order 
{

	
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
		driver.get("C:\\Users\\shash\\OneDrive\\Desktop\\Screenshot\\HTML\\checkbox.html");
		
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input"));
		
		
		System.out.println(checkbox.size());
		
		
		
		// reverse for loop?
		
		for(int i=checkbox.size()-1;i>=0;i--)
		{
			
			WebElement opt = checkbox.get(i);
			
			opt.click();
			
			Thread.sleep(1000);
			
		}
		
		
		
		
		
	}
	
}
