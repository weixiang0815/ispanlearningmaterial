import java.util.GregorianCalendar;

public class DayCount {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		
		int yy = 2021;
		int mm = 12;
		int dd = 31;
		int totalDays = dayCount(yy, mm, dd);
		System.out.println(yy+"年" + mm +"月" + dd + "日是該年的第" + totalDays + "天");
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
