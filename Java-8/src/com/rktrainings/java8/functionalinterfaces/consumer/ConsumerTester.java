/**
 * 
 */
package com.rktrainings.java8.functionalinterfaces.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.rktrainings.java8.dto.Account;
import com.rktrainings.java8.dto.Person;

/**
 * @author RavikumarPothannagar
 *
 */
public class ConsumerTester{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//System.out.println("-------------------------------------------");
		//consumerPersonTest();
		//System.out.println("-------------------------------------------");
		//consumerIntegerTest();
		System.out.println("-------------------------------------------");
		comsumerTestData();
	}
	
	public static void consumerPersonTest(){
		
		List<Account> accounts = new ArrayList<Account>();
		Account account = new Account(1001L, "AC100", "GBS", "Active", "Cummerical");
		accounts.add(account);
		List<Person> persons = new ArrayList<Person>();
		for (int i = 101; i <= 110; i++)
			persons.add(new Person((long) i, "Ravikumar", "Pothannagari", "35", accounts));

		PersonConsumer pc = new PersonConsumer();
		persons.forEach(pc);
		
	}
	
	public static void consumerIntegerTest() {
		
		// creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			myList.add(i);

		// traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value::" + t);
			}
		});

		System.out.println("-------------------------------------------");
		
		// traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);

	}
	
	public static void comsumerTestData() {
		
		// Consumer to display a number 
        Consumer<Integer> display = a -> System.out.println(a); 
  
        // Implement display using accept() 
        display.accept(10); 
  
        // Consumer to multiply 2 to every integer of a list 
        Consumer<List<Integer> > modify = list -> 
        { 
            for (int i = 0; i <list.size(); i++) 
                list.set(i, 2 * list.get(i)); 
        }; 
        
     // Consumer to multiply 2 to every integer of a list 
        Consumer<List<Integer> > modify_err = list -> 
        { 
            for (int i = 0; i <=list.size(); i++) 
                list.set(i, 2 * list.get(i)); 
        }; 
  
        // Consumer to display a list of numbers 
        Consumer<List<Integer> > dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
        //Consumer<List<Integer> > dispList = list -> list.forEach(a -> System.out.print(a + " "));
  
        List<Integer> list = new ArrayList<Integer>(); 
        list.add(2); 
        list.add(1); 
        list.add(3); 
  
        // Implement modify using accept() 
        modify.accept(list); 
  
        // Implement dispList using accept() 
        dispList.accept(list); 
        
        System.out.println();
        // using addThen() 
        modify.andThen(dispList).accept(list); 
        
        
        // using addThen()
        System.out.println();
        try { 
            modify.andThen(null).accept(list); 
        } 
        catch (Exception e) { 
            System.out.println("Exception: " + e); 
        } 
        
        
        System.out.println();
        // using addThen() 
        try { 
            dispList.andThen(modify_err).accept(list); 
        } 
        catch (Exception e) { 
            System.out.println("Exception: " + e); 
        } 
        
    } 
	
}
