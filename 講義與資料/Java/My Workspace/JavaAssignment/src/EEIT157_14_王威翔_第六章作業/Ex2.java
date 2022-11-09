package EEIT157_14_王威翔_第六章作業;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		System.out.println(factorial(n));
	}
	
	static long factorial(int n) {
		long total = 1;
		for(int i = 1; i <= n; i ++) {
			total *= i;
		}
		return total;
	}

}
