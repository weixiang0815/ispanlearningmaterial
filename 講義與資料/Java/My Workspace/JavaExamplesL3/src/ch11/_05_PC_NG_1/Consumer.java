package ch11._05_PC_NG_1;

public class Consumer implements Runnable {
	  SharedData sd ;
	  public Consumer(SharedData sd) {
	     this.sd = sd ;
	  }	
	  public void run() {
	    int i ;
	    System.out.println("Consumer begins to work") ;
	    while(true) {  // while (true) {
	    	
	      	
	    	int j = (int)(Math.random()* 1000) ;
	        System.out.println("One new job for Consumer.") ;
	    	if ( (i = sd.getData()) ==  -1 ) {
	    	  break ;
	    	}  
	    	System.out.println("after consuming the data, consumer goes to sleep, time=" +  j ) ;
	    	try {
	           Thread.sleep(j) ;
	        } catch(InterruptedException e) {}       	
	        
	    }	
	  }	
}
