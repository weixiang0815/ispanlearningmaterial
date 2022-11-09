package ch06._03_method.rv1;

public class ExecutionSequenceMain {

	public static void main(String[] args) {
        ExecutionSequence es = new ExecutionSequence();
        int [] ans = es.sum_factorial();
        if (ans[0] < 0) {
        	System.out.println("負數不計算相關數據:" + ans[0]) ;
        } else {
        	System.out.println("1加到" + ans[0] +  "的總和為:" + ans[1]  
        			+ ", "+ ans[0] +"的階乘為:" + ans[2]) ;
        }
	}
}
