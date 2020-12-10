package com.khan.java8;

import java.util.Arrays;
import java.util.List;

public class StreamsTest {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("John", "Locke", 90), new Person("Karl", "Marx", 98),
				new Person("Emine", "Shadab", 1));
		people.stream().filter(p -> p.getLastName().startsWith("M")).forEach(p->System.out.println(p.getLastName()));
	}
}
