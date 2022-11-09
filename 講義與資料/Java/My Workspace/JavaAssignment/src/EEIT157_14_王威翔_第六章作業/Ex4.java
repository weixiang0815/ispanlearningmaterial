package EEIT157_14_王威翔_第六章作業;

public class Ex4 {

	public static void main(String[] args) {
		for(int i = 0; i < 3; i ++) {
			int[] n = luckyNumbers().clone();
			for(int j = 0; j < n.length; j ++) {
				System.out.print(n[j]);
				if(j == n.length - 1) {
					System.out.println();
				}
				else {
					System.out.print(" ");
				}
			}
		}
	}
	
	static int[] luckyNumbers() {
		int[] num = new int[6];
		for(int i = 0; i < num.length; i ++) {
			num[i] = (int)(Math.random() * 42) + 1;
		}
		return num;
	}

}
