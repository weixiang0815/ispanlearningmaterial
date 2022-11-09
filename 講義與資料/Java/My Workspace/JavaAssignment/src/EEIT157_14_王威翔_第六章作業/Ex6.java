package EEIT157_14_王威翔_第六章作業;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.close();
		System.out.println(toUnicodeString(str));
	}
	
	static public String toUnicodeString(String s) {
		String uni_str = "";
		for(int i = 0; i < s.length(); i ++) {
			uni_str += String.format("\\u%04x", (int)s.charAt(i));
		}

		return uni_str;
	}

}
