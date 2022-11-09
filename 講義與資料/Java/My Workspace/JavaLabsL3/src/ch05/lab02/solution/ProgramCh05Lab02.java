package ch05.lab02.solution;

/*
 * 請編寫程式ch05.lab02.ProgramCh05Lab02，
 * 在main()之內定義:整數陣列 ar，其內含有下列元素：
 * 100, 35, 46, 75, 56, 69，請計算並印出這些
 * 元素的總和，平均，最大的元素與最小的元素。
 */
public class ProgramCh05Lab02 {
	public static void main(String[] args) {
		int[] ar = { 100, 35, 46, 75, 56, 69 };
		int sum = 0, max = ar[0], min = ar[0];
		double ave = 0;
		for (int n = 0; n < ar.length; n++) {
			if (ar[n] > max) {
				max = ar[n];
			}
			if (ar[n] < min) {
				min = ar[n];
			}
			sum += ar[n];
		}
		ave = (double)sum / ar.length;
		System.out.println("總和=" + sum);
		System.out.println("Max=" + max);
		System.out.println("Min=" + min);
		System.out.println("Ave=" + ave);
	}
}
