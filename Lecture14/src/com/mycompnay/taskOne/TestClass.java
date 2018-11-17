package com.mycompnay.taskOne;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CommonBox<Integer> cb = new CommonBox<>(3);
		CommonBox<Integer> commb = new CommonBox<>(6);
		System.out.println(cb.getVar());
		System.out.println(cb.toString());
		System.out.println(commb.getVar());
		System.out.println(commb.toString());		

	}

}
