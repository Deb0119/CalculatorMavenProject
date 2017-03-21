package com.maven.test;


import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.maven.Calculator;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	static Logger log = Logger.getLogger(CalculatorTest.class.getName());
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		log.info("Before running test case");
		System.out.println("Before running test case");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		log.info("Before running test case");
	}

	@Test
	public void test() {
		Calculator c=new Calculator();
		int result=c.addNumbers(10, 12);
		assertEquals(result,22);
	}

}
