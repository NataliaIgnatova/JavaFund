package com.mycompany.task4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter new task");
		String input = in.nextLine();
		String newIn = input.replaceAll("what is ", "");
		String sub = newIn.substring(0, newIn.length() - 1);
		while (sub.contains("divided") || sub.contains("minus") || sub.contains("plus") || sub.contains("multiply")) {
			if (sub.contains("divided")) {
				sub = sub.replaceAll("divided by", "/");

			} else if (sub.contains("minus")) {
				sub = sub.replaceAll("minus", "-");
			} else if (sub.contains("plus")) {
				sub = sub.replaceAll("plus", "+");
			} else if (sub.contains("multiply by")) {
				sub = sub.replaceAll("multiply by", "*");
			}
		}
		//System.out.println(sub);
		String[] str = sub.split(" ");
		int[] numbers = new int[str.length - 1];
		String[] sym = new String[str.length - 2];
		int numberCounter = 0;
		int charCounter = 0;
		for (int i = 0; i < str.length; i++) {
			//System.out.println(str[i]);
			try {
				int n = Integer.parseInt(str[i]);

				numbers[numberCounter++] = n;

			} catch (Exception e) {
				String c = str[i];
				sym[charCounter++] = c;

			}
		}
		
		  for (int i = 0; i < numbers.length-1; i++) { System.out.println(numbers[i]); 
		  // System.out.println(sym[i]);
		  }
		 
		for (int i = 0; i < sym.length-1; i++) {
			System.out.println("sym"+sym[i]);
			for (int j = 0; j < numbers.length - 1; j++) {
				if (sym[i].equals("/")) {
					numbers[j]= numbers[j]/numbers[j+1];
					System.out.println(numbers[j]);
				} else if (sym[i].equals("*")) {
					numbers[j]=numbers[j] * numbers[j + 1];
					System.out.println(numbers[j]);
				} else if (sym[i].equals("+")) {
					numbers[j]=numbers[j] + numbers[j + 1];
					System.out.println(numbers[j]);
				} else if (sym[i].equals("-")) {
					numbers[j]=numbers[j]-numbers[j+1];
					System.out.println(numbers[j]);
				}
			}
		}

	}

}
