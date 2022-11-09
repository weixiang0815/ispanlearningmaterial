package ch11._05_PC_NG_1;
public class PC_NG_Main {
	public static void main(String[] args) {
		  SharedData sd = new SharedData() ;
		    Producer p = new Producer(sd) ;
		    Consumer c = new Consumer(sd) ;
		    Thread t1 = new Thread(p) ;
		    Thread t2 = new Thread(c) ;
		    // t1.setPriority(10) ;
		    t2.start() ;
		    t1.start() ;
		    System.out.println("Program ends") ;
	}
}

