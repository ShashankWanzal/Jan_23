package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verify_PN
{

	
	@FindBy(xpath="//span[@class='user-id']") private WebElement PN;
	
	
	
	public Verify_PN(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void verifyProfileName(String ExpPN)
	{
		
		String ActPN = PN.getText();
		
		
		if(ActPN.equals(ExpPN))
		{
			System.out.println("Test case is pass both PN is matching");
		}
		else 
		{
			System.out.println("Test case is fail, PN is not Matching");
		}
		
	}
	
	
	
	
}
