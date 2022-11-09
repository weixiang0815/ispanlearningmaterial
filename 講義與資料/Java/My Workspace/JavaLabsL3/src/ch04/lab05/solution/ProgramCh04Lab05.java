package ch04.lab05.solution;

// 使用for 敘述
// 1. 印出 1 + 2 + 3 + 4 + .... + 18 + 19 + 20的總和
// 2. 印出 1 + 3 + 5 + .... + 17 + 19 的總和
// 3. 印出 2 + 4 + 6 + .... + 18 + 20 的總和

public class ProgramCh04Lab05 {
	public static void main(String[] args) {
		int sum0 = 0;
		int sum1 = 0;
		int sum2 = 0;
		for (int n = 1; n <= 20; n++) {
			sum0 += n;
		}
		for (int n = 1; n <= 19; n += 2) {
			sum1 += n;
		}
		for (int n = 2; n <= 20; n += 2) {
			sum2 += n;
		}
		System.out.println("1. 1 + 2 + 3 + .... + 19 + 20 的總和=" + sum0);
		System.out.println("2. 1 + 3 + 5 + .... + 17 + 19 的總和=" + sum1);
		System.out.println("3. 2 + 4 + 6 + .... + 18 + 20 的總和=" + sum2);
	}
}
