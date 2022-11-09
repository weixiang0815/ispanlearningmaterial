package ch12._02_varargs;

public class VarArgsDemo {

	public static void main(String[] args) {
		vaTest(10);
		vaTest();
		vaTest(1,2,3);

	}
	public static void vaTest(int... intA) {
		System.out.println("參數個數:" + intA.length);
		System.out.print("元素內容:" );
		for(int i : intA) {
			System.out.print( i + " ");
		}
		System.out.println("\n------------------------");
	}
}
