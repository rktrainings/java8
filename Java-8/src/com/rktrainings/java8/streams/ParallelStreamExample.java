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
public class ParallelStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create a list
		List<String> list = Arrays.asList("Hello ", "R", "A", "V", "I", "K", "U", "M", "A", "R", "!");

		// using parallelStream()
		// method for parallel stream
		list.parallelStream().forEach(System.out::print);

	}

}
