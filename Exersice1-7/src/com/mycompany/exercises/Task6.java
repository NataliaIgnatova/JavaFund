package com.mycompany.exercises;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number!");
		int input=in.nextInt();
		for(int i =1;i<=input;i++) System.out.println(i+" ");
		for(int i=1;i<=input;i=i+3) System.out.print(i+" ");
		System.out.println(" ");
		for(int i=1;i<=input;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}else{
				continue;
			}
		}
		System.out.println(" ");
		while(input>0){
			System.out.print(input+" ");
			input=input-4;
			if(input%81==0) break;
		}
		
	}

}
