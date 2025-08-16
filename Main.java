package com.nmetras.junitplayground;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		TestingPractice tp = new TestingPractice();
		
		System.out.println("Calling sendGreeting(): " + tp.sendGreeting());	
		
		double numb = 25;
		System.out.println("getSquare(" + numb + "): " + tp.getSquare(numb));
		
		int fizzBuzzLimit = 15;
		List<String> result = tp.fizzBuzz(fizzBuzzLimit);
		System.out.println("fizzBuzz(" + fizzBuzzLimit + "): " + result);
	}

}
