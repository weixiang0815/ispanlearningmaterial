package ch04.lab03;

// 練習目的：了解if敘述的用法
// 產生介於1到10的隨機亂數，印出該亂數，
// 如果該亂數為偶數，則印出"此數為偶數"，否則印出"此數為奇數"

public class ProgramCh04Lab03 {
	public static void main(String[] args) {
		int n = (int)(Math.random() * 10) + 1;
		System.out.println("隨機亂數：" + n);
		System.out.println((n % 2 == 0) ? "此數為偶數" : "此數為奇數");
//		if(n % 2 == 0) {
//			System.out.println("此數為偶數");
//		}else {
//			System.out.println("此數為奇數");
//		}
		
	}
}
