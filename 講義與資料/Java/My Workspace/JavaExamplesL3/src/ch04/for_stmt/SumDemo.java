package ch04.for_stmt;                                    
                                                          
// 算出 1 + 2 + 3 + 4 + 5 + ... + 10 的總和               
public class SumDemo {                                    
   public static void  main(String[] args)   {
      int sum = 0 ;                                       
      for (int i = 1; i <= 10; i++)  {              
          sum = sum + i;       // sum += i;                           
          System.out.println("i=" + i + ", sum=" + sum ) ;
      }                                                   
      System.out.println("sum=" + sum ) ;                 
   }                                                      
}
