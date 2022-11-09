package ch06._03_method.rv1;

public class ExecutionSequence {
	// 本方法會產生一個-7到+7的隨機整數亂數num，然後計算
	// 1+2+..+num(總和)與1*2*..*num(階乘)
	// 由於負數沒有階乘，因此如果亂數num小於零，不計算總和與階乘
	// 如果亂數num等於零，總和於零，階乘為1。
	// 如果亂數num大於零，計算1+2+...+num的總和與num的階乘。
    public int[] sum_factorial() {
    	// 陣列的第一個元素將存放亂數num,
    	// 陣列的第二個元素將存放總和, 
    	// 陣列的第三個元素將存放階乘。    	
    	int[] result = new int[3];    
    	int num = (int)(Math.random() * 15) - 7; // 產生一個-7到+7的隨機整數亂數  
    	if (num < 0) { // 負數沒有階乘
    		result[0] = num;  
    		return result;    // 執行此敘述後，本方法的剩餘的敘述將不會再執行，
    	}                     // 程式的執行順序將回到原呼叫敘述。
    	if (num == 0) {
    		result[0] = 0; 
    		result[1] = 0;
    		result[2] = 1;
    		return result;
    	} else {
    		int sum  = 0;
    		int prod = 1;
    		for (int n=1; n <= num; n++) {
    			sum  += n;
    			prod *= n;
    		}
    		result[0] = num ;
    		result[1] = sum;
    		result[2] = prod;
    		return result;
    	} 
    }  
}
