import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class TimeZoneDemo2 {

	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		TimeZone tz = TimeZone.getTimeZone("America/New_York");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf.setTimeZone(tz);
		String timeNY = sdf.format(now);
		System.out.println(timeNY);
		
		TimeZone tk = TimeZone.getTimeZone("Asia/Tokyo");
		sdf.setTimeZone(tk);
		String timeTK = sdf.format(now);
		System.out.println(timeTK);
	}

}
