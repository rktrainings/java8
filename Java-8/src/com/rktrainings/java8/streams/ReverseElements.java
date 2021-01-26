package com.rktrainings.java8.streams;

import java.util.*; 
import java.util.stream.*; 
/**
 * @author RavikumarPothannagar
 *
 */


public class ReverseElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Get the parallel stream
		List<Integer> lists = Arrays.asList(11, 22, 33, 44);
		Stream<Integer> stream = lists.parallelStream();

		System.out.println("----------------------");
		// Reverse and print the elements
		stream.collect(reverseStreamUsingColectors()).forEach(System.out::println);

		System.out.println("----------------------");
		stream = lists.parallelStream();
		// Reverse and print the elements
		Iterator<Integer> reverse = reverseStreamUsingLinkedList(stream);
		reverse.forEachRemaining(System.out::println);
	}

	/*
	 * Below are the various ways to do so:
	 * 
	 * Using Collectors class : Since Streams in Java don’t store any elements,
	 * therefore, an intermediate collection is used for creating a new stream with
	 * the help of Collectors Class. Algorithm: Get the parallel stream. Convert the
	 * stream to list using Collectors.toList() method. For this list, reverse its
	 * elements using Collections.reverse() method. Convert this reversed list to
	 * stream using List.stream() method. Return/Print this stream with elements
	 * reversed.
	 * 
	 * Below is the implementation of the above approach:
	 */
	// Generic function to reverse
	// the elements of the parallel stream
	public static <T> Collector<T, ?, Stream<T>> reverseStreamUsingColectors() {
		return Collectors.collectingAndThen(Collectors.toList(), list -> {
			Collections.reverse(list);
			return list.stream();
		});
	}

	// Generic function to reverse
	// the elements of the parallel stream
	public static <T> Iterator<T> reverseStreamUsingLinkedList(Stream<T> stream) {
		return stream.collect(Collectors.toCollection(LinkedList::new)).descendingIterator();
	}
}
