package ch04.nestedLoop;

public class NestedLoopDemo {
	public static void main(String[] args) {
		int x, y;
		for (x = 1; x <= 9; x++) {
			for (y = 1; y <= 9; y++) {
				System.out.println("x=" + x + ", y=" + y);
			}
			System.out.println();
		}
	}
}
