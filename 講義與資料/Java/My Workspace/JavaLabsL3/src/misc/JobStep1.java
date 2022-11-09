package misc;

public class JobStep1 {
	
	public static void main(String[] args) {
		
		int n = (int)(Math.random() * 2) + 0;
		System.out.println("在工作步驟一內...n=" + n);
		if (n > 0) {
			System.out.println("工作步驟一發生異常...");
		} else {
			System.out.println("工作步驟一正常結束...");
		}
		System.exit(n);
	}
}
