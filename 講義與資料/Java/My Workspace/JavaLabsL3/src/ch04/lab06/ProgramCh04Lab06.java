package ch04.lab06;

// 將字串 "Hi, 大家好!" 一列印出一個字元
// 你可利用for敘述與System.out.println()來完成
// 提示: "Hi, 大家好!".charAt(0) 可以取出字串內的第一個字元: H
public class ProgramCh04Lab06 {
    public static void main(String[] args) {
      String s = "Hi, 大家好!";
    	for (int i = 0; i < s.length(); i++) {
    		System.out.println(s.charAt(i));
    	}
    	
    }
}
