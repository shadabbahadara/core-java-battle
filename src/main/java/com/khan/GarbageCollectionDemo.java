package com.khan;

public class GarbageCollectionDemo {
	@Override
	public void finalize() {
		System.out.println("garbage collection invoked");
	}
	public static void main(String[] args) {
		GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
		GarbageCollectionDemo obj2 = new GarbageCollectionDemo();
		obj1 = null;
		obj2 = null;
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();

	}
}
