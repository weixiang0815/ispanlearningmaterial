package ch03.scanner;
import java.util.Scanner;
public class ScannerBasic2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //產生一個Scanner物件
		int mm = 0, yy = 0, dd= 0;
		
		System.out.println("請輸入3個整數：");
		// 如果輸入緩衝區內有一個可解釋為整數的記號
		if (scan.hasNextInt()) {     
			yy = scan.nextInt();      // 讀取這個整數
		}
		if (scan.hasNextInt()) {     
			mm = scan.nextInt();      // 讀取這個整數
		}
		if (scan.hasNextInt()) {     
			dd = scan.nextInt();      // 讀取這個整數
		}
		
		System.out.println("yy=" + yy);
		System.out.println("mm=" + mm);
		System.out.println("dd=" + dd);
		scan.close();
	}
}
