package EEIT157_14_王威翔_第五章作業;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int[] num = new int[6];
		for(int i = 0 ; i < num.length; i ++) {
			int rand = 0;
			while(true) {
				rand = (int)(Math.random() * 42) + 1;
				boolean flag = true;
				for(int j = 0; j <= i ; j ++) {
					if(num[j] == rand) {
						flag = false;
						break;
					}
				}
				if(flag) {
					break;
				}
			}
			num[i] = rand;
		}
		for(int i = 0; i < num.length; i ++) {
			System.out.print(num[i]);
			if(i != num.length - 1) {
				System.out.print(" ");
			}
		}
	}

}
