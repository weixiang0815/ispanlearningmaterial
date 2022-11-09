package ch05;

import java.util.GregorianCalendar;
//有兩種判斷閏年的方式
// 1.利用 GregorianCalendar類別的isLeapYear(int year)
// 2.利用條件
//   boolean leapYear = yy % 4 == 0 && yy % 100 != 0 || yy % 400 == 0;
public class LeapYear {
	public static void main(String[] args) {
		int count = 0;
		
		GregorianCalendar  gc = new GregorianCalendar();
		for (int yy = 1601; yy <= 2000; yy++) {
			if (gc.isLeapYear(yy))
				count++;
			
		}
		System.out.println("方法一：每400年，會有" +count+"閏年");
		
		count = 0 ;
		for (int yy = 1601; yy <= 2000; yy++) {
			boolean leapYear = yy % 4 == 0 && yy % 100 != 0 || yy % 400 == 0;
			if (leapYear){
			
				count++;
			}
			
		}
		System.out.println("方法二：每400年，會有" +count+"閏年");
	}
}


			

