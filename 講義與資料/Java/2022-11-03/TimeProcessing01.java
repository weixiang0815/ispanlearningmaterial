import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeProcessing01 {

	public static void main(String[] args) {
		TimeZone gmt= TimeZone.getTimeZone("GMT");
		TimeZone.setDefault(gmt); 
		Date d = new Date();
		System.out.println(d);
		GregorianCalendar  gc = new GregorianCalendar();
		long now = System.currentTimeMillis();
		System.out.println(now);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒 SSS豪秒");
//		Date d = new Date(now);
		
		String dateString = sdf1.format(now);
		
		long totalMillis = 0 ;
		
		
	    int yy = gc.get(Calendar.YEAR);
	    int mm = gc.get(Calendar.MONTH);
	    int dd = gc.get(Calendar.DAY_OF_MONTH);
	    int hh = gc.get(Calendar.HOUR_OF_DAY);
	    int ii = gc.get(Calendar.MINUTE);
	    int ss = gc.get(Calendar.SECOND);
	    int ms = gc.get(Calendar.MILLISECOND);
//	    System.out.println(dateString);
//	    System.out.println(yy + ", " + mm + ", " + dd + ", " + hh + ", " + ii+ ", " + ss + ", " + ms);
	    int totalDays = 0;
	    for (int y = 1970; y <= yy-1; y++) {
	    	if (gc.isLeapYear(y)) {
	    		totalDays += 366;
	    	} else {
	    		totalDays += 365;
	    	}
	    }
	    totalDays += dayCount(yy, mm+1, dd-1);
	    totalMillis = totalDays * 86400 * 1000L;
	    totalMillis += hh * 60 * 60 * 1000 + ii * 60 * 1000 + ss *1000 + ms;
	    System.out.println(totalMillis);
	    System.out.println(totalMillis - now);
	}
	public static int dayCount(int yy, int mm, int dd) {
		int [] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		GregorianCalendar gc = new GregorianCalendar();
		if (gc.isLeapYear(yy)) {
			days[2] = 29;
		} else {
			days[2] = 28;
		}
		int total = 0;
		for (int n = 1 ; n <= mm-1; n++) {
			total += days[n];
		}
		total += dd;
		return total;
	}
}
