/**
 * 
 */
package com.rktrainings.java8.dto;

import java.util.List;

/**
 * @author RavikumarPothannagar
 *
 */
public class Person {
	
	private Long personId;
	private String firstName;
    private String lastName;
    private String age;
    private List<Account> accounts;
    
    
	/**
	 * @param personId
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param accounts
	 */
	public Person(Long personId, String firstName, String lastName, String age, List<Account> accounts) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.accounts = accounts;
	}

    public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", accounts=" + accounts + "]";
	}
	
	
    
}
