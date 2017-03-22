package com.maven.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.maven.Calculator;

public class CalculatorTest {

	private Calculator cal;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cal=new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddNumbers() {
		int result=cal.addNumbers(10, 12);
		assertEquals(22,result);
		System.out.println("Test complete");
	}

}
