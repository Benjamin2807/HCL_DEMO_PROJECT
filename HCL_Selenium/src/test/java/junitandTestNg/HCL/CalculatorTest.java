package junitandTestNg.HCL;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	
	Calculator cal=new Calculator();
	Calculator calc;
	boolean a;
	boolean b;
	int[] c = {1,2,3};
	int[] d = {1,2,3};

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		assertEquals(10, cal.addInteger(5, 5));
		
		assertNotEquals(15, cal.mulInt(5, 5));
		
		assertFalse(cal.bool(b));
		
		assertTrue(cal.bool1(a));
		
		assertNotNull(cal);
		
		assertNull(calc);
		
		assertArrayEquals(c, d);
		
		
		
	}

}
