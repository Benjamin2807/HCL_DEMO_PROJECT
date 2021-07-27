package junitandTestNg.HCL;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Calculator_TestNg extends Calculator{

	@Test
	public void asserts()  
	{
		Assert.assertEquals(addInteger(5, 5), 10);

		Assert.assertNotEquals(mulInt(5, 5), 10);

		Reporter.log("Executed Class 1",true);
		
	}

}







