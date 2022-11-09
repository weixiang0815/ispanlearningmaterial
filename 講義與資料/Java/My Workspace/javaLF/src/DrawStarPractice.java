import java.util.Scanner;

public class DrawStarPractice {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("請輸入要印的星星個數：");
		int num = s.nextInt();
		s.close();
		System.out.println();
		
		for(int i = 1; i <= num; i ++) {
			for(int j = 1; j <= i; j ++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < num; i ++) {
			for(int j = num - i; j > 0; j --) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < num; i ++) {
			for(int j = 0; j < i; j ++) {
				System.out.print("  ");
			}
			for(int j = num - i; j > 0; j --) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i <= num; i ++) {
			for(int j = num - i; j > 0; j --) {
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j ++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
}
