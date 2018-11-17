package com.mycompany.exercises;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a note");
		int note = in.nextInt();
		while (note < 2 || note > 6) {
			System.out.println("Incorrect input!Please enter correct note!");
			note = in.nextInt();
		}
		switch (note) {
		case 2:
			System.out.println("Слаб");
			break;
		case 3:
			System.out.println("Среден");
			break;
		case 4:
			System.out.println("Добър");
			break;
		case 5:
			System.out.println("Много добър");
			break;
		case 6:
			System.out.println("Отличен");
			break;

		}
	}

}
