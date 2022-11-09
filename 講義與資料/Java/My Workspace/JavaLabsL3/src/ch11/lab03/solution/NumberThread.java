package ch11.lab03.solution;

public class NumberThread extends Thread {
	int[] ia;
	public NumberThread(int[] ia) {
		this.ia = ia;
	}	
	public void run() {
	   for(int x = 0; x < ia.length; x++){
		   ia[x] = (int)(Math.random() * 10) + 1 ; 
	   }
	}
	public void printArray(){
		System.out.print("陣列元素有:");
		for(int x:ia){
			System.out.print( x + " ");
		}
		System.out.println();
	}
}
