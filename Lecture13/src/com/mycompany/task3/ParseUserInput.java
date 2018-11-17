package com.mycompany.task3;

import java.util.Scanner;

public class ParseUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a URL: ");
		String userIn = in.nextLine();
		String newUserIn = userIn.replaceAll("//", "/");
		String[] input = newUserIn.split("/");
		for(int i=0;i<input.length;i++){
			System.out.print(input[i]+"; ");
		}
	}

}
