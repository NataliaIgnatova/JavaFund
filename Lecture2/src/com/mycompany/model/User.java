package com.mycompany.model;

public class User {
	
	String firstName;
	String lastName;
	byte age;
	char gender;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User firstUser = new User();
		firstUser.firstName = "Ivan";
		firstUser.lastName = "Grigorov";
		firstUser.age = 20;
		firstUser.gender = 'm';
		User secondUser = new User();
		secondUser.firstName = "Simona";
		secondUser.lastName = "Petkova";
		secondUser.age = 34;
		secondUser.gender = 'f';
		
		System.out.println("Firstname: " + firstUser.firstName + ", Lastname: " + firstUser.lastName + ", Age: " + firstUser.age + ", Gender: " + firstUser.gender);

		System.out.println("Firstname: " + secondUser.firstName + ", Lastname: " + secondUser.lastName + ", Age: " + secondUser.age + ", Gender: " + secondUser.gender);

	}

}
