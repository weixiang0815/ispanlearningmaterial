package ch08._01;

public class WithoutExceptionHandling {
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
