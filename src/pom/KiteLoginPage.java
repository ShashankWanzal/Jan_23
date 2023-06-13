package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage
{

	
	// Step 1 DM globally Access level private
	
	//annotation 
	
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	
	@FindBy(xpath="//input[@id='password']") private WebElement Pass;
	
	@FindBy(xpath="//button[text()='Login ']") private WebElement btn;
	
	
	
	//Step 2
	public KiteLoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	//Step 3
	
	public void enterUN() 
	{
	UN.sendKeys("DF4359");	
	}
	
	public void enterpass()
	{
		Pass.sendKeys("India@1234");
	}
	
	public void button()
	{
		btn.click();
	}
	
	
	
}
	
	