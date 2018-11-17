package com.mycompany.task8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy hh:MM:ss");
		DateFormat dform = new SimpleDateFormat("dd.MM.yyyy");
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		Scanner in = new Scanner(System.in);
		String first = in.nextLine();
		String second = in.nextLine();
		try{
			Date date1 = dform.parse(first);
			Date date2 = dform.parse(second);
			long diff = date2.getTime()-date1.getTime();
			System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		
		//add 12 days
		cal.add(cal.DATE, 12);
		System.out.println(df.format(cal.getTime()));
		
		//Next Friday
		LocalDate dt = LocalDate.now();	
		System.out.println("Next friday: "+dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
	}

}
