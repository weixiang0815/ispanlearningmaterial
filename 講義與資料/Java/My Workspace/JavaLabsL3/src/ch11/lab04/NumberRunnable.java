package ch11.lab04;

public class NumberRunnable implements Runnable {
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
