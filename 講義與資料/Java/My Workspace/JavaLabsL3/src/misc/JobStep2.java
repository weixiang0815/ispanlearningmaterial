package misc;

public class JobStep2 {
	public static void main(String[] args) {
		int n = (int)(Math.random() * 2) + 0;
		System.out.println("在工作步驟二內...n=" + n);
		if (n > 0) {
			System.out.println("工作步驟二發生異常...");
		} else {
			System.out.println("工作步驟二正常結束...");
		}
		System.exit(n);
	}
}
