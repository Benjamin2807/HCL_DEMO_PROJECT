package junitandTestNg.HCL;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Calculator {

	
	public int addInteger(int a, int b)
	{
		return a+b;
	}
	
	public int mulInt(int a, int b)
	{
		return a*b;
	}
	
	public boolean bool1(boolean a)
	{
		a=true;
		return a;
	}
	
	
	public boolean bool(boolean b)
	{
		b=false;
		return b;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		

		
	}

	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Printing before @Test Method");
	}


	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Printing after @Test Method");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Printing before the class");
	}
		
	@AfterClass
	public void afterClass()
	{
		System.out.println("Printing after the class");
	}


	@BeforeTest
	public void beforetest()
	{
		System.out.println("Printing before Starting the test");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("Printing after completing all the test");
	}
	
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Printing before suite");
	}
	
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("Printing after suite");
	}
	
	
	
}
