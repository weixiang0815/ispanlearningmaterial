package ch04.lab07;

// 使用while敘述
// 1. 印出 1 + 2 + 3 + 4 + .... + 18 + 19 + 20的總和
// 2. 印出 1 + 3 + 5 + .... + 17 + 19 的總和
// 3. 印出 2 + 4 + 6 + .... + 18 + 20 的總和

public class ProgramCh04Lab07 {
	public static void main(String[] args) {
		int sum = 0, i = 1;
		while (i <= 20) {
			sum += i++;
		}
		System.out.println("第1題總和：" + sum);
		
		sum = 0;
		i = 1;
		while (i <= 19) {
			sum += i;
			i += 2;
		}
		System.out.println("第2題總和：" + sum);
		
		sum = 0;
		i = 2;
		while(i <= 20) {
			sum += i;
			i += 2;
		}
		System.out.println("第3題總和：" + sum);
	}
}
