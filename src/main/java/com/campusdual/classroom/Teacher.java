package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}
//	@Override
//	public StringBuilder getDetails(){
//		StringBuilder builder = new StringBuilder();
//		builder.append(super.getDetails());
//		builder.append(", ");
//		builder.append("su area es ");
//		builder.append(this.area);
//		builder.append(".");
//		return  builder;
//	}

	@Override
	public void getDetails() {
		System.out.println(super.name + " " + super.surname + ", su area es " + this.area);
	}
}
