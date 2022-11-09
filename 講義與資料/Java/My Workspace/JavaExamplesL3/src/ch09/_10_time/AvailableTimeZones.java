package ch09._10_time;

import java.util.Arrays;
import java.util.TimeZone;

public class AvailableTimeZones {
	public static  void listTimeZoneIDs() {
        String[] allTimeZones = TimeZone.getAvailableIDs();
        Arrays.sort(allTimeZones);
        for (String timezone : allTimeZones) {
            System.out.println(timezone);
        }
    }

    public static void main(String[] args) {
        listTimeZoneIDs();
    }
}
