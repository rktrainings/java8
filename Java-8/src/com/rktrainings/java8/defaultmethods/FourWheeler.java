/**
 * 
 */
package com.rktrainings.java8.defaultmethods;

/**
 * @author RavikumarPothannagar
 *
 */
public interface FourWheeler {
	default void print() {
		System.out.println("I am a FourWheeler!");
	}
}
