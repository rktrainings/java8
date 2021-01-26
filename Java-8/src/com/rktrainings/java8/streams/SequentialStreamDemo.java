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
public class SequentialStreamDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create a list
		List<String> list = Arrays.asList("Hello ", "R", "A", "V", "I", "K", "U", "M", "A", "R", "!");

		// we are using stream() method
		// for sequential stream
		// Iterate and print each element
		// of the stream
		list.stream().forEach(System.out::print);
	}

}
