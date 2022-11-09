package ch11.lab04.solution;

public class SumRunnable implements Runnable {
	//請加上適當的敘述
	private int[] ia1;
	private int[] ia2;
	Thread t1;
	Thread t2;
	private int sum = 0;

	public SumRunnable(int[] ia1, int[] ia2, Thread t1, Thread t2) {
		this.ia1 = ia1;
		this.ia2 = ia2;
		this.t1 = t1;
		this.t2 = t2;
	}

	public void run() {
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int n = 0; n < ia1.length; n++) {
			sum += ia1[n];
		}
		for (int n = 0; n < ia2.length; n++) {
			sum += ia2[n];
		}
	}
	public int getSum() {
		return sum;
	}
}
