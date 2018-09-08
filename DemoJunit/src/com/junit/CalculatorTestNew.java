package com.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTestNew {
	Calculator calc;
	@Before
	public void init() {
		calc=new Calculator();
		System.out.println("Init Executed");
	}

	@Test(timeout=500)
	public void testMultiply()
	{
		System.out.println("Multiply method executed");
		assertEquals(72, calc.Multiply(12, 6));
	}
	@Test
	public void testDivide()
	{
		System.out.println("Divide metthod executed");
		try {
			assertEquals(2, calc.Divide(12, 6));
		} catch (InvalidDivisorException e) {
		System.out.println(e.getMessage());
		}
	}
	@Test(expected=InvalidDivisorException.class)
	public void testForException() throws InvalidDivisorException {
		assertEquals(0, calc.Divide(12, 0));
	}

}
