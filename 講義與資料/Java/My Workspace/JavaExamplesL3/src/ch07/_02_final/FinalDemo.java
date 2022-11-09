package ch07._02_final;

final class FinalClass {
}

class SuperClass {
	final public void aMethod() {
	}
}

class Subclass extends SuperClass {
	// 此類別的 aMethod 有誤
	// public void aMethod() {
	// }
}

public class FinalDemo {
	// 存放物件狀態的final變數應在定義後
	// (1) 立即設定變數的初值，否則
	// (2) 在每個建構子內設定它的初值
	//     每個建構子可以設定不同的初值
	final int TIMES;

	FinalDemo(int i) {
		TIMES = 100;
	}

	FinalDemo() {
		TIMES = 10;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo(1);
	}
}
