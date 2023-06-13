package listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo6
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
		
		
		Select s=new Select(month);
		
		s.selectByVisibleText("Aug");
		
		//s.deselectAll();
		
		
		boolean result = s.isMultiple();
		
		System.out.println("Fb List Box=>"+result);
		
		Thread.sleep(2000);
		
		driver.navigate().to("file:///C:/Users/shash/OneDrive/Desktop/Screenshot/HTML/Jan%20Batch/Droup%20down.html");
		
		WebElement Countries = driver.findElement(By.tagName("select"));
		
		
		Select s1=new Select(Countries);
		
		boolean a = s1.isMultiple();
		
		
		System.out.println(a);
		
		s1.selectByVisibleText("India");
		s1.selectByVisibleText("USA");
	
		System.out.println(s1.getFirstSelectedOption().getText());
		
		List<WebElement> op = s1.getAllSelectedOptions();
		
		
		for(WebElement ops:op)
		{
			System.out.println(ops.getText());
		}
		
	
		
		
	}
}
