/**
 * 
 */
package com.rktrainings.java8.functionalinterfaces.consumer;

import java.util.function.Consumer;

import com.rktrainings.java8.dto.Person;

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
