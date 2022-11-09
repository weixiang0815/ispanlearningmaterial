package exer03;

public class IntegerDemo {

	public static void main(String[] args) {
		byte b0 = -127; // -128 ~ +127
		short s0 = -32768; // -32768 ~ +32767
		long i0 = 21474836470000000l; // -2147483648 ~ +2147483647
		long l0 = Long.MIN_VALUE; // -2147483648 ~ +2147483647
		System.out.println(b0);
		System.out.println(s0);
		System.out.println(i0);
		System.out.println(l0);
		System.out.println(Short.MIN_VALUE + Short.MAX_VALUE);
		System.out.println(Long.MAX_VALUE + Long.MIN_VALUE);
	}

}
