package junitandTestNg.HCL;

import static org.junit.Assert.assertArrayEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Calculator_TestNg2 extends Calculator{


	boolean a;
	boolean b;

	int[] c = {1,2,3};
	int[] d = {1,2,3};
	
	@Test
	public void Boolean_Check() 
	{

		Assert.assertFalse(bool(a));

		Assert.assertTrue(bool1(b));

		assertArrayEquals(c, d);
		
		Reporter.log("Executed class 2",true);
	}
}
