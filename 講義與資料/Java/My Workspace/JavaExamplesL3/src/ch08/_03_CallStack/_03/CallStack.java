package ch08._03_CallStack._03;
// 本範例與前例相同，不過是在主類別的->sub1()處理例外。
public class CallStack {
	static void sub1() {
		System.out.println("主類別的sub1()方法開始");
		try {
			Foo foo = new Foo();
			foo.process();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("===>在主類別#sub()內處理算術例外：陣列註標:" + e.getMessage() + "有問題");
		} finally {
			System.out.println("CallStack#sub1()的finally區塊");
		}
		System.out.println("主類別的sub1()方法結束");
	}

	public static void main(String args[]) {
		System.out.println("程式開始");
		sub1();
		System.out.println("程式結束");
	}
}
