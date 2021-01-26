/**
 * 
 */
package com.rktrainings.java8.streams;

import java.util.Arrays;
import java.util.List;

/**
 * @author RavikumarPothannagar
 *
 */
public class ParallelStreamWithOrderedIteration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create a list
		List<String> list = Arrays.asList("Hello ", "R", "A", "V", "I", "K", "U", "M", "A", "R", "!");

		// using parallelStream() method for parallel stream
		//If we want to make each element in the parallel stream to be ordered, we can use the forEachOrdered() method, instead of the forEach() method.
		list.parallelStream().forEachOrdered(System.out::print);

	}

}
