package com.calc;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator calc = new Calculator();
	@Test
	public void testAdd() {
		assertEquals(10, calc.add(5, 5));		
		
	}

}
