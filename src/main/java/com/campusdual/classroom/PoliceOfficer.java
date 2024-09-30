package com.campusdual.classroom;

public class PoliceOfficer extends Person {

	protected String squad;

	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}

//	@Override
//	public StringBuilder getDetails(){
//		StringBuilder builder = new StringBuilder();
//		builder.append(super.getDetails());
//		builder.append(", ");
//		builder.append("su escuadra es ");
//		builder.append(this.squad);
//		builder.append(".");
//		return  builder;
//	}
public void getDetails() {
	System.out.println(super.name + " " + super.surname + ", su escuadra es " + this.squad);
}
}
