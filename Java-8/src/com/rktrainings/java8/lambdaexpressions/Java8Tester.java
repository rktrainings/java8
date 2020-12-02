/**
 * 
 */
package com.rktrainings.java8.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author RavikumarPothannagar
 *
 */
public class Java8Tester {
	
	public static void main(String args[]) {
		
		List<String> names1 = new ArrayList<String>();
		names1.add("Mahesh");
		names1.add("Suresh");
		names1.add("Ramesh");
		names1.add("Naresh");
		names1.add("Kalpesh");
		
		
		List<String> names2 = new ArrayList<String>();
		names2.add("Mahesh");
		names2.add("Suresh");
		names2.add("Ramesh");
		names2.add("Naresh");
		names2.add("Kalpesh");
		
		
		Java8Tester tester = new Java8Tester();
		
		System.out.println("Sort using Java 7 syntax:");
		tester.sortUsingJava7(names1);
		System.out.println(names1);
		
		System.out.println("Sort using Java 8 syntax:");
		tester.sortUsingJava8(names2);
		System.out.println(names2);
		
		
		tester.sortByName(names1);
		
		
	}

	private void sortByName(List<String> names1) {

		Collections.sort(names1, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		}

		);
	}

	private void sortUsingJava8(List<String> names) {
		
		Collections.sort(names, (s1,s2) -> s1.compareTo(s2));
	}

	private void sortUsingJava7(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});

	}
	
}
