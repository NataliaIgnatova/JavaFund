package com.mycompany.exercises;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Plese enter number:");
		double a = in.nextDouble();
		System.out.println("Plese enter number:");
		double b = in.nextDouble();
		System.out.println("Plese enter number:");
		double c = in.nextDouble();
		double perimeter = a + b + c;
		if (a == b && b == c) {
			System.out.println("Равностранен");
			System.out.println("Периметърът е: "+perimeter);
		}else{
			if(a==b && b!=c){
				System.out.println("Равнобедрен");
				System.out.println("Периметърът е: "+perimeter);
			}else{
				if(a!=b && b!=c && a!=c){
					System.out.println("Разностранен");
					System.out.println("Периметърът е: "+perimeter);
				}
			}
		}
	}
}
