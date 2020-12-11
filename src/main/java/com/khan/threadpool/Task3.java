package com.khan.threadpool;

public class Task3 implements Task {

	@Override
	public void run() {
		System.out.println("performing task 3");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
