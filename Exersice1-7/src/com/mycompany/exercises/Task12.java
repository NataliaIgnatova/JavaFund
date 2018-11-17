package com.mycompany.exercises;

import java.util.Scanner;

public class Task12 {
	public static int random(){
		double rand = Math.random()*10;
		int r = (int) rand;
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter number: ");
		int n=in.nextInt();
		int[][] matrix = new int[n][n];
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[1].length;j++){
				matrix[i][j]=random();
			}
		}
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[1].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println(" ");
		}
		int sum=0;
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
			sum+=matrix[j][i];
			}
			System.out.println("sum of column "+i+" is "+sum);
			sum=0;
		}
		
	}

}
