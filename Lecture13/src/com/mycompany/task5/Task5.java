package com.mycompany.task5;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = in.nextLine();
		String[] arr = input.split(" ");
		int count=0;
		for(String s:arr){
			count++;
		}
		System.out.println("words is: "+count);
	}

}
