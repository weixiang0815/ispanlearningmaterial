package ch03;

public class ArithmeticOperations {
	public static void main(String[] args) {
		int num;
		num = 100;		// = 稱為指定運算子
		System.out.println("開始時變數num的值=" + num);
		num = num * 2;	// num ==> 200
		num = num + 5;	// num ==> 205
		num = num - 10;	// num ==> 195
		num = num / 5;	// num ==> 39
        System.out.println("運算後變數num的值=" + num);
	}
}
