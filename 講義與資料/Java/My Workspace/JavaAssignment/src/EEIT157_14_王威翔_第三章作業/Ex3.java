package EEIT157_14_王威翔_第三章作業;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		s.close();
		
		System.out.println("和：" + (n + m));
		System.out.println("差：" + (n - m));
		System.out.println("積：" + (n * m));
		System.out.println("商：" + (n / m));
		System.out.println("餘：" + (n % m));

	}

}
