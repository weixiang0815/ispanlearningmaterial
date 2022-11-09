package ch08._04_CheckedException;

// 本範例由主類別的main()->sub1()->Foo.process()->Bar.divide()
// 在Bar.divide()內可能會發生多個CheckedException，因此在
// Bar.divide()內利用try-
public class CheckedException {
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
