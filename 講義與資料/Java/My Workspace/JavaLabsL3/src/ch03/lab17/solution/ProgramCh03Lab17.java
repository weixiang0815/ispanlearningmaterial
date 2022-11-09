package ch03.lab17.solution;

// 如何將字串 "123" 轉換為整數 123

public class ProgramCh03Lab17 {
    public static void main(String[] args) {
    	String s = "123";
		System.out.println("請將字串 123 轉換為整數 123，然後存入變數n：");
		int n = Integer.parseInt(s);
		System.out.println(" n = " + n);
    }
}
