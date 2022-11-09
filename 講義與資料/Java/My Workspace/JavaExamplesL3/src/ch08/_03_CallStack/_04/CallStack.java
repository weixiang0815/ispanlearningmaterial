package ch08._03_CallStack._04;
//本範例與前例略有不同，Bar#divide()方法會發生
//IndexOutOfBoundsException，每個關鍵方法內都有
//try-catch-finally，不過只有主類別的sub1()方法才捕捉到此例外，
//本範例重點在觀察finally區塊的運作
public class CallStack {
	static void sub1() {
		System.out.println("主類別的sub1()方法開始");
		try {
			Foo foo = new Foo();
			foo.process();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("===>在主類別#sub()內處理例外：陣列註標:" + e.getMessage() + "有問題");
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
