package EEIT157_14_王威翔_第四章作業;

public class Ex2 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 1000; i ++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1到1000的偶數和：" + sum);

	}

}
