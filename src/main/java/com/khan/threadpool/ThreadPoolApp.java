package com.khan.threadpool;

import java.util.Random;

public class ThreadPoolApp {
	public static void main(String[] args) {
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		Task3 t3 = new Task3();
		Task4 t4 = new Task4();

		ThreadPool threadPool = new ThreadPool(2, 2);

		int taskCount = 0;
		Random random = new Random();
		while (taskCount < 50) {
			int n = random.nextInt(4);
			if (n == 0)
				threadPool.executeTask(t1);
			else if (n == 1)
				threadPool.executeTask(t2);
			else if (n == 2)
				threadPool.executeTask(t3);
			else if (n == 3)
				threadPool.executeTask(t4);
			taskCount++;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
