package ch03.operator;

public class RelationalOperators {
	public static void main(String[] args) {
		int x = 10, y = 20;
		System.out.println("x < y :" + (x < y));
		y = x + y;
		x = x * 2;
		System.out.println("x == y :" + (x == y));
		x = x * 2;
		System.out.println("x > y :" + (x > y));
	}
}
