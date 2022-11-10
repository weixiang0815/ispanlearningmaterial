package ch03.scanner;
import java.util.Scanner;
public class ScannerBasic3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //產生一個Scanner物件
		int mm = 0, yy = 0, dd= 0;
		String s = "";
		System.out.println("請輸入3個整數：");
		// 如果輸入緩衝區內有一個可解釋為整數的記號
		if (scan.hasNext()) {     
			s = scan.next();      // 讀取這個整數
		}
		String[] sa = s.split(",");
		System.out.println("yy=" + sa[0]);
		System.out.println("mm=" + sa[1]);
		System.out.println("dd=" + sa[2]);
		scan.close();
	}
}
