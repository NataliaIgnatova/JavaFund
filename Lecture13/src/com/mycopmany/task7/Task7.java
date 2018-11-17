package com.mycopmany.task7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		System.out.println(formatter.format(today));
	}

}
