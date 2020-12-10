package com.khan.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) throws IOException {
		Employee emp = Employee.builder().id("1").name("shadab").build();
		FileOutputStream fos = new FileOutputStream("emp.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
	}
}
