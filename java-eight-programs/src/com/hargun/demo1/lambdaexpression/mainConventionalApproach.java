package com.hargun.demo1.lambdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class mainConventionalApproach {

	public static void main(String args[]) {
		List<Person> list = Arrays.asList(new Person(10, "Zakir", "Khan"), new Person(20, "Bhuvan", "Bam"),
				new Person(20, "Abhimanu", "Omkashyap"), new Person(20, "Akshay", "Kumar"),
				new Person(20, "Virat", "Kohli"), new Person(20, "Suarez", "J"));

		// 0: Print list before sort
		System.out.println("List without sorting");
		printAll(list);

		// 1: Sort the list on the basis of last name
		System.out.println("Sorting performed on the basis of last name");
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		// 2: Print the sorted list
		System.out.println("List with sorting");
		printAll(list);

		// 3: Print the list data which has lastname start with K
		System.out.println("List with last name start with K");
		printConditionLastnameK(list);
		
		// 4: Print the list data which has firstname start with A
		System.out.println("List with first name start with A");
		printConditionFirstnameA(list);

	}

	private static void printConditionFirstnameA(List<Person> list) {
		for (Person person : list) {
			if(person.getFirstName().startsWith("A"))
			System.out.println(person.toString());
		}
	}

	private static void printConditionLastnameK(List<Person> list) {
		for (Person person : list) {
			if(person.getLastName().startsWith("K"))
			System.out.println(person.toString());
		}
	}

	private static void printAll(List<Person> list) {

		for (Person person : list) {
			System.out.println(person.toString());
		}
	}

}
