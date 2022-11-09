package EEIT157_14_王威翔_第四章作業;

public class Ex6 {

	public static void main(String[] args) {
		//排版問題待解決
		for(int i = 1; i <= 10; i ++) {
			for(int j = 1; j <= 10; j ++) {
				System.out.printf("%5d", (i * j));
				if(j == 10) {
					System.out.println("");
				}
				else {
					System.out.print(" ");
				}
			}
		}

	}

}
