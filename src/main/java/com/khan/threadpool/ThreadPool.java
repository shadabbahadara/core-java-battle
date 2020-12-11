package com.khan.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPool {
	private BlockingQueue<Task> taskQueue = null;
	private List<MyThread> threadPool = new ArrayList<>();

	private boolean isStopped = false;// is thread pool started

	public ThreadPool(int numberOfThreads, int maxTasks) {
		taskQueue = new ArrayBlockingQueue<>(maxTasks);
		for (int i = 0; i < numberOfThreads; i++) {
			MyThread thread = new MyThread(taskQueue);
			threadPool.add(thread);
			thread.start();
		}
	}

	public synchronized void executeTask(Task task) {
		if (this.isStopped)
			throw new IllegalStateException("ThreadPool is stopped");
		try {
			this.taskQueue.put(task);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void stopThreadPool() {
		for (MyThread thread : threadPool) {
			thread.stopThread();// stop all threads
		}
		isStopped = true;

	}
}
