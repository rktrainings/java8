/**
 * 
 */
package com.rktrainings.java8.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author RavikumarPothannagar
 *
 */
public class Test {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Using Java 8: ");
		System.out.println("---------------------------------------");

		List<String> strings = Arrays.asList("Lois", "Brenda", "Joe", "Diane", "Benjamin", "Patrick", "Nancy", "Carol",
				"Frances", "Diana", "Ralph", "Jack", "Melissa", "Wayne", "Cheryl", "Paula", "Joshua", "Theresa",
				"Ralph", "Jack", "Melissa");

		System.out.println(strings);

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);

		long totalcount = strings.stream().count();
		System.out.println("totalcount:" + totalcount);

		long count = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Empty Strings: " + count);

		count = strings.stream().filter(string -> string.length() >= 15).count();
		System.out.println("Strings of length 15: " + count);

		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("Filtered List: " + filtered);

		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);

		System.out.println("Distinct String: " + strings.stream().distinct().collect(Collectors.toList()));

		System.out.println(
				"Distinct1 String: " + strings.stream().map(string -> string).distinct().collect(Collectors.toList()));

		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.println("Squares List: " + squaresList);

		System.out.println("List: " + integers);

		IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();

		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
		System.out.println("Random Numbers: ");

		Random random = new Random();
		random.ints().limit(10).sorted().forEach(System.out::println);

		// parallel processing
		count = strings.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.println("Empty Strings: " + count);

	}
}
