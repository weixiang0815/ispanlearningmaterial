package ch07._01_static;

public class StaticDemo {
	@SuppressWarnings("static-access")
	public static void main(String args[])  {
		Computer c1 = new Computer(18000);
		Computer c2 = new Computer(16000);
		System.out.println("c1物件實例變數price的值=" + c1.price);
		System.out.println("c2物件實例變數price的值=" + c2.price);
		System.out.println("透過c1存取靜態變數listPrice的值=" + c1.listPrice);
		System.out.println("透過c2存取靜態變數listPrice的值=" + c2.listPrice);
		System.out.println("Computer.listPrice=" + Computer.listPrice);
	}
}
