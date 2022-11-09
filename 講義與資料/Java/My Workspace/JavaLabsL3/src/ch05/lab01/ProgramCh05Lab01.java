package ch05.lab01;

/*
 * 請編寫程式ch05.lab01.ProgramCh05Lab01，
 * 在main()之內定義下列陣列:
 1. 整數陣列(元素為整數的陣列)ar，其內有五個元素：
 59, 27 , -18 , 98 , 10
 2. 浮點數陣列(元素為浮點數的陣列)br，其內有三個元素：
 3.14, 75.9, 18.9
 3. 字串陣列(元素為字串的陣列)cr，其內有三個元素：
 "kitty", "snoopy", "garfield"
 */

public class ProgramCh05Lab01 {
	public static void main(String[] args) {
		int[] ar = {59, 27, -18, 98, 10};
		float[] br = {3.14f, 75.9f, 18.9f};
		String[] cr = {"kitty", "snoopy", "garfield"};

		System.out.println("整數陣列ar的元素：");
		for(int i = 0; i < ar.length; i ++) {
			System.out.print((i + 1) + ". ");
			System.out.println(ar[i]);
		}
		System.out.println();
		System.out.println("浮點數陣列br的元素：");
		for(int i = 0; i < br.length; i ++) {
			System.out.print((i + 1) + ". ");
			System.out.println(br[i]);
		}
		System.out.println();
		System.out.println("字串陣列cr的元素：");
		for(int i = 0; i < cr.length; i ++) {
			System.out.print((i + 1) + ". ");
			System.out.println(cr[i]);
		}
	}
}
