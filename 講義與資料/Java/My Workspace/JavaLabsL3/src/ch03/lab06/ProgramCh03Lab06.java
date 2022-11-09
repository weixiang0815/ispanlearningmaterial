package ch03.lab06;
/*
 請編寫程式ch03.lab06.ProgramCh03Lab06，在main()之內
 定義兩個整數變數(int) x, y , 其內含值為
 100與3, 請算出它們的和(+)，差(-)，積(*)，商(/)
 與餘數(%)，並將結果顯示於螢幕上。
*/
public class ProgramCh03Lab06 {

	public static void main(String[] args) {
		//1. 在此定義兩變數x, y
		int x = 100, y = 3;
        //2. 算出 和(+)，差(-),積(*)，商(/)
        // 與餘數(%)，並將結果顯示於螢幕上。
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x % y = " + (x % y));
	}

}
