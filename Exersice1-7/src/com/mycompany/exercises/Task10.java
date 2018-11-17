package com.mycompany.exercises;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,4,23,5,12,17,82,91,19,7,1,5,17};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[i]);
				}
			}
		}
	}

}
