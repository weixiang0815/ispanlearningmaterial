package ch04.while_stmt;

public class BreakDemo01 {
	public static void main(String[] args) {
		int x = 1, sum = 0;
		while (x <= 10) {
			if (x % 5 == 0) {
				break;
			}
			sum += x;
			x++;
		}
		System.out.println("sum=" + sum);
	}
}
