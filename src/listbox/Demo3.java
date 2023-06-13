package listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 
{

	
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\eclipse-workspace\\Jan23_Selenium\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//Step 1 
		
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		
		Select s=new Select(year);  // Step 2
		
		List<WebElement> options = s.getOptions();
		
		int size = options.size();
		
		
		System.out.println(size);
		
		System.out.println("Value present on index 0=>"+options.get(0).getText());
		
		//print -> For , For each
		
		/*for(int i=0;i<=size-1;i++)    //119-1=  0  ---> 118
		{
			
			WebElement op = options.get(i);
			
			String text = op.getText();
			
			System.out.println(text);
			
		} */
		
		
		
	/*	for(int i=0;i<=options.size()-1;i++)
		{
			System.out.println("value present at index "+i+" => "+options.get(i).getText());
			
		}
		*/
		
		
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
		
		
		
		
	
		
		
		
		
		
		
	}
	
}
