
public class ArrayDemo {

	public static void main(String[] args) {
		int arr1D[] = {30, 25, 49};
		int arr2D[][] = {{11, 25}, 
				         {20, 37, 22, 18}, 
				         {15, 18, 17, 36, 25, 79}};
		System.out.println(arr2D.length); // 3
		System.out.println(arr2D[0].length);  // 2
		System.out.println(arr2D[1].length);  // 4
		System.out.println(arr2D[2].length);  // 6
		System.out.println(arr2D[0][0] + ", " + arr2D[0][1] );  
		System.out.println(arr2D[1][0] + ", " + arr2D[1][1] + ", " + arr2D[1][2] + ", " + arr2D[1][3]);  
		System.out.println(arr2D[2][0] + ", " + arr2D[2][1] + ", " + arr2D[2][2] + ", " + arr2D[2][3]
				+ ", " + arr2D[2][4] + ", " + arr2D[2][5]	);
		
		
//		System.out.println(arr1D.length);
//		System.out.println(arr1D[0]);
//		System.out.println(arr1D[1]);
//		System.out.println(arr1D[2]);

	}

}
