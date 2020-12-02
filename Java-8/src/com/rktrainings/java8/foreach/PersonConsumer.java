/**
 * 
 */
package com.rktrainings.java8.foreach;

import java.util.function.Consumer;

/**
 * @author RavikumarPothannagar
 *
 */
public class PersonConsumer implements Consumer<Person> {

	@Override
	public void accept(Person p) {
		System.out.println("Consumer impl Value::"+p.getPersonId());

	}

}
