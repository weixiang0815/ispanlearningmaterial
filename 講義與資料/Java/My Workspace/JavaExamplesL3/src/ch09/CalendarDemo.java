package ch09;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {	
		Calendar c = Calendar.getInstance();
//		System.out.println(c.get(Calendar.YEAR));
//		System.out.println(c.get(Calendar.MONTH));
//		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		if (c.get(Calendar.AM_PM) == Calendar.AM)
			System.out.println("AM");
		else
			System.out.println("PM");
	}
}
