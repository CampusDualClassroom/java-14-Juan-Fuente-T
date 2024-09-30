package com.campusdual.classroom;

public class Person {
	protected String name;
	protected String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	public String getDetails(){
		System.out.println(this.name + " " + this.surname);
		return  this.name + this.surname;
	}
}
