package ch11._01_create;

public class StarRunnable implements Runnable {
	int num;
    char ch;
    
	public StarRunnable(int num, char ch) {
		this.num = num;
		this.ch = ch;
	}
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		for(int j=1; j<=num; j++){
			System.out.print("Name=" + t.getName() );
			for(int i=1; i<=j; i++){
				System.out.print(ch);
			}
			System.out.println();
		}

	}

}
