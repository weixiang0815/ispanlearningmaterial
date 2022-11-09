package ch08._05_Override;

import java.io.* ;  
import java.net.* ;
class  SuperClass { 
   protected void methodA() throws IOException {
      System.out.println("dummy method") ;
   }
}
public class  ExceptionOfMethodOverriding extends SuperClass {
   protected void methodA() throws RuntimeException,
       FileNotFoundException, MalformedURLException {
       System.out.println("another dummy method") ;
   }
   public static void main(String[] args)  {
  	  //
   }
}

