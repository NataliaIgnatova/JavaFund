package com.mycompany.first;

public class TestClass {
	
	public static void order(Menu menu){
		System.out.println(menu.specialtyOfTheDay());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu weekDay = new WeekDayMenu();
		order(weekDay);
		Menu weekendMenu = new WeekendMenu();
		order(weekendMenu);
		
	}

}
