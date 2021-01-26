package com.rktrainings.java8.streams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author RavikumarPothannagar
 *
 */
public class FileReadingUsingStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println();
		System.out.println("--------------");
		readFileUsingParallel();
		System.out.println("--------------");
		readFileUsingParallelStream();
	}

	public static void readFileUsingParallel() {

		try {
			// Create a File object
			File fileName = new File(
					"C:\\Users\\RavikumarPothannagar\\git\\rktrainings\\java8\\Java-8\\src\\com\\rktrainings\\java8\\streams\\names.txt");

			// Create a Stream of String type
			// Using the lines() method to read one line at a time
			// from the text file
			Stream<String> text = Files.lines(fileName.toPath());

			// Use StreamObject.parallel() to create parallel streams
			// Use forEach() to print the lines on the console
			text.parallel().forEach(System.out::println);

			// Close the Stream
			text.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void readFileUsingParallelStream() {

		try {
			// Create a File object
			File fileName = new File(
					"C:\\Users\\RavikumarPothannagar\\git\\rktrainings\\java8\\Java-8\\src\\com\\rktrainings\\java8\\streams\\names.txt");

			// Create a List
			// Using readAllLines() read the lines of the text file
			List<String> text = Files.readAllLines(fileName.toPath());

			// Using parallelStream() to create parallel streams
			text.parallelStream().forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
