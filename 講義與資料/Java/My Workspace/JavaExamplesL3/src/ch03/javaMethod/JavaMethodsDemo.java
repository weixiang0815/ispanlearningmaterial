package ch03.javaMethod;

public class JavaMethodsDemo {
	public static void main(String args[]) {
		double x = Math.random();
		System.out.println("(1) 隨機亂數 x = " + x);

		double d = 2.1400000000000002;
		System.out.println("(2) 四捨五入, d=" + Math.round(d * 100) / 100.0);

		String s = "9876";
		System.out.println("(3) 將字串\"9876\"轉換為整數9876，然後再加4 = "
				+ Integer.parseInt(s) + 4);

		String vat = "0.0567";
		System.out.println("(4) 將字串\"0.0567\"轉換為浮點數0.0567，然後再乘100 = "
				+ Double.parseDouble(vat) * 100);

		System.out.println("(5) 字串 vat 的長度 = " + vat.length());

		System.out.println("(6) 字串 s 的第一個字元為 = " + s.charAt(0) + ", 最後一個字元為 = "
				+ s.charAt(s.length() - 1));

		System.out.println("(7) 字串vat的第三個字元以後的字串為 = " + vat.substring(2));

		System.out.println("(8) 字串s的第二、三個字元所形成的字串為 = " + s.substring(1, 3));

		System.out.println("(9) 小數點在字串 vat 的編號為 = " + vat.indexOf("."));

		System.out.println("(10) 最後一個0在字串vat的編號為 = " + vat.lastIndexOf("0"));

		String hello = " Hello World!  ";
		System.out.println("(11) 字串 hello 去掉頭尾空白 = " + hello.trim());
	}
}
