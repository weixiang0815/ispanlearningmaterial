package ch09._02_StringBuffer;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb0 = new StringBuffer("Hello");
		System.out.println("新建StringBuffer物件, sb0=" + sb0.toString() + "   sb0.capacity()=" + sb0.capacity());
		sb0.append(" Kitty");
		System.out.println("append(\" Kitty\"), sb0=" + sb0.toString() + "   sb0.capacity()=" + sb0.capacity());
		sb0.insert(6, "Snoopy, Hello");
		System.out.println("insert(6, \"Snoopy, Hel\"), sb0="
				+ sb0.toString()  + "   sb0.capacity()=" + sb0.capacity());
		sb0.replace(6, 12, "World");
		System.out.println("replace(6, 12, \"World\"), sb0=" + sb0.toString()  + "   sb0.capacity()=" + sb0.capacity());
		sb0.setCharAt(0, 'G');
		System.out.println("setCharAt(0, 'G'), sb0=" + sb0.toString()  + "   sb0.capacity()=" + sb0.capacity());
		System.out.println("sb0.capacity()=" + sb0.capacity());
		System.out.println("sb0.length()=" + sb0.length());
	}
}
