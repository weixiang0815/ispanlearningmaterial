 package ch02;
                                                            
 public class IntegerVariables {                            
   public static void main(String args[]) {                 
     	byte b0 = 127;                                         
     	byte b1 = -128;                                        
     	int i1  = 65535;                                        
     	short s = -32768;                                      
     	int i2  = 2147483647;                                   
     	long l  = -2147483649L;
                                                            
     	System.out.println("b0=" + b0 + ", b1=" + b1 + ",  s=" + s + ",  i1=" 
          + i1 + ",  i2=" + i2 + " l=" + l);                
   }                                                        
 }