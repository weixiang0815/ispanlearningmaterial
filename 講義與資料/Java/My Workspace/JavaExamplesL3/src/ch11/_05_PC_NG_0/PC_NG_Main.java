package ch11._05_PC_NG_0;

public class PC_NG_Main {
	public static void main(String[] args) throws Exception {
		SharedData sd = new SharedData();
		Producer p = new Producer(sd);
		Consumer c = new Consumer(sd);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);

		t1.start();
		t2.start();
		System.out.println("~~~~~~~~主類別結束...~~~~~~~~");
	}
}

