package examples.iteration;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import examples.iteration.Arithmetic;

public class ArithmeticTest {
	
	@Test
	public void addTest() {
		assertEquals(4, Arithmetic.add(2,2));
	}
	
	@Test
	public void factorialTest() {
		assertEquals(120, Arithmetic.factorial(5));
	}
}
