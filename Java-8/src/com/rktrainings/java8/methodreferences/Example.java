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
		System.out.println("*******Calling the method of functional interface*************");
		ref.display();
		System.out.println();
		
		//default method
		System.out.println("*******default method*************");
		ref.display1();
		System.out.println();
		
		//static method
		System.out.println("*******static method*************");
		MyInterface.display2();
		System.out.println();
		
		//2. Method reference to a static method of a class
		System.out.println("*******Method reference to a static method of a class multiply*************");
		BiFunction<Integer, Integer, Integer> product1 = Multiplication::multiply;  
		int pr1 = product1.apply(10, 5);  
		System.out.println("Product of given number is: "+pr1);
		System.out.println();
		
		System.out.println("*******Calling the method of functional interface division*************");
		BiFunction<Integer, Integer, Integer> product2 = Multiplication::division;  
		int pr2 = product2.apply(10, 5);  
		System.out.println("Product of given number is: "+pr2);
		System.out.println();
		
		
		System.out.println("*******Calling the method of functional interface fullName*************");
		BiFunction<String, String, String> product3 = Multiplication::fullName;  
		String pr3 = product3.apply("Ravikumar", "Pothannagari");  
		System.out.println("Product of given number is: "+pr3);
		System.out.println();
		
		
		//3. Method reference to an instance method of an arbitrary object of a particular type
		System.out.println("*******Method reference to an instance method of an arbitrary object of a particular type*************");
		String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
		/* Method reference to an instance method of an arbitrary 
		 * object of a particular type
		 */
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		
		
		for(String str: stringArray){
			System.out.println(str);
		}
	
		System.out.println();
		
		//4. Method reference to a constructor
		System.out.println("*******Method reference to a constructor*************");
        HelloInterface hello = Hello::new;  
        hello.display("Hello World!"); 
        System.out.println();
	}

}
