package com.nmetras.junitplayground;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class TestingPracticeTest {

	@Test
	void testSendGreeting() {
		TestingPractice tp = new TestingPractice();
		assertEquals("Hello World!", tp.sendGreeting(), "sendGreeting() should return: Hello World!");
	}
	
	@Test
	void testGetSquare_PerfectSquare() {
		TestingPractice tp = new TestingPractice();
		double result = tp.getSquare(25);
		assertEquals(5.0, result, 0.0001, "Square root of 25 should be 5.0");
		
	}
	
	@Test
	void testGetSquare_NonPerfectSquare() {
		TestingPractice tp = new TestingPractice();
		double result = tp.getSquare(2);
		assertEquals(1.4142, result, 0.0001, "Square root of 2 should be approx 1");
	}
	
	@Test
	void testGetSquare_Zero() {
		TestingPractice tp = new TestingPractice();
		double result = tp.getSquare(0);
		assertEquals(0.0, result, 0.0001, "Square root of 0 should be 0.o");
	}
	
	@Test
	void testGetSquare_NegativeNumber() {
		TestingPractice tp = new TestingPractice();
		double result = tp.getSquare(-4);
	    assertTrue(Double.isNaN(result), "Square root of negative number should be NaN");
	}
	
	@Test
	void testFizzBuzz_One() {
		TestingPractice tp = new TestingPractice();
		List<String> result = tp.fizzBuzz(1);
		assertIterableEquals(List.of("1"),result);
	}
	
	@Test
	void testFizzBuzz_Three() {
		TestingPractice tp = new TestingPractice();
		List<String> result = tp.fizzBuzz(3);
		assertIterableEquals(List.of("1", "2", "Fizz"),result);
	}
	
	@Test
	void testFizzBuzz_Five() {
		TestingPractice tp = new TestingPractice();
		List<String> result = tp.fizzBuzz(5);
		assertIterableEquals(List.of("1", "2", "Fizz", "4", "Buzz"), result);
	}
	
	@Test
	void testFizzBuzz_Fifteen() {
		TestingPractice tp = new TestingPractice();
		List<String> result = tp.fizzBuzz(15);
		assertEquals("FizzBuzz", result.get(14), "15th element should be FizzBuzz");
	}
}
