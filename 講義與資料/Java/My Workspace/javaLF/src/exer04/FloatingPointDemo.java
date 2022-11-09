package exer04;

import exer00.SystemConstant;

public class FloatingPointDemo {

	public static void main(String[] args) {
		double d = 3.14;
		float f = 3.14f;
		double amount = 1500;
		System.out.println("稅前：" + amount);
		System.out.println("稅率：" + amount * SystemConstant.VAT);
		System.out.println("稅後：" + amount * (1 + SystemConstant.VAT));
	}

}
