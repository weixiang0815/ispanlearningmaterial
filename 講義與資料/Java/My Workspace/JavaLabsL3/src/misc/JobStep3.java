package misc;

public class JobStep3 {
	public static void main(String[] args) {
		int n = (int)(Math.random() * 2) + 0;
		System.out.println("在工作步驟三內...n=" + n);
		if (n > 0) {
			System.out.println("工作步驟三發生異常...");
		} else {
			System.out.println("工作步驟三正常結束...");
		}
		System.exit(n);
	}
}
