package ch03.lab10.solution;
/*
資料型態不同的變數之間的指定，必要時必須進行型態轉換(Cast)，
例如int型態的資料指定給byte型態就必須進行型態轉換。

請編寫程式ch03.lab10.ProgramCh03Lab10，在 main()內定義int
型態的變數i與j的初值為5與10，將它們相加後分別指定給：

 1. byte型態的變數b
 2. short型態的變數s
 3. int型態的變數n
 4. double型態的變數d
 
 最後，印出這些變數的值。
*/
public class ProgramCh03Lab10 {
	public static void main(String[] args) {
		int i=5, j=10;
		byte	b 	= (byte)(i+j);
		short 	s	= (short)(i+j);
		int   	n	= i+j;
		double  d	= i+j;
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		System.out.println("b=" + b);
		System.out.println("s=" + s);
		System.out.println("n=" + n);
		System.out.println("d=" + d);
		
	}
}
