package ch08._03_CallStack._01;

public class Bar {
	public void divide() {
		System.out.println("Bar類別的divide()方法開始");
		int[] xa = {100, 200};
		int sum = 0 ; 
		try {
			for (int i=0; i <= xa.length; i++){
				sum += xa[i];
			}
			System.out.println("陣列元素加組完畢，總和=" + sum);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("===>在Bar#divide()內處理例外：陣列註標:" + e.getMessage() + "有問題");
		} finally{
			System.out.println("Bar#divide()的finally區塊");
		}
		System.out.println("Bar類別的divide()方法結束");
	}
}
