package ch03.scanner;
import java.util.Scanner;
public class ScannerBasic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //產生一個Scanner物件
		int x = 0;
		double d = 0;
		String s = "";
		System.out.println("請輸入一個整數，一個浮點數，一個字串：");
		// 如果輸入緩衝區內有一個可解釋為整數的記號
		if (scan.hasNextInt()) {     
			x = scan.nextInt();      // 讀取這個整數
		}
		// 如果輸入緩衝區內有一個可解釋為浮點數的記號
		if (scan.hasNextDouble()) {  
			d = scan.nextDouble();	 // 讀取這個浮點數
		}
		// 如果輸入緩衝區內有記號
		if (scan.hasNext()) {        
			s = scan.next();         // 讀取這個資料
		}
		System.out.println("x=" + x);
		System.out.println("d=" + d);
		System.out.println("s=" + s);
		scan.close();
	}
}
