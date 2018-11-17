package com.mycompany.exercises;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("please enter a number");
		int n=in.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++){
			sum+=i;
		}

		System.out.println("Sum is: "+sum);
	}
}
