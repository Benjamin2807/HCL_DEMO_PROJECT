package junitandTestNg.HCL;

import org.testng.annotations.Test;

public class LDependsOnMethods {

	@Test(dependsOnMethods="launch")
	public void enterusername() 

	{

		System.out.println("Entered user name");
	}

	@Test
	public void launch()
	{
		System.out.println("Launched Browser");
	}



}
