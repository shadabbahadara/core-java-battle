package com.khan.threadpool;

public class Task1 implements Task {

	@Override
	public void run() {
		System.out.println("performing task 1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
