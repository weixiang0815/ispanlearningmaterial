package ch03;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		long n = System.currentTimeMillis();
		System.out.println("n=" + n);
		System.out.println(n % 2 == 0 ? "偶數": "奇數" );

	}

}
