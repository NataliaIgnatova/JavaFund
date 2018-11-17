package com.mycompany.exercises;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("please enter n: ");
		int n = in.nextInt();
		int[] arr = {32,1,4,2,12,52,65,87,3,9};
		int idx=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==n){
				idx=i;
			}
		}
		if(idx!=-1){
			System.out.println("Found in index: "+idx);
		}else{
			System.out.println("Sorry, not found!");
		}
			
		
	}

}
