package ch04.while_stmt;                 
                                                 
public class WhileLoopDemo {                     
   public static void main(String[] args) {      
     int x = 1, sum = 0 ;                        
     while ( x <= 10 ) {                         
         sum += x ;                               
         x++ ;                                    
     }                                           
     System.out.println("sum=" + sum) ;          
  }                                              
}
