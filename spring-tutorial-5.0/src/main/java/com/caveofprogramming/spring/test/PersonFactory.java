package com.caveofprogramming.spring.test;

public class PersonFactory {

	public Person createPerson(int id, String name) {
		System.out.println("Using factory to create a person");
		return new Person(id, name);
	}
}
