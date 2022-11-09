package EEIT157_14_王威翔_第五章作業;

public class Ex5 {

	public static void main(String[] args) {
		int[][] test = {
				{10, 35, 40, 100, 90, 85, 75, 70},
				{37, 75, 77, 89, 64, 75, 70, 95},
				{100, 70, 79, 90, 75, 70, 79, 90},
				{77, 95, 70, 89, 60, 75, 85, 89},
				{98, 70, 89, 90, 75, 90, 89, 90},
				{90, 80, 100, 75, 50, 20, 99, 75}
		};
		int[] sum_hori = new int[test.length];
		for(int i = 0; i < sum_hori.length; i ++) {
			for(int j = 0; j < test[i].length; j ++) {
				sum_hori[i] += test[i][j];
			}
		}
		int[] sum_vert = new int[test[0].length];
		for(int j = 0; j < sum_vert.length; j ++) {
			for(int i = 0; i < test.length; i ++) {
				sum_vert[j] += test[i][j];
			}
		}
		System.out.print("每一橫列總和：");
		for(int i = 0; i < sum_hori.length; i ++) {
			System.out.print(sum_hori[i]);
			if(i == sum_hori.length - 1) {
				System.out.println("");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("每一直行總和：");
		for(int i = 0; i < sum_vert.length; i ++) {
			System.out.print(sum_vert[i]);
			if(i == sum_vert.length - 1) {
				System.out.println("");
			}
			else {
				System.out.print(" ");
			}
		}
	}

}
