package ch07._01_static;

public class Computer {
	public static int listPrice = 20000;  // 靜態變數(class/static variable)
	int price;                            // 實例變數(instance variable) 
	Computer(int price) {
		this.price = price;
	}
	public static void displayListPrice(){
		System.out.println(listPrice );
	}
}
