package ch07.lab05.solution;

import java.util.Calendar;

public class StaticVariable {
	public static String comment = "固定的初值";
	static {
		Calendar c = Calendar.getInstance();
		if (c.get(Calendar.AM_PM) == Calendar.AM) {
			comment = "現在是上午";
		} else {
			comment = "現在是下午";
		}	
	}
}
