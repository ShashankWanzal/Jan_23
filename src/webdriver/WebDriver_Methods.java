package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\eclipse-workspace\\Jan23_Selenium\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		System.out.println("Methods Of Web Driver");
		
		//1. Get 
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		//4. Get Tittle
		
		String title = driver.getTitle();
		
		System.out.println("Title of current web page is =>"+title);
		
		String title1="Facebook – log in or sign up";
		
		if(title.equals(title1))
		{
			System.out.println("Result is pass");
		}
		else
		{
			System.out.println("Test Casse 233 is fail");
		}
		
		
		//5. Get Current URL
		
		String ExpUrl="https://www.facebook.com/";
		
		String Actualurl = driver.getCurrentUrl();
		
		System.out.println(Actualurl);
		
		if(ExpUrl.equals(Actualurl))   
		{
			System.out.println("Test case 234 is pass");
			
		}
		
		else
		{
			System.out.println("Test case 234 is fail");
		}
		
		
		
		//6. Maximize Browser
		
		driver.manage().window().maximize();
		
		
		
		//8. Navigate Method
		
		driver.navigate().to("https://paytm.com/");
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		
		Thread.sleep(1000);
		
		
		driver.navigate().refresh();
		
		
		//9 Set Size
		
		Dimension D=new Dimension(100,100);
		
		driver.manage().window().setSize(D);
		
		
		
		Thread.sleep(1000);
		
		//10 Set Position
		
		
		Point P=new Point(50,50);
		
		driver.manage().window().setPosition(P);
		
		
		
		//2. Close
		
	//	driver.close();
		
		
		//3. Quite 
		
		
		//driver.quit();
		
		
		
		
		
	}
	
}
