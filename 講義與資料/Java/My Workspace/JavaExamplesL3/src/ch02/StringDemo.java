package ch02;

public class StringDemo {
	public static void main(String args[]) {
		String s = "aaa";
		System.out.println("字串s的長度=" + s.length());
		String b = "xx";
		s = s + b;
		System.out.println("字串s的長度=" + s.length());
		System.out.println("字串嘿嘿嘿的長度=" + "嘿嘿嘿".length());
		System.out.println("字串\"大ｓ小s\"的長度=" + "大ｓ小s".length());
	}
}
