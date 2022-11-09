package ch06._03_method.callByValue;

class SwapTwoInteger {
	void swap(int x, int y) {
		// swap()方法會將傳入的參數x, y的內含值交換
		// 參數x的值放入參數y內，而將參數y的值放入參數x內
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("已將x與y的值交換, x=" + x + ", y="+y);
	}
}

public class CallByValuePrimitive {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		SwapTwoInteger cbv = new SwapTwoInteger();
		System.out.println("呼叫swap()方法前, i=" + i + ", j =" + j);
		cbv.swap(i, j);
		System.out.println("呼叫swap()方法後, i=" + i + ", j =" + j);
		System.out.println("=======================");
	}
}
