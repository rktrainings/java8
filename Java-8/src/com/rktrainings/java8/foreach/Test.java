/**
 * 
 */
package com.rktrainings.java8.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import com.rktrainings.java8.dto.Account;
import com.rktrainings.java8.dto.Person;
import com.rktrainings.java8.functionalinterfaces.consumer.PersonConsumer;

/**
 * @author RavikumarPothannagar
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Account> accounts = new ArrayList<Account>();

		List<Person> myList = new ArrayList<Person>();
		for (int i = 101; i <=110; i++)
			myList.add(new Person((long)i, "Ravi", "Kumar", "35", accounts));

		// traversing using Iterator
		/*
		Iterator<Person> it = myList.iterator();
		while (it.hasNext()) {
			Person i = it.next();
			System.out.println("Iterator Value::" + i);
		}*/

		// traversing through forEach method of Iterable with anonymous class
		/*
		myList.forEach(new Consumer<Person>() {
			public void accept(Person t) {
				System.out.println("forEach anonymous class Value::" + t);
			}
		});*/
		
		// traversing with Consumer interface implementation
			PersonConsumer action = new PersonConsumer();
			myList.forEach(action);
	}

}
