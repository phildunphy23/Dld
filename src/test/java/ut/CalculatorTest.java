package ut;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.Calculator;

public class CalculatorTest {

	static Calculator cl;

	@BeforeClass
	public static void setUp() {
		cl = new Calculator();
	}

	@AfterClass
	public static void tearDown() {
		System.gc();
	}

	@Test
	public void testAdd() {

		assertTrue(cl.doAdd(1, 2) == 3);
	}

	@Test
	public void testSub() {
		assertTrue(cl.doSub(1, 1) == 0);
	}

	@Test
	public void testMul() {
		assertTrue(cl.doMul(9, 2) == 18);
	}

	@Test
	public void testDiv() {
		assertTrue(cl.doDiv(8, 2) == 4);
	}
	@Test
	public void testAddWithAssertEquals() {
		assertEquals(5.0, cl.doAdd(2, 3), 0.001);
	}

	@Test
	public void testSubWithAssertEquals() {
		assertEquals(4.0, cl.doSub(10, 6), 0.001);
	}
	@Test
	public void testAddWithAssertNotEquals() {
		assertNotEquals(6.0, cl.doAdd(2, 3), 0.001);
	}
}


