package ch11.lab03.solution;

public class SumThread extends Thread {
	private int[] ia1;
	private int[] ia2;
	NumberThread nt1;
	NumberThread nt2;
	private int sum = 0;

	public SumThread(int[] ia1, int[] ia2, NumberThread nt1, NumberThread nt2) {
		this.ia1 = ia1;
		this.ia2 = ia2;
		this.nt1 = nt1;
		this.nt2 = nt2;
	}

	public void run() {
		try {
			nt1.join();
			nt2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int n = 0; n < ia1.length; n++) {
			sum += ia1[n];
		}
		for (int n = 0; n < ia2.length; n++) {
			sum += ia2[n];
		}
//		nt1.printArray();
//		nt2.printArray();
//		System.out.println(getSum());
	}

	public int getSum() {
		return sum;
	}

}
