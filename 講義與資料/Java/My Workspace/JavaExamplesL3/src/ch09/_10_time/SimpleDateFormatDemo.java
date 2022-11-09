package ch09._10_time;

import java.text.SimpleDateFormat;

public class SimpleDateFormatDemo {
 	public static void main(String[] args) {
		// 1、以yyyy-MM-dd印出今天的日期:
		java.util.Date date1 = new java.util.Date();
		// java.text.SimpleDateFormat
		SimpleDateFormat  sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(date1));
			
		// 2、以yyyy年MM月dd日印出今天的日期:
		java.util.Date date2 = new java.util.Date();
		// java.text.SimpleDateFormat
		SimpleDateFormat  sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(sdf2.format(date2));
		
		// 3、以『yyyy年MM月dd日 HH時mm分ss秒』 印出時間:

		java.util.Date date3 = new java.util.Date();
		// java.text.SimpleDateFormat
		SimpleDateFormat  sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
		System.out.println(sdf3.format(date3));
	}
}
