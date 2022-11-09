package ch11._05_PC_NG_1;

public class Producer implements Runnable {
	  SharedData sd ;
	    
	  Producer(SharedData sd) {
	     this.sd = sd ;
	  }	
	  String s = "ABCDEFGHIJK" ;
	  int[] a = {10, 20, 3 , 40, 55 } ;
	  public void run() {
	    System.out.println("Producer begins to work") ;
	    for (int i = 0 ; i < s.length() ; i++) {
	        System.out.println("One new job for Producer.") ;
	    	int j = (int)(Math.random()* 1000) ;
	    	sd.setData( s.charAt(i)) ;
	        System.out.println("after producing the data, producer goes to sleep, time=" + j ) ;

	        try {
	           Thread.sleep(j) ;
	        } catch(InterruptedException e) {}       	

	    }	
	    sd.setData( -1 );
	  }	
}
