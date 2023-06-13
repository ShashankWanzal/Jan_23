package listbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5
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
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		
		Select s=new Select(month);  // Step 2
		
		List<WebElement> options = s.getOptions();
		
		
		
		ArrayList<String> ar=new ArrayList<String>();
		
		for(WebElement op:options)
		{
			String text = op.getText();
			
			ar.add(text);
			
		}
		
		Collections.sort(ar);
		
		for(String a:ar)
		{
			System.out.println(a);
		}
		
		driver.close();
		
		
		
	}
}
