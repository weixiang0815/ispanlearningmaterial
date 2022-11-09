package ch11._01_create;

public class StarRunnableMain {

	
	public static void main(String[] args) {
	    StarRunnable sr1 = new StarRunnable(10, '$');
	    Thread t1 = new Thread(sr1, "Micky");
	    t1.start();
	    StarRunnable sr2 = new StarRunnable(20, '%');
	    Thread t2 = new Thread(sr2, "Kitty");
	    t2.start();
	    System.out.println("程式結束");
	}

}
