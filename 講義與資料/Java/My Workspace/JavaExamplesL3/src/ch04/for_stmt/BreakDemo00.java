package ch04.for_stmt;

public class BreakDemo00 {
	public static void main(String[] args) {
		int x = 0, sum = 0;
		for (x = 1; x <= 10; x++) {
			if (x % 5 == 0) {
				break;
			}
			sum += x;
			System.out.println(" x=" + x + ", sum=" + sum);
		}
		System.out.println("Sum=" + sum);
	}
}
