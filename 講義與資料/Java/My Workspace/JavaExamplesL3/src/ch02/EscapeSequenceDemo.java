package ch02;

public class EscapeSequenceDemo {

	public static void main(String[] args) {
		char ch1 = '\'';
		System.out.println(ch1);
		
		String s = "Hello World";
		System.out.println(s);
		System.out.println("----------------");
		String s1 = "Hello, \n World";
		System.out.println(s1);
		
		String x = "abc\"; String t=\"123";
		System.out.println(x);
	}

}
