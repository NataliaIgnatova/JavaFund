package com.mycompany.first;

public class WeekendMenu implements Menu{
	
	Specialty specialty;
	
	public WeekendMenu(){
		
	}
	public WeekendMenu(Specialty specialty) {
		super();
		this.specialty = specialty;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

	@Override
	public Specialty specialtyOfTheDay() {
		// TODO Auto-generated method stub
		return Specialty.DISH1;
	}
	
}
