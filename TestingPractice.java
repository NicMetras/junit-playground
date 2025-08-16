package com.nmetras.junitplayground;
import java.util.ArrayList;
import java.util.List;

public class TestingPractice {
	
	public String sendGreeting() {
		return "Hello World!";
	}
	
	public double getSquare(double a) {
		return Math.sqrt(a);
	}
		
	public List<String> fizzBuzz(int a) {
		List<String> answer = new ArrayList<>();
		for (int i = 1; i <= a; i++) {
			if (i%3 == 0 && i%5 == 0) {
				answer.add("FizzBuzz");
			} 
			else if (i%3 == 0){
				answer.add("Fizz");
			}
			else if (i%5 == 0){
				answer.add("Buzz");
			}
			else
				answer.add(String.valueOf(i));

		}
		return answer;
	}
}
