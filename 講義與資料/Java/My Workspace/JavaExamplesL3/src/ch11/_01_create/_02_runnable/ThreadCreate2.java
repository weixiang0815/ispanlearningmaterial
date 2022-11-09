package ch11._01_create._02_runnable;
public class ThreadCreate2 {
	public static void main(String args[]) {
		HelloRunnable r = new HelloRunnable(1500);
		Thread t1 = new Thread(r, "Kitty");
		HelloRunnable s = new HelloRunnable(2000);
		Thread t2 = new Thread(s, "Micky");
		t1.start(); 	t2.start();
	}
}
