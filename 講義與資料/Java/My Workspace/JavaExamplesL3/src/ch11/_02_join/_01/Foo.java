package ch11._02_join._01;

public class Foo implements Runnable {
	long sum = 0;
	int startNumber, endNumber;

	public Foo(int startNumber, int endNumber) {
		this.startNumber = startNumber;
		this.endNumber = endNumber;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " 開始. ");
		for (int i = startNumber; i <= endNumber; i++) {
			sum += i;
		}
		System.out.println(Thread.currentThread().getName() + " 結束. ");
	}
	
}
