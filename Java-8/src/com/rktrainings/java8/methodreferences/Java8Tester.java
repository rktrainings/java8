/**
 * 
 */
package com.rktrainings.java8.methodreferences;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RavikumarPothannagar
 *
 */
public class Java8Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");
		
		names.forEach(System.out::println);
		//names.forEach(System.out::print);
		
	}

}
