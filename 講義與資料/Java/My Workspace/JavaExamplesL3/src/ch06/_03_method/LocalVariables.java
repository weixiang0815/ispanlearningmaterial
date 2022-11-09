package ch06._03_method;

public class LocalVariables {
   public void m1() {
	   long sum = 0 ;  //變數sum的有效範圍為由此行開始，直到m1()方法結束為止 
	   for (int i=1; i < 100; i++) {  
		   //變數count的有效範圍為for敘述的一對大刮弧
		   int count = 0;     
		   if ( i % 2 == 0 ) {
			   // int i = 100;  // NG
			   sum += i;
			   count++;
			   System.out.println("count=" + count);  // OK
		   }
	   }
	   System.out.println("sum=" + sum);
	   // System.out.println("count=" + count);  // NG
	   int i = 1 ;    // OK
	   sum = 0 ; 
	   while ( i <= 100) {
		   sum += i ;
	   }
   }
}
