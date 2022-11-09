package ch03.lab18.solution;

//如何將字串 "2.58" 轉換為浮點數 2.58

public class ProgramCh03Lab18 {
	public static void main(String[] args) {
		String s = "2.58";
		System.out.println("請將字串 2.58 轉換為浮點數 2.58，然後存入變數 d：");
		double d = Double.parseDouble(s);
		System.out.println(" d = " + d);
	}
}
