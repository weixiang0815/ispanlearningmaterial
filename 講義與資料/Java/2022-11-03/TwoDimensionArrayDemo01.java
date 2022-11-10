
public class TwoDimensionArrayDemo01 {

	public static void main(String[] args) {
		int arr1D[] = {30, 25, 49};
		int arr2D[][] = {{11, 25, 22, 18}, 
				         {20, 37, 22, 18}, 
				         {15, 18, 17, 36}};
//      縱向加總，橫向元素等長		
		for(int x = 0; x < arr2D[0].length; x++) {
			int sum = 0 ;
			for(int q = 0; q < arr2D.length; q++) {
				sum += arr2D[q][x];
			}
			System.out.println("sum=" + sum);
		}
		System.out.println("-------------------");
//      橫向加總，橫向元素等長		
		for(int a = 0; a < arr2D.length; a++) {
			int sum = 0 ;
			for(int x = 0 ; x < arr2D[a].length; x++) {
				sum += arr2D[a][x];
			}
			System.out.println("sum=" + sum);
		}
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
