package ch11._01_create._02_runnable;
public class HelloRunnable implements Runnable {
	int upperBound = 0;
	public HelloRunnable(int upperBound) {
		this.upperBound = upperBound;
	}
	public void run() {
		int i = 0;
		while (true) {
			String name = Thread.currentThread().getName();
			if (name.equals("Kitty")) {
				System.out.println(name + ", i=" + i++);
			} else {
				System.err.println(name + ", i=" + i++);
			}
			if (i >= upperBound)
				break;
		}
	}
}
