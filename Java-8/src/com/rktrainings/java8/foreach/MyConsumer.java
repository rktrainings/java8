/**
 * 
 */
package com.rktrainings.java8.foreach;

import java.util.function.Consumer;

/**
 * @author RavikumarPothannagar
 *
 */
public class MyConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
			System.out.println("Consumer impl Value::"+t);
	}

}
