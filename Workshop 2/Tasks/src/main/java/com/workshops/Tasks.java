package com.workshops;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Tasks {
	// Task 1
	public static void intStreams() {
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum = intList.stream()
				.filter(n -> n % 2 == 0)
				.map(n -> n / 2)
				.reduce(0, Integer::sum);

		System.out.println(sum);
	}

	// Task 2
	public static void objStreams() {
		List<Employee> employees = Arrays.asList(
			new Employee("1", "John", 35, 50000),
			new Employee("2", "Emma", 29, 47000),
			new Employee("3", "Michael", 42, 62000),
			new Employee("4", "Sophia", 31, 53000),
			new Employee("5", "David", 38, 59000)
		);

		printStream(employees);
		System.out.println(getAverageAge(employees));
		System.out.println();
		increaseSalary(employees);
		printStream(employees);
	}

	static private void printStream(List<Employee> employees) {
		employees.stream()
				.forEach(e -> System.out.println(e.toString()));
	}

	static private double getAverageAge(List<Employee> employees) {
		return employees.stream()
				.map(Employee::getAge)
				.mapToInt(Integer::intValue)
				.average()
				.getAsDouble();

	}

	static private void increaseSalary(List<Employee> employees) {
		employees.stream()
				.forEach(e -> e.setSalary(e.getSalary() + 100));
	}

	// Task 3
	public static void strStream() {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		List<String> alphabetChars = Arrays.asList(alphabet.split(""));

		// Print vowels
		System.out.println("--- Vowels ---");

		System.out.println(
			alphabetChars.stream()
				.filter("aeiou"::contains)
				.collect(Collectors.joining(""))
		);

		System.out.println();

		// Print uppercase alphabet
		System.out.println("--- Uppercase Alphabet ---");

		System.out.println(
				alphabetChars.stream()
						.map(String::toUpperCase)
						.collect(Collectors.joining(""))
		);

		System.out.println();

		// Mixed case string
		System.out.println("--- Mixed Case String ---");

		String mixedString = "KAmPCcDoSebaycqUyuJvMXIoeMrISJYVQDXrtLai";

		System.out.printf("Mixed String: %s\n", mixedString);

		List<String> mixedChars = Arrays.asList(mixedString.split(""));

		String upperCaseChars = mixedChars.stream()
				.filter(c -> c.equals(c.toUpperCase()))
				.collect(Collectors.joining(""));

		String lowerCaseChars = mixedChars.stream()
				.filter(c -> c.equals(c.toLowerCase()))
				.collect(Collectors.joining(""));

		System.out.println("--- Lower Case ---");
		System.out.println(lowerCaseChars);
		System.out.println("--- Upper Case ---");
		System.out.println(upperCaseChars);

	}
}
