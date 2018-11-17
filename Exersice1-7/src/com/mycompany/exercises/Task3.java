package com.mycompany.exercises;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Vuvedi ocenka:");
		double t1 = in.nextDouble();
		while (t1 < 2 || t1 > 6) {

			System.out.println("Ocenkata e nekorektna, molq vuvedi korektna ocenka:");
			t1 = in.nextDouble();
		}

		System.out.println("Vuvedi ocenka:");
		double t2 = in.nextDouble();
		while (t2 < 2 || t2 > 6) {
			System.out.println("Ocenkata e nekorektna, molq vuvedi korektna ocenka:");
			t2 = in.nextDouble();
		}

		System.out.println("Vuvedi ocenka:");
		double i = in.nextDouble();
		while (i < 2 || i > 6) {
			System.out.println("Ocenkata e nekorektna, molq vuvedi korektna ocenka:");
			i = in.nextDouble();
		}
		double score = (t1 + t2 + i) / 3;
		System.out.println("Score is: " + score);

	}

}
