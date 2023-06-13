package popups;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3_child_browser
{

	public static void main(String[] args) throws InterruptedException
	{
	
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		
		
		Thread.sleep(2000);
		
		
		Set<String> ids = driver.getWindowHandles();
		
		
		ArrayList<String> ar=new ArrayList<String>(ids);
				
		System.out.println(ar.get(0));
		
		System.out.println(ar.get(1));
		
		
		String newpageid = ar.get(1);
		
		
		driver.switchTo().window(newpageid);
		
		

//		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
//		
  	driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
//		
  	
  		driver.switchTo().window(ar.get(0));
  	
  	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
  	
  	//Get window handle --> single 
  	//Get window handles--> set<string>
		
		
  	
  	//4 pages 
  	// 3page element click 
  	// 2page text
  	//4page snap
  	//1page click 
		
		
		
	}
	
}
