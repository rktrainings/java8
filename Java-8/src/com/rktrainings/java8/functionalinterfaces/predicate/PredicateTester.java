/**
 * 
 */
package com.rktrainings.java8.functionalinterfaces.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author RavikumarPothannagar
 *
 */
public class PredicateTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,8);
		//list.forEach(System.out::println);
		/*
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		*/
		// Collections.sort(list,(o1,o2)->o1.compareTo(o2));
		//System.out.println("************************");
		//list.forEach(System.out::println);
		//Predicate<Integer> predicate = n -> n%2==0;
		
		System.out.println("*********print all numbers***************");
		Predicate<Integer> predicateAll = n -> true;
		eval(list,predicateAll);
		
		System.out.println("*********print even numbers***************");
		Predicate<Integer> predicateEven = n -> n%2==0;
		eval(list,predicateEven);
		
		System.out.println("*********print odd numbers***************");
		Predicate<Integer> predicateOdd = n -> n%2 !=0;
		eval(list,predicateOdd);
		
		System.out.println("*********print grater than 5 numbers***************");
		Predicate<Integer> predicateGt = n -> n>5;
		eval(list,predicateGt);
		
		//eval(list,n->true);
		//eval(list,n-> n%2==0);
	}
	
	public static void eval(List<Integer> list, Predicate<Integer> predicate) {
		for(Integer n:list) {
			if(predicate.test(n)) {
				System.out.println(n + " ");
			}
		}
	}
}
