package ch05.lab02;

/*
 * 請編寫程式ch05.lab02.ProgramCh05Lab02，
 * 在main()之內定義:整數陣列 ar，其內含有下列元素：
 * 100, 35, 46, 75, 56, 69，請計算並印出這些
 * 元素的總和，平均，最大的元素與最小的元素。
 */
public class ProgramCh05Lab02 {
	public static void main(String[] args) {
		int[] ar = {100, 35, 46, 75, 56, 69};
		int sum = 0;
		for(int n : ar) {
			sum += n;
		}
		System.out.println("陣列元素總和：" + sum);
		System.out.println("陣列元素平均：" + ((double)sum / ar.length));
		
		int flag = 0;
		for(int i = 1; i < ar.length; i ++) {
			if(ar[i] > ar[flag]) {
				flag = i;
			}
		}
		System.out.println("陣列元素最大值：" + ar[flag]);
		
		flag = 0;
		for(int i = 1; i < ar.length; i ++) {
			if(ar[i] < ar[flag]) {
				flag = i;
			}
		}
		System.out.println("陣列元素最小值：" + ar[flag]);
	}
}
