package com.khan.threadpool;

public class Task2 implements Task {

	@Override
	public void run() {
		System.out.println("performing task 2");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
