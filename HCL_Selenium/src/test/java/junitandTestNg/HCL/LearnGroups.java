package junitandTestNg.HCL;

import org.testng.annotations.Test;

public class LearnGroups {


	@Test(groups="sanity")
	public void unit()
	{
		System.out.println("performing unit test");

	}

	@Test(groups="smoke")
	public void smoke() 
	{
		System.out.println("performing smoke test");
	}

	@Test(groups= {"sanity","smoke"})
	public void sanity() 
	{
		System.out.println("performing sanity test");

	}
	@Test
	public void regression() 
	{
		System.out.println("performing Regression test");

	}
}
