package junitandTestNg.HCL;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider {

	int d;

	@Test(dataProvider="TestData")
	public void assertadd(int a, int b, int c) 
	{

		AssertJUnit.assertEquals(add(a,b,c), 15);

	}

	public int add(int a, int b, int c)
	{

		d=a+b+c;
		return d;
	}


	@DataProvider(name="TestData")
	public Object[][] fetchdata()
	{
		return new Object[][]
				{
			        {5,5,5}, {5,5,5}, {5,5,5}
				};

	
	}





}
