package com.campusdual.classroom;

public class Person {
	protected String name;
	protected String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

//public StringBuilder getDetails() {
//	StringBuilder builder = new StringBuilder();
//	builder.append("La persona es ");
//	builder.append(this.name);
//	builder.append(" ");
//	builder.append(this.surname);
//	return builder;
// }
	public void getDetails() {
		System.out.println("La persona es " + this.name + " " + this.surname );
	}
}
