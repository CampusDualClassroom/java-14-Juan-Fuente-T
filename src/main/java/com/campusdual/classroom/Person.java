package com.campusdual.classroom;

public class Person {
	protected String name;
	protected String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
//	public String getDetails(){
//		System.out.println(this.name + " " + this.surname);
//		return  this.name + this.surname;
//	}
//public StringBuilder getDetails() {
//	StringBuilder builder = new StringBuilder();
//	builder.append("La persona es ");
//	builder.append(this.name);
//	builder.append(" ");
//	builder.append(this.surname);
//	return builder;
// }
	public String getDetails() {
		System.out.println(this.name + " " + this.surname );
		return this.name + " " + this.surname;
	}
}
