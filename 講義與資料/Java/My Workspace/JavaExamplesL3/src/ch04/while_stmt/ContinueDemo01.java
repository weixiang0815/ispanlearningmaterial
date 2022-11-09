package ch04.while_stmt;

public class ContinueDemo01 {
	public static void main(String[] args) {
		int x = 0, sum = 0;
		x = 1;
		while (x <= 10) {
			if (x % 5 == 0) {
				x++;
				continue;
			}
			sum += x;
			System.out.println(" x=" + x + ", sum=" + sum);
			x++;
		}
		System.out.println("Sum=" + sum);
	}
}
