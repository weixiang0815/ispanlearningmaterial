package ch11._01_create._01_thread;
public class HelloThread extends Thread {
	int upperBound = 0;
	HelloThread(String name, int upperBound) {
		super(name);
		this.upperBound = upperBound;
	}
	public void run() {
		int i = 0 ;
		while (true) {
			if (getName().equals("Kitty")) {
			   System.out.println("Name="+getName()+", i="+i++);
			} else {
               System.err.println("Name="+getName()+", i="+i++);
			}			
			if (i >= upperBound)  break;
		}
	}
}
