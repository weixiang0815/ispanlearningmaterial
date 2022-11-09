package ch08._03_CallStack._02;

public class Foo {
	public void process() {
		System.out.println("Foo類別的process()方法開始");
		Bar bar = new Bar();
		try {
			bar.divide();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("===>在Foo#process()內處理例外：陣列註標:" + e.getMessage() + "有問題");
		} finally {
			System.out.println("Foo#process()的finally區塊");
		}
		System.out.println("Foo類別的process()方法結束");
	}
}
