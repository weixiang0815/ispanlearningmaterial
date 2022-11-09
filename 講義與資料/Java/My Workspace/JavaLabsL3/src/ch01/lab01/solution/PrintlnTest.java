package ch01.lab01.solution;
/*
請編寫程式ch01.lab01.PrintlnTest.java，執行此程式時，它能
一、於螢幕上印出三行： 
	"1.Hello, Java world!"
	"2.Hello, Java world!"
	"3.Hello, Java world!"

二、請使用三個System.out.println()或System.out.print()於螢幕上印出下面的資料： 
	"1.Hello, Java world!2.Hello, Java world!"
	"3.Hello, Java world!"                                    

三、於螢幕上印出 
     *******
     *******
     *******
     *******
     *******
     *******
     *******
*/
public class PrintlnTest {
	public static void main(String[] args) {
		System.out.println("1.Hello, Java world!");	
		System.out.println("2.Hello, Java world!");
		System.out.println("3.Hello, Java world!");
		System.out.println();
		System.out.print("1.Hello, Java world!");	
		System.out.println("2.Hello, Java world!");
		System.out.println("3.Hello, Java world!");
		System.out.println();
		System.out.println("*******");
		System.out.println("*******");
		System.out.println("*******");
		System.out.println("*******");
		System.out.println("*******");
		System.out.println("*******");
		System.out.println("*******");
		
		
	}
}
