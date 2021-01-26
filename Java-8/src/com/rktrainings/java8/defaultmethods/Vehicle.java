/**
 * 
 */
package com.rktrainings.java8.defaultmethods;

/**
 * @author RavikumarPothannagar
 *
 */
public interface Vehicle {
	default void print() {
		System.out.println("I am a vehicle!");
	}
	
	static void blowHorn() {
		System.out.println("Blowing horn!!!");
	}
}
