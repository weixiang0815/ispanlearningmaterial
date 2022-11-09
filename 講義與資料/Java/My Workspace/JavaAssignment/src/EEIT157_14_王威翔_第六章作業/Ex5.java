package EEIT157_14_王威翔_第六章作業;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			String str = s.nextLine();
			if(str.contentEquals("quit")) {
				break;
			}
			String[] num_str = str.split(" ");
			int[] num = new int[num_str.length];
			for(int i = 0; i < num_str.length; i ++) {
				num[i] = Integer.parseInt(num_str[i]);
			}
			int sum = 0;
			for(int i = 0; i < num_str.length; i ++) {
				sum += num[i];
			}
			for(int i = 0; i < num.length; i ++) {
				for(int j = i; j < num.length-1; j ++) {
					if(num[j + 1] < num[i]) {
						int temp = num[j + 1];
						num[j + 1] = num[i];
						num[i] = temp;
					}
				}
			}
			System.out.print("總和：" + sum + "，平均：" + ((double)(sum) / (double)(num.length)));
			System.out.println("，最大值：" + num[num.length-1] + "，最小值：" + num[0]);
		}
		s.close();
	}

}
