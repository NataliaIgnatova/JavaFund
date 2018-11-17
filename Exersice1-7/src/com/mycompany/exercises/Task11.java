package com.mycompany.exercises;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1={1,5,2,6,7,12,13};
		int[] arr2={1,5,2,6,7,12,12};
		boolean isEqual=false;
		if(arr1.length==arr2.length){
			for(int i=0;i<arr1.length;i++){
				if(arr1[i]==arr2[i]){
					/*System.out.println("Equal");*/
					isEqual=true;
				}else{
//					System.out.println("Different");
					isEqual=false;
				}
				
			}
		}else{
			isEqual=false;
		}
		System.out.println("Is equal? "+isEqual);
	}

}
