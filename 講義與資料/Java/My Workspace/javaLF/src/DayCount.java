import java.util.GregorianCalendar;

public class DayCount {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		
		int yy = 2021;
		int mm = 12;
		int dd = 31;
		int total = dayCount(yy, mm, dd);
		
		System.out.println(yy + "年" + mm + "月" + dd + "日是該年第" + total + "天");

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
