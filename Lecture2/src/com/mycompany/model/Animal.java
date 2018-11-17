package com.mycompany.model;

public class Animal {

	double weight;
	String color;
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal firstAnimal = new Animal();
		Animal secondAnimal = new Animal();
		
		firstAnimal.weight = 40;
		firstAnimal.color = "Brown";
		firstAnimal.name = "Perry";
		
		secondAnimal.weight = 100;
		secondAnimal.color = "black";
		secondAnimal.name = "Sean";
		
		System.out.println("First animal weight: " + firstAnimal.weight + 
				", color: "  +firstAnimal.color + ", name: " + firstAnimal.name);
		
		System.out.println("First animal weight: " + secondAnimal.weight +
				", color: "  +secondAnimal.color + ", name: " + secondAnimal.name);
		

		System.out.println(3>>1);

		System.out.println(3<<1);

	}

}
