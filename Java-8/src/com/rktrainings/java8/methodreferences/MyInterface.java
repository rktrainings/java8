/**
 * 
 */
package com.rktrainings.java8.methodreferences;

/**
 * @author RavikumarPothannagar
 *
 */


/*
 * 
 An informative annotation type used to indicate that an interface type declaration is intended to be a functional interface as defined by the Java Language Specification.Conceptually, 
 a functional interface has exactly one abstract method. Since default methods have an implementation, they are not abstract. 
 If an interface declares an abstract method overriding one of the public methods of java.lang.Object, 
 that also does not count toward the interface's abstract method count since any implementation of the interface will have an implementation from java.lang.Object or elsewhere. 

Note that instances of functional interfaces can be created with lambda expressions, method references, or constructor references. 

If a type is annotated with this annotation type, compilers are required to generate an error message unless: 
� The type is an interface type and not an annotation type, enum, or class. 
� The annotated type satisfies the requirements of a functional interface. 

However, the compiler will treat any interface meeting the definition of a functional interface as a functional interface regardless of whether or not a FunctionalInterfaceannotation is present on the interface declaration.

 */

@FunctionalInterface
public interface MyInterface {
	 void display();
	 
	default void display1() {
		 System.out.println("default method:");
	 }
	
	static void display2() {
		 System.out.println("static method:");
	 }
}
