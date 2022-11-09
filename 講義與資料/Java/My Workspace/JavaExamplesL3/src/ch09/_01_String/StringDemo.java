package ch09._01_String;

import java.util.Hashtable;

public class StringDemo {
	public static void main(String[] args) {
		String s = "Ayz";
		String t = "abc";
		System.out.println("s.compareTo(t)==>" + s.compareTo(t));
		
		s = "美牛牛牛美牛牛美牛";
		t = "豬";
		
		System.out.println("s.replace(t)==>" + s.replace('牛','豬'));
		System.out.println("s==>" + s);
		
		s = "今天明天後天藍";
		String[] sa = s.split("天");
		System.out.println(sa.length);
		for(String x: sa){
			System.out.println("e=" + x + "*");
		}
		Hashtable<String, Object> ht = new Hashtable<>();
	}
}
