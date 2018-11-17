package com.mycompany.task2;

public class PhoneBookItem {
	private String name;
	private String number;

	public PhoneBookItem() {

	}

	public PhoneBookItem(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getNumber(){
		return this.number;
	}
}
