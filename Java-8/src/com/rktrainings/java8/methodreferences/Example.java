/**
 * 
 */
package com.rktrainings.java8.methodreferences;
import java.util.Arrays;
import java.util.function.BiFunction;
/**
 * @author RavikumarPothannagar
 *
 */
public class Example {

	public void myMethod() {
		System.out.println("Instance Method");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Example obj = new Example();
		
		// Method reference using the object of the class
		MyInterface ref = obj::myMethod;
		
		// Calling the method of functional interface
		ref.display();
		
		
		//2. Method reference to a static method of a class
		BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;  
		int pr = product.apply(11, 5);  
		System.out.println("Product of given number is: "+pr);
		
		
		//3. Method reference to an instance method of an arbitrary object of a particular type
		String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
		/* Method reference to an instance method of an arbitrary 
		 * object of a particular type
		 */
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		for(String str: stringArray){
			System.out.println(str);
		}
		
		//4. Method reference to a constructor
		//Method reference to a constructor
        HelloInterface hello = Hello::new;  
        hello.display("Hello World!"); 
	}

}
