package ch04.switch_stmt;

public class SwitchDemo00 {
	public static void main(String[] args) {
		int days = 0, month = 0;
		month = (int) (Math.random() * 12) + 1;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			days = 28;
		}
		System.out.println(month + " 月有 " + days + " 天");
	}
}
