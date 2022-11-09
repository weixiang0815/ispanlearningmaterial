package EEIT157_14_王威翔_第六章作業;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = new int[s.nextInt()];
		for(int i = 0; i < num.length; i ++) {
			num[i] = s.nextInt();
		}
		s.close();
		num = mySort(num);
		for(int i = 0; i < num.length; i ++) {
			System.out.print(num[i]);
			if(i != num.length - 1) {
				System.out.print(" ");
			}
		}
	}
	
	static int[] mySort(int[] arrayInt) {
		for(int i = 0; i < arrayInt.length; i ++) {
			for(int j = 0; j < arrayInt.length - 1; j ++) {
				if(arrayInt[j + 1] < arrayInt[j]) {
					int temp = arrayInt[j + 1];
					arrayInt[j + 1] = arrayInt[j];
					arrayInt[j] = temp;
				}
			}
		}
		return arrayInt;
	}

}
