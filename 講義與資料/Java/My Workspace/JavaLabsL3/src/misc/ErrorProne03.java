package misc;

public class ErrorProne03 {
	public static void main(String[] args) {
		try {
			Mouse.smile();
			System.out.println("E");
		} catch (ArithmeticException e) {
			System.out.println("F");
		} finally {
			System.out.println("G");
		}
		System.out.println("Z");
	}
}

class Mouse {
	@SuppressWarnings("unused")
	public static void smile() {
		try {
			int x = 10 / 0;
			System.out.println("A");
		} finally {
			System.out.println("C");
		}
		System.out.println("D");
	}
}
