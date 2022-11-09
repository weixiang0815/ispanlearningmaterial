package ch09._02_StringBuffer;

public class StringBufferEnlarge {
	public static void main(String[] args) {
		StringBuffer sb0 = new StringBuffer();
		System.out.println("新建StringBuffer物件, sb0=" + sb0.toString() + " sb0.capacity()=" + sb0.capacity());
		for (int i=1; i<=100; i++) {
			sb0.append("aa");
		    System.out.println("加入" + i + "個字元, length=" + sb0.length() + " sb0.capacity()=" + sb0.capacity());
		}
	}
}
