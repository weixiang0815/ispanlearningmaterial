package ch09._05_Generics._05;

public class GenericMethod {
	// 泛型方法: printArray可以印出多種不同型式的陣列
	// 
	public <E> void printArray(E[] inputArray) {
		// 顯示陣列內的元素
		for (E element : inputArray) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] ia = {1, 2, 3};
		String[]  sa = {"Kitty", "Snoopy"};
		
		GenericMethod gm = new GenericMethod();
		gm.printArray(ia);    // OK
		gm.printArray(sa);    // OK
	}
}
