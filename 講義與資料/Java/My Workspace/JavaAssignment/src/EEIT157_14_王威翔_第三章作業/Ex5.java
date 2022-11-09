package EEIT157_14_王威翔_第三章作業;

public class Ex5 {

	public static void main(String[] args) {
		int[] n = new int[6];
		for(int i = 0; i < n.length; i ++) {
			n[i] = (int)(Math.random() * 42) + 1;
			System.out.println(n[i]);
		}

	}

}
