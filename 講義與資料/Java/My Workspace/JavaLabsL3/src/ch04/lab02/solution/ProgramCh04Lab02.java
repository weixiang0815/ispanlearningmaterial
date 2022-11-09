package ch04.lab02.solution;

// 練習目的：了解if敘述的用法
// 產生介於-5到5的隨機亂數，印出該亂數，
// 如果該亂數大於0，則印出"此數為正數"。

public class ProgramCh04Lab02 {
    public static void main(String[] args) {
    	int n = (int)(Math.random() * 11) - 5 ;
    	System.out.println("隨機亂數:" + n);
    	if (n > 0) {
    		System.out.println("此數為正數");
    	}
    }
}
