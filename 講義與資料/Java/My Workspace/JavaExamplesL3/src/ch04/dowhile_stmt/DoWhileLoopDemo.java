package ch04.dowhile_stmt;                                 
                                                           
public class DoWhileLoopDemo {                             
    public static void main(String[] args) {               
        int x=1, sum=0 ;                                   
        do {                                                
            sum  +=  x ; 
            System.out.println(" x=" + x + ", sum=" + sum);
            x++ ;                                          
        } while ( x <= 10 )  ;                             
        System.out.println("sum="+ sum) ;                  
    }                                                      
}                                                          
