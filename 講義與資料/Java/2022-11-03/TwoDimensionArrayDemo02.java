
public class TwoDimensionArrayDemo02 {

	public static void main(String[] args) {
		int arr1D[] = {30, 25, 49};
		int arr2D[][] = {{20, 37, 22, 18, 11},
				         {11, 25, 22, 18, 25, 25}, 
				         {15, 18, 17, 36}};
//      縱向加總，橫向元素不等長		
//      先找出最長之一維陣列的元素個數
		int max = 0;
		for (int n = 0; n < arr2D.length; n++) {
			if (arr2D[n].length > max) {
				max = arr2D[n].length;
			}
		}
		System.out.println(max);
		for(int n= 0; n < max; n++) {
			int sum = 0 ;
			for(int z= 0; z < arr2D.length; z++) {
				try {
					sum += arr2D[z][n];
				} catch(ArrayIndexOutOfBoundsException e) {
					//System.out.println(e.getMessage());
					;  // null-statement
				}
			}
			System.out.println("sum=" + sum);
		}
		System.out.println("------------------------------");
//      橫向加總，橫向元素不等長
		for(int a = 0; a < arr2D.length; a++) {
			int sum = 0 ;
			for(int x = 0 ; x < arr2D[a].length; x++) {
				sum += arr2D[a][x];
			}
			System.out.println("sum=" + sum);
		}
//      橫向加總		
//		sum = 0 ;
//		for(int x = 0 ; x < arr2D[1].length; x++) {
//			sum += arr2D[1][x];
//		}
//		System.out.println("sum=" + sum);
//		sum = 0 ;
//		for(int x = 0 ; x < arr2D[2].length; x++) {
//			sum += arr2D[1][x];
//		}
//		System.out.println("sum=" + sum);
		
		
//		System.out.println(arr2D.length); // 3
//		System.out.println(arr2D[0].length);  // 2
//		System.out.println(arr2D[1].length);  // 4
//		System.out.println(arr2D[2].length);  // 6
//		System.out.println(arr2D[0][0] + ", " + arr2D[0][1] );  
//		System.out.println(arr2D[1][0] + ", " + arr2D[1][1] + ", " + arr2D[1][2] + ", " + arr2D[1][3]);  
//		System.out.println(arr2D[2][0] + ", " + arr2D[2][1] + ", " + arr2D[2][2] + ", " + arr2D[2][3]
//				+ ", " + arr2D[2][4] + ", " + arr2D[2][5]	);
//		
		
//		System.out.println(arr1D.length);
//		System.out.println(arr1D[0]);
//		System.out.println(arr1D[1]);
//		System.out.println(arr1D[2]);

	}

}
