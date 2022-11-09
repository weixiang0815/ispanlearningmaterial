package ch09._04_autoboxing;

public class AutoBoxing3 {
	public static void main(String[] args) {
		Integer iOb, iOb2;
		int i;
		iOb = 100;
		System.out.println("原始值 iOb=" + iOb);
		iOb++;
		System.out.println("加一後 iOb=" + iOb);
		iOb2 = iOb + (iOb / 3);
		System.out.println("計算後 iOb2=" + iOb2);
		i = iOb + (iOb / 3);
		System.out.println("計算後 i=" + i);
	}
}
