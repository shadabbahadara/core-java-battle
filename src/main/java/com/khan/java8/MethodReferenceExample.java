package com.khan.java8;

public class MethodReferenceExample {

	public static void show() {
		System.out.println("show me");
	}
	public static void main(String[] args) {
		Thread thread = new Thread(MethodReferenceExample::show);
		thread.start();
	}
}
