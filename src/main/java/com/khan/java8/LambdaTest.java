package com.khan.java8;

public class LambdaTest {
	public static void main(String[] args) {
		Greeting greet = () -> System.out.println("hello");
		greet.greet();

		Addition addition = (n1, n2) -> n1 + n2;
		System.out.println("addition: " + addition.add(1, 2));
	}
}
