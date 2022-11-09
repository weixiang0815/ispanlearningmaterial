import java.util.TimeZone;

public class TimeZoneDemo {

	public static void main(String[] args) {
		TimeZone tz = TimeZone.getDefault();
		System.out.println(tz.getID());
//		String[] ids = TimeZone.getAvailableIDs();
//		for(String s : ids) {
//			System.out.println(s);
//		}
		tz.setID("America/New_York");
		System.out.println(tz.getID());
	}

}
