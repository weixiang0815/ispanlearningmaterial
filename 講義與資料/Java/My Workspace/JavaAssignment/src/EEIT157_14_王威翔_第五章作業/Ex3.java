package EEIT157_14_王威翔_第五章作業;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		s.close();
		
		String[] date_str = str.split(",");
		int[] date = new int[date_str.length];
		for(int i = 0; i < date_str.length; i ++) {
			date[i] = Integer.parseInt(date_str[i]);
		}
		
		boolean flag = false;
		if(date[0] % 4 == 0 & date[0] % 100 == 0) {
			flag = true;
		}
		else if(date[0] % 400 == 0) {
			flag = true;
		}

		int sum = 0;
		for(int i = 1; i <= date[1]; i ++) {
			if(i == date[1]) {
				sum += date[2];
				break;
			}
			switch(i) {
			case 1:
				sum += 31;
				break;
			case 2:
				if(flag) {
					sum += 29;
				}
				else {
					sum += 28;
				}
				break;
			case 3:
				sum += 31;
				break;
			case 4:
				sum += 30;
				break;
			case 5:
				sum += 31;
				break;
			case 6:
				sum += 30;
				break;
			case 7:
				sum += 31;
				break;
			case 8:
				sum += 31;
				break;
			case 9:
				sum += 30;
				break;
			case 10:
				sum += 31;
				break;
			case 11:
				sum += 30;
				break;
			case 12:
				sum += 31;
				break;
			}
		}
		System.out.println("此日期為該年第" + sum + "天");
	}

}
