package ch09._03_Wrapper;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

public class FactorialBigIntegerDemo {
	public static void main(String[] args) throws IOException {
		try (
			PrintWriter out = new PrintWriter("D:\\factorial.txt");
		) {
			int i = 0;
			BigInteger bi = new BigInteger("1");
			for (i = 1; i <= 10000; i++) {
				bi = bi.multiply(new BigInteger(String.valueOf(i)));
			}
			out.println(i + "的階乘=" + bi.toString());
			for (i = 1; i <= 10000; i++) {
				bi = bi.divide(new BigInteger(String.valueOf(i)));
			}
			out.println("連除後bi=" + bi.toString());
		}
	}
}
