package com.khan.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp = (Employee) ois.readObject();

		System.out.println("deserilising object.......");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
	}
}
