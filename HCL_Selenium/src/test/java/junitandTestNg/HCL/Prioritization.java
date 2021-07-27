package junitandTestNg.HCL;

import org.testng.annotations.Test;

public class Prioritization {



	@Test
	public void b() 

	{

		System.out.println("b");
	}

	@Test(priority=0)
	public void a()
	{
		System.out.println("a");
	}
	
	@Test
	public void c()
	{
		System.out.println("c");
	}
	
	

	
	
	
}