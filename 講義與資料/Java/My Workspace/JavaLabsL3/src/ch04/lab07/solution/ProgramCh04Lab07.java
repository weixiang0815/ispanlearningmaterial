package ch04.lab07.solution;

// 使用while敘述
// 1. 印出 1 + 2 + 3 + 4 + .... + 18 + 19 + 20的總和
// 2. 印出 1 + 3 + 5 + .... + 17 + 19 的總和
// 3. 印出 2 + 4 + 6 + .... + 18 + 20 的總和

public class ProgramCh04Lab07 {
    public static void main(String[] args) {
    	int sum0 = 0;
		int sum1 = 0;
		int sum2 = 0;
		int n = 1;
		while (n <= 20) {
			sum0 += n;
			n++;
		}
		n = 1;
		while (n <= 19) {
			sum1 += n;
			n += 2;
		}
		n = 2;
		while (n <= 20) {
			sum2 += n;
			n += 2;
		}
		System.out.println("1. 1 + 2 + 3 + .... + 19 + 20 的總和=" + sum0);
		System.out.println("2. 1 + 3 + 5 + .... + 17 + 19 的總和=" + sum1);
		System.out.println("3. 2 + 4 + 6 + .... + 18 + 20 的總和=" + sum2);
    }
}
