import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr1D[] = {30, 25, 49};
		int arr2D[][] = {
				{11, 25, 34},
				{20, 37, 22, 18},
				{15, 18, 17, 36, 25, 79}
		};
		System.out.println(arr2D.length);
		System.out.println(arr2D[0].length);
		System.out.println(Arrays.toString(arr2D[0]));
		System.out.println(arr2D[1].length);
		System.out.println(Arrays.toString(arr2D[1]));
		System.out.println(arr2D[2].length);
		System.out.println(Arrays.toString(arr2D[2]));
		System.out.println(arr2D[0][2]);

	}

}
