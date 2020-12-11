package com.khan.threadpool;

import java.util.concurrent.BlockingQueue;

public class MyThread extends Thread {

	private BlockingQueue<Task> taskQueue = null;
	private boolean isStopped = false;

	public MyThread(BlockingQueue<Task> taskQueue) {
		this.taskQueue = taskQueue;
	}

	@Override
	public void run() {
		System.out.println("Inside MyThread.......");
		while (!isStopped) {
			try {
				Task task = taskQueue.take();
				task.run();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void stopThread() {
		isStopped = true;
	}
}
