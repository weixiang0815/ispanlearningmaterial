package ch08._04_CheckedException;

public class Foo {
	public void process() {
		System.out.println("Foo類別的process()方法開始");
		Bar bar = new Bar();
		try {
			bar.divide();
		} catch (ArithmeticException e) {
			System.out.println("===>在Foo#process()內處理算術例外：" + e.getMessage());
		} finally {
			System.out.println("Foo#process()的finally區塊");
		}
		System.out.println("Foo類別的process()方法結束");
	}
}
