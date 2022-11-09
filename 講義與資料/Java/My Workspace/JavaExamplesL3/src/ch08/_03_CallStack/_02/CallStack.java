package ch08._03_CallStack._02;
// 本範例與前例相同，由主類別的main()呼叫sub1()呼叫Foo#process()呼叫
// Bar#divide()，在Bar#divide()內會發生
// IndexOutOfBoundsException例外，但並未在Bar#divide()內處理此例外，
// 而是在Foo#process()內利用try-catch-finally來處理此例外。
public class CallStack {
	static void sub1() {
		System.out.println("主類別的sub1()方法開始");
		Foo foo = new Foo();
		foo.process();
		System.out.println("主類別的sub1()方法結束");
	}

	public static void main(String args[]) {
        System.out.println("程式開始");
		sub1();
		System.out.println("程式結束");
	}
}
