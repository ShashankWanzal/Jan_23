package action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
	//	driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		
		Thread.sleep(2000);
		
		
		WebElement bank = driver.findElement(By.xpath("//div[@class='ui-widget-content']/ul/li[5]"));
		
		WebElement money = driver.findElement(By.xpath("//div[@class='ui-widget-content']/ul/li[2]"));
		
		
		WebElement Dest = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[2]"));
		
		WebElement Dest1 = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
		
		Actions act =new Actions(driver);
		
		
		//act.moveToElement(bank).clickAndHold().moveToElement(Dest).release().build().perform();
		
		
		act.dragAndDrop(bank,Dest).perform();
		
		act.dragAndDrop(money, Dest1).perform();
		
		
	}
	
	
}
