import java.util.Arrays;
import java.util.TimeZone;

public class TimeZoneDemo {

	public static void main(String[] args) {
		TimeZone tz = TimeZone.getDefault();
		System.out.println(tz);
		String[]  ids =  TimeZone.getAvailableIDs();
		Arrays.sort(ids);
		for(String s : ids  ) {
			System.out.println(s);
		}

	}

}
