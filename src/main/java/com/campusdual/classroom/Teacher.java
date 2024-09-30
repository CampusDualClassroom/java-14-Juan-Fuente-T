package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}
	@Override
	public String getDetails() {
		System.out.println(this.name + " " + this.surname + ", " + this.area);
		return this.name + ", " + this.surname + ", " + this.area;
	}
}
