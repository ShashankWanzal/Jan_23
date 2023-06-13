package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Verification
{

	@Test
	public void test()
	{
		
		
		String act="hi";
		String exp="hii";
		String exp1="hii";
		boolean result=false;
		
		
		SoftAssert soft=new SoftAssert();
		
		soft.assertEquals(act, exp,"act & exp are not matching");
		
		Reporter.log("Good Morning",true);
		
		soft.assertNotEquals(exp, exp1,"exp & exp1 are matching");
		
		soft.assertTrue(result,"getting false record");
		
		soft.assertFalse(true,"Getting true record");
		
		soft.assertNotNull(exp,"field is null");
		
		soft.assertNull(exp,"Field is not null");
		
		
		soft.fail("fail");
		
		soft.assertAll();
		
		
		
	}

	
	// 10 TM,  2 Method fail 
	// Retest 2 Method
	// Comment 
	// Enable =false 
	// Failed.xml
	
	
	
	
	
}
