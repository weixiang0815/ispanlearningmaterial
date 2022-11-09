package EEIT157_14_王威翔_第四章作業;

public class Ex3 {

	public static void main(String[] args) {
		//用for敘述來完成
		int total = 1;
		for(int i = 1; i <= 10; i ++) {
			total *= i;
		}
		System.out.println("1到10的連乘積：" + total);
		
		//用while敘述來完成
		total = 1;
		int i = 1;
		while(i <= 10) {
			total *= i ++;
		}
		System.out.println("1到10的連乘積：" + total);

	}

}
