package ch09._04_autoboxing;

public class AutoBoxing1 {
   public static void main(String[] args) {
	   
	   Character c = 'A';
	   Integer   i = 100;
	   Double    d = 200.0;
	   double sum =  c + i + d ;
	   System.out.println("sum=" + sum);
	   
	   Boolean t = true;
	   if ( t ) {
		   System.out.println("1. 真");
	   } else {
		   System.out.println("1. 假");
	   }
	   
	   t = new Boolean("tRuE");  // 必須是 TRUE
	   if ( t ) {
		   System.out.println("2. 真");
	   } else {
		   System.out.println("2. 假");
	   }
	   t = new Boolean("truth");  // 必須是 TRUE
	   if ( t ) {
		   System.out.println("2. 真");
	   } else {
		   System.out.println("2. 假");
	   }
   }
}
