package ch03.lab13a.solution;
// 請利用指定運算子: +=, -=, *=, /= 來改寫本程式
public class ProgramCh03Lab13A {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int  sum= 10;
		int  x= 5;
		sum += x;   	// sum = sum + x;
		System.out.println("1. sum=" + sum);
		int  prod = 20;
		int  y = 5;
		prod  *=  y ; 	// prod  =  prod * y ;    
		System.out.println("2. prod=" + prod);
		int  total = 100;
		int  z = 70;
		total  -=  z ;	//total  =  total - z ;
		System.out.println("3. total=" + total);
		int  div = 100;
		int  w = 20;	
		div  /=  20 ;   // div  =  div / 20 ;  
		System.out.println("4. div=" + div);
	}
}
