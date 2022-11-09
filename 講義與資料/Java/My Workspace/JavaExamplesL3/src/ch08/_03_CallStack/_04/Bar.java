package ch08._03_CallStack._04;

public class Bar {
	public void divide() {
		System.out.println("Bar類別的divide()方法開始");
		int[] xa = { 100, 200 };
		int sum = 0;
		try {
			for (int i = 0; i <= xa.length; i++) {
				sum += xa[i];
			}
			System.out.println("陣列元素加組完畢，總和=" + sum);
		} catch (ArithmeticException e) {
			System.out.println("===>在Bar#divide()內處理算術例外：" + e.getMessage() );
		} finally {
			System.out.println("Bar#divide()的finally區塊");
		}
		System.out.println("Bar類別的divide()方法結束");
	}
}
