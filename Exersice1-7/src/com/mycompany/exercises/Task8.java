package com.mycompany.exercises;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter n: ");
		int n=in.nextInt();
		for(int i=n;i>0;i--){
			for(int j=i-1;j>0;j--){
				System.out.print("* ");
				
			}
			System.out.println("* ");
			
		}
	}

}
