package com.mycompany.exercises;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = in.nextLine();
		if(name.toLowerCase().equals("natalia")){
			System.out.println("Same name with me!");
		}else{
			System.out.println("Our names are different!");
		}

	}

}
