import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeProcessing {

	public static void main(String[] args) {
		Date d = new Date();
		TimeZone gmt = TimeZone.getTimeZone("GMT");
		TimeZone.setDefault(gmt);
		GregorianCalendar gc = new GregorianCalendar();
		long now = System.currentTimeMillis();
		System.out.println(now);
		System.out.println(d);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒 SSS毫秒");
//		Date d = new Date(0);
//		String dateString = sdf.format(d);
//		String dateString1 = sdf1.format(d);
//		
//		System.out.println(dateString);
//		System.out.println(dateString1);
//		System.out.println(sdf.format(now));
		System.out.println(sdf1.format(now));
		
		long totalMillis = 0;
		
//		GregorianCalendar gc = new GregorianCalendar();
		int yy = gc.get(Calendar.YEAR);
		int mm = gc.get(Calendar.MONTH);
		int dd = gc.get(Calendar.DAY_OF_MONTH);
		int hh = gc.get(Calendar.HOUR_OF_DAY);
		int ii = gc.get(Calendar.MINUTE);
		int ss = gc.get(Calendar.SECOND);
		int ms = gc.get(Calendar.MILLISECOND);
		System.out.println(yy + ", " + (mm + 1) + ", " + dd + ", " + hh + ", " + mm + ", "
				+ ii + ", " + ss + ", " + ms);
		int totalDays = 0;
		for(int y = 1970; y <= yy-1; y++) {
			totalDays += gc.isLeapYear(y) ? 366 : 365;
		}
		totalDays += dayCount(yy, mm + 1, dd-1);
		totalMillis = totalDays * 86400 * 1000L;
		totalMillis += hh * 60 * 60 * 1000L + ii * 60 * 1000L + ss * 1000L + ms;
		System.out.println(totalMillis);
		System.out.println(totalMillis - now);
	}

	static public int dayCount(int yy, int mm, int dd) {
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		GregorianCalendar gc = new GregorianCalendar();
		days[2] = gc.isLeapYear(yy) ? 29 : 28;

		int total = 0;
		for (int i = 1; i <= mm - 1; i++) {
			total += days[i];
		}
		total += dd;
		
		return total;
	}

}
