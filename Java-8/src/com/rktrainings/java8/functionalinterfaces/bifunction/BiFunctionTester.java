/**
 * 
 */
package com.rktrainings.java8.functionalinterfaces.bifunction;

import java.util.function.BiFunction;



/**
 * @author RavikumarPothannagar
 *
 */
public class BiFunctionTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("*******Method reference to a static method of a class multiply*************");
		BiFunction<Integer, Integer, Integer> product1 = BiFunctionTester::multiply;  
		int pr1 = product1.apply(10, 5);  
		System.out.println("Product of given number is: "+pr1);
		System.out.println();
		
		System.out.println("*******Calling the method of functional interface division*************");
		BiFunction<Integer, Integer, Integer> product2 = BiFunctionTester::division;  
		int pr2 = product2.apply(10, 5);  
		System.out.println("Product of given number is: "+pr2);
		System.out.println();
		
		
		System.out.println("*******Calling the method of functional interface fullName*************");
		BiFunction<String, String, String> product3 = BiFunctionTester::fullName;  
		String pr3 = product3.apply("Ravikumar", "Pothannagari");  
		System.out.println("Product of given number is: "+pr3);
		System.out.println();
	}
	
	
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static int division(int a, int b) {
		return a / b;
	}
	
	public static String fullName(String firstName, String lastName) {
		return firstName+" "+lastName;
	}

}
