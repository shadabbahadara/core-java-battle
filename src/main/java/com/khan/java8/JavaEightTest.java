package com.khan.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class JavaEightTest {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("John", "Locke", 90), new Person("Karl", "Marx", 98),
				new Person("Emine", "Shadab", 1));
		Collections.sort(people, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
		System.out.println(people);
		
		printConditionally(people, p -> {
			System.out.println("checking condition...");
			return p.getFirstName().startsWith("E");
		});
	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
		for (Person person : people) {
			if (predicate.test(person)) {
				System.out.println("found match:" + person);
			} else
				System.out.println("Not Matched");

		}
	}
}