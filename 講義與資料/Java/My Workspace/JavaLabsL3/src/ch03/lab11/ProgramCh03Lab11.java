package ch03.lab11;

// 資料型態轉換(Cast)運算子的運算優先順序『優於』加法運算子(+)

public class ProgramCh03Lab11 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("請更正本程式的錯誤");
		int i = 5, j = 10;
		short s = (short)(i + j); 
		System.out.println("s=" + s);
	}
}
