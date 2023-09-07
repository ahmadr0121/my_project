package calculatorApp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void testSum() {
		// Test case 1: Positive numbers
		assertEquals(5.0, Calculator.sum(2.0, 3.0));

		// Test case 2: Negative numbers
		assertEquals(-8.0, Calculator.sum(-5.0, -3.0));
	}

	@Test
	public void testSubtract() {
		// Test case 1: Positive numbers
		assertEquals(2.0, Calculator.subtract(5.0, 3.0));

		// Test case 2: Negative numbers
		assertEquals(-8.0, Calculator.subtract(-5.0, 3.0));

	}

	@Test
	public void testMultiply() {
		// Test case 1: Positive numbers
		assertEquals(15.0, Calculator.multiply(3.0, 5.0));

		// Test case 2: Negative numbers
		assertEquals(-15.0, Calculator.multiply(3.0, -5.0));

	}

	@Test
	public void testDivide() {
		// Test case 1: Divide by non-zero number
		assertEquals(3.0, Calculator.divide(9.0, 3.0));

		// Test case 2: Divide by negative number
		assertEquals(-2.0, Calculator.divide(10.0, -5.0));

	}

}
