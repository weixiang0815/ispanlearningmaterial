package palindromeNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		s.close();
		System.out.println(isPalindrome(x));
	}

	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		boolean flag = true;
		ArrayList<Integer> num = new ArrayList<Integer>();
		while (x != 0) {
			num.add(x % 10);
			x /= 10;
		}
		for(int i = 0; i < num.size(); i ++) {
			if(i > num.size() - i - 1)
				break;
			if(num.get(i) != num.get(num.size() - i - 1)) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}
