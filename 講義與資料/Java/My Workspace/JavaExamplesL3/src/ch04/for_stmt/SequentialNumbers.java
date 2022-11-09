package ch04.for_stmt;
// 印出連續的數字 1, 2, 3 ... 10與0, 1, 2 ... 9 
public class SequentialNumbers {

	public static void main(String[] args) {
		for (int n = 1; n <= 10; n++) {
			System.out.println("n=" + n);
		}
		System.out.println("-----------------");
		for (int n = 0; n < 10; n++) {
			System.out.println("n=" + n);
		}
	}
}
