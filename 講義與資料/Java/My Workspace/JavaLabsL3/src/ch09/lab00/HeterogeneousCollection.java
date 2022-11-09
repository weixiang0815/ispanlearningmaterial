package ch09.lab00;

import java.math.BigInteger;
/*
      請在main()方法內設計一個陣列，其內的元素只能是下列物件:
      Integer i1 = Integer.valueOf(100);
	  Byte b1 = Byte.valueOf("10");
	  Float  f1 = Float.valueOf("3.14");
	  Double d1 = Double.valueOf(3.14);
	  Double d2 = Double.valueOf("3.14");
	  BigInteger bi1 = BigInteger.valueOf(10000);
 */
public class HeterogeneousCollection {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Integer i1 	= Integer.valueOf(100);
		byte b1 	= Byte.valueOf("10");
		Float  f1 	= Float.valueOf("3.14");
		Double d1 	= Double.valueOf(3.14);
		Double d2 	= Double.valueOf("3.14");
		BigInteger bi1 = BigInteger.valueOf(10000);
	}
}
