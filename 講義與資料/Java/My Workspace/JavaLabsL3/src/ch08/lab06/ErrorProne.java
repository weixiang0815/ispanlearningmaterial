package ch08.lab06;

//執行ErrorProne.java時，螢幕會印出哪些字元?
public class ErrorProne {
	public static void main(String[] args) {
		try {
			Tiger.eat();
			System.out.print("E");
		} catch (ArithmeticException e) {
			System.out.print("F");
		} finally {
			System.out.print("G");
		}
		System.out.print("Z");
	}
}

class Tiger {
	@SuppressWarnings("unused")
	public static void eat() {
		try {
			int x = 10 / 0; // 這一行會產生java.lag.ArithmeticException
			System.out.print("A");
		} finally {
			System.out.print("C");
		}
		System.out.print("D");
	}
}
