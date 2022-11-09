package ch02.lab08.solution;
/*
 * 在套件ch02.lab08內，新建一類別ProgramCh02Lab08.java， 內
含 main()，在 main() 之內

1.定義兩個char型態的變數ch1, ch2與一個int型態的變數n，
2.設定ch1的值為 'A' 
3.設定ch2的值為 '\u0041'
4.在螢幕上印出變數 ch1, ch2
5.設定ch1的值為 '李' 
6.設定n的值為 '李' 
7.在螢幕上印出變數 ch1, n
 */
public class ProgramCh02Lab08 {
	public static void main(String[] args) {
		char ch1, ch2;
		int n;
		ch1 = 'A';
		ch2 = '\u0041';
		System.out.println(ch1);
		System.out.println(ch2);
		ch1 = '李';
		n   = '李';
		System.out.println(ch1);
		System.out.println(n);
	}
}
