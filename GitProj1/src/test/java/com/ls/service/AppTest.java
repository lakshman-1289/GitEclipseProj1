package com.ls.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AppTest 
{
	@Test
	public void testWithPositives() {
		App ar = new App();
		System.out.println("AppTest.testWithPositives()");
		float expected = 30.0f;
		float actual = ar.sum(10.0f, 20.0f);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testWithNegatives() {
		App ar = new App();
		System.out.println("AppTest.testWithNegatives()");
		float expected = -10.0f;
		float actual = ar.sum(10.0f, -20.0f);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testWithZeros() {
		App ar = new App();
		System.out.println("AppTest.testWithZeros()");
		float expected = 0.0f;
		float actual = ar.sum(0.0f, 0.0f);
		assertEquals(expected,actual);
	}
}
