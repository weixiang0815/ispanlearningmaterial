package ch08._02;
public class Bar {
	public void divide() {
		System.out.println("Bar類別的divide()方法開始");
		try {
			int sum = 100;
			int no = 0;
			int average = sum / no;
			System.out.println("平均=" + average);
		} catch (ArithmeticException e) {
			System.out.println("發生算術例外：除法時分母為0");
		} finally {
			System.out.println("Bar類別的divide()的finally區塊");
		}
		System.out.println("Bar類別的divide()方法結束");
	}
}
