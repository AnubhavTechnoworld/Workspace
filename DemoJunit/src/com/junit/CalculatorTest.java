package com.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

	Calculator calc;
	@Before
	public void init() {
		calc=new Calculator();
		System.out.println("Init Executed");
	}
	@After
	public void tearDown() {
		System.out.println("Tear down Executed");
	}
	@BeforeClass
	public static void beforeAll() {
		System.out.println("Before All Executed");
	}
	@AfterClass
	public static void afterAll() {
		System.out.println("After All Executed");
	}
	@Test
	public void testAdd() {
		System.out.println("Add method executed");
		assertEquals(12,calc.add(10,2));
	}

	@Test

	public void testSubtract() {
		System.out.println("Subtract method Executed");
		assertEquals(6, calc.subtract(12, 6));
	}
		
		
		
		
	

}
