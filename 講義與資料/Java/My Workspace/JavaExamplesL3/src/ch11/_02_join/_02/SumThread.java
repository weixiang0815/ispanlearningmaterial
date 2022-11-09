package ch11._02_join._02;

public class SumThread extends Thread {
	long sum = 0;
	int startNo, endNo;

	public SumThread(String name, int s, int e) {
		super(name);
		startNo = s;
		endNo = e;
	}

	public void run() {
		System.out.println("Thread " + getName() + " starts");
		for (int i = startNo; i <= endNo; i++)
			sum += i;
		System.out.println("Thread " + getName() + " ends");
	}
}
