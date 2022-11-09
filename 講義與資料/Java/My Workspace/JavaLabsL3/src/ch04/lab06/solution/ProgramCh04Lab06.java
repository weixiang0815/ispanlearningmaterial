package ch04.lab06.solution;

// 將字串 "Hi, 大家好!" 一列印出一個字元
// 你可利用for敘述與System.out.println()來完成
// 提示: "Hi, 大家好!".charAt(0) 可以取出字串內的第一個字元: H
public class ProgramCh04Lab06 {
	public static void main(String[] args) {
		String str = "Hi, 大家好!";
		for (int n = 0; n < str.length(); n++) {
			System.out.println(str.charAt(n));
		}
	}
}
