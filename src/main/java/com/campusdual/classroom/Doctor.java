package com.campusdual.classroom;


public class Doctor extends Person {

	protected String specialization;

	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}
//	@Override
//	public StringBuilder getDetails(){
//		StringBuilder builder = new StringBuilder();
//		builder.append(super.getDetails());
//		builder.append(", su especializacion es ");
//		builder.append(this.specialization.toLowerCase());
//		builder.append(".");
//		return  builder;
//	}
@Override
public String getDetails() {
	System.out.println(super.name + " " + super.surname + ", su especializacion es " + this.specialization);
	return super.name + ", " + super.surname + ", su especializacion es " + this.specialization;
}
}
