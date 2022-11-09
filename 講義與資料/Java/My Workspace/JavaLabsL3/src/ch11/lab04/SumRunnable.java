package ch11.lab04;

public class SumRunnable implements Runnable {
	//請加上適當的敘述
	@SuppressWarnings("unused")
	private int[] ia1;
	@SuppressWarnings("unused")
	private int[] ia2;
	Thread t1;
	Thread t2;
	private int sum = 0;

	public void run() {
		
	}
	public int getSum() {
		return sum;
	}
}
