package ch11._05_PC_NG_1;

public class SharedData {
	  private int data ;
	  synchronized public void setData(int i){
	  // producer
	     data = i ; 
	     System.out.println("Producer producing the data, sd.data=" + (char)data) ;
	  }	
	  synchronized public int getData(){
	  // consumer 
	     System.out.println("Consumer consuming the data, sd.data=" + (char)data) ;
	     return data ;
	  }
}
