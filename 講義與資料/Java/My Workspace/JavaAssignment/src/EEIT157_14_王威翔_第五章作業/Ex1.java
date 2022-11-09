package EEIT157_14_王威翔_第五章作業;

public class Ex1 {

	public static void main(String[] args) {
		double[] n = {84.0, 94, 79.9, 90.5, 82.4, 65.7, 72.8, 99.0, 85.2, 100};
		double total = 1;
		for(int i = 0; i < n.length; i ++) {
			total += n[i];
		}
		for(int i = 0; i < n.length; i ++) {
			if(n[i] > (total / n.length)) {
				System.out.println(n[i]);
			}
		}

	}

}
