package ch04.lab05;

// 使用for 敘述
// 1. 印出 1 + 2 + 3 + 4 + .... + 18 + 19 + 20 的總和
// 2. 印出 1 + 3 + 5 + .... + 17 + 19 的總和
// 3. 印出 2 + 4 + 6 + .... + 18 + 20 的總和

public class ProgramCh04Lab05 {
    public static void main(String[] args) {
    	int n = 0;
    	for (int i = 1; i <= 20; i ++) {
    		n += i;
    	}
    	System.out.println("第1題總和：" + n);
    	
    	n = 0;
    	for (int i = 1; i <= 19; i += 2) {
    		n += i;
    	}
    	System.out.println("第2題總和：" + n);
    	
    	n = 0;
    	for (int i = 2; i <= 20; i += 2) {
    		n += i;
    	}
    	System.out.println("第3題總和：" + n);
    	
    	
    }
}
