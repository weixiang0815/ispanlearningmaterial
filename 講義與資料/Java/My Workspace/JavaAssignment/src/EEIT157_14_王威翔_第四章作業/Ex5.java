package EEIT157_14_王威翔_第四章作業;

public class Ex5 {

	public static void main(String[] args) {
		for(int i = 10; i >= 1; i --) {
			for(int j = 1; j <= i; j ++) {
				System.out.print(j);
				if(j == i) {
					System.out.println("");
				}
				else {
					System.out.print(" ");
				}
			}
		}

	}

}
