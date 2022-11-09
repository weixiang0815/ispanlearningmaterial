package EEIT157_14_王威翔_第四章作業;

public class Ex1 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 100; i ++) {
			sum += (int)(Math.random() * 100) + 1;
		}
		System.out.println("總和：" + sum);
		System.out.println("平均：" + (sum / 100.0));
	}

}
