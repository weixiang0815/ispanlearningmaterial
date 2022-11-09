package ch11._03_sleep;

class Thread1 extends Thread {
	public void run() {
		try {
			System.out.println(getName() + " is going to sleep");
			if (getName().equals("Thread-0"))
				sleep(10000);
			else
				sleep(2000);
			System.out.println(getName() + " waking up");
		} catch (InterruptedException e) {
			System.out.println(getName() + " is interrupted while sleeping");
		}
	}
}

class ThreadSleepDemo {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
		Thread1 t2 = new Thread1();
		t2.start();
	}
};
