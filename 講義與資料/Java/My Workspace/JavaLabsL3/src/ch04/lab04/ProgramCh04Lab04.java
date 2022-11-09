package ch04.lab04;
// 練習目的：了解if敘述的用法
// 產生介於-5到5的隨機亂數，印出該亂數，
// 如果該亂數大於0，則印出"該數為正數" ，否則如果該亂數小於0 ，則
// 印出"該數為負數" ，否則印出"該數為0"
public class ProgramCh04Lab04 {
    public static void main(String[] args) {
        int n = (int)(Math.random() * 11) - 5;
        System.out.println("隨機亂數：" + n);
        System.out.println((n > 0) ? "該數為正數" : (n < 0) ? "該數為負數" : "該數為0");
//        if(n > 0) {
//        	System.out.println("該數為正數");
//        }
//        else if(n < 0) {
//        	System.out.println("該數為負數");
//        }
//        else {
//        	System.out.println("該數為0");
//        }

    }
}
