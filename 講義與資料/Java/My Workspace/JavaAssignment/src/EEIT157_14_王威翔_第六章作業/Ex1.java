package EEIT157_14_王威翔_第六章作業;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int width = s.nextInt(), height = s.nextInt();
		s.close();
		starSquare(width, height);
	}
	
	static void starSquare(int width, int height) {
		for(int i = 0; i < width; i ++) {
			for(int j = 0; j < height; j ++) {
				System.out.print("*");
				if(j == height - 1) {
					System.out.println("");
				}
				else {
					System.out.print(" ");
				}
			}
		}
	}

}
