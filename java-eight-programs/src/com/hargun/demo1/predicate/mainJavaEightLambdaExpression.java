package com.hargun.demo1.predicate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class mainJavaEightLambdaExpression {

	public static void main(String args[]) {
		List<Person> list = Arrays.asList(new Person(10, "Zakir", "Khan"), new Person(20, "Bhuvan", "Bam"),
				new Person(20, "Abhimanu", "Omkashyap"), new Person(20, "Akshay", "Kumar"),
				new Person(20, "Virat", "Kohli"), new Person(20, "Suarez", "J"));

		// 0: Print list before sort
		System.out.println("List without sorting");
		printOnCondition(list, p -> true);

		// 1: Sort the list on the basis of last name - Lambda way
		System.out.println("Sorting performed on the basis of last name");
		/*
		 * Collections.sort(list, new Comparator<Person>() {
		 * 
		 * @Override public int compare(Person o1, Person o2) { return
		 * o1.getLastName().compareTo(o2.getLastName()); } });
		 */

		Collections.sort(list, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

		// 2: Print the sorted list
		System.out.println("List with sorting");
		printOnCondition(list, p -> true);

		// 3: Print the list data which has lastname start with K - Lambda way
		System.out.println("List with last name start with K");
		/*
		 * printOnCondition(list, new Condition() {
		 * 
		 * @Override public boolean testCondition(Person p) { return
		 * p.getLastName().startsWith("K"); }
		 * 
		 * });
		 */

		printOnCondition(list, p -> p.getLastName().startsWith("K"));

		// 4: Print the list data which has firstname start with A - Lambda way
		System.out.println("List with first name start with A");
		/*
		 * printOnCondition(list, new Condition() {
		 * 
		 * @Override public boolean testCondition(Person p) { return
		 * p.getFirstName().startsWith("A"); }
		 * 
		 * });
		 */
		printOnCondition(list, p -> p.getFirstName().startsWith("A"));

	}

	private static void printOnCondition(List<Person> list, Predicate<Person> predicate) {
		for (Person person : list) {
			if (predicate.test(person))
				System.out.println(person.toString());
		}
	}
}
