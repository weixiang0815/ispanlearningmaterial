package ch11.lab03;

public class NumberThread extends Thread {
	//請加上適當的敘述
	int[] ia;
	public void run() {
	 
	}
	public void printArray(){
		System.out.print("陣列元素有:");
		for(int x:ia){
			System.out.print( x + " ");
		}
		System.out.println();
	}
}
