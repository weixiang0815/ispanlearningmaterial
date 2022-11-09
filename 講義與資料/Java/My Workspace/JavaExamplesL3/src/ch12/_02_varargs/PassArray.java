package ch12._02_varargs;

public class PassArray {
	public static void main(String[] args) {
       int[] a1 = {1, 2, 9};
       int[] a2 = {};
       int[] a3 = {100};
       vaTest(a1);
       vaTest(a2);
       vaTest(a3);
	}
	public static void vaTest(int[] intA) {
		System.out.println("元素個數:" + intA.length);
		System.out.print("元素內容:" );
		for(int i : intA) {
			System.out.print( i + " ");
		}
		System.out.println("\n------------------------");
	}
}
