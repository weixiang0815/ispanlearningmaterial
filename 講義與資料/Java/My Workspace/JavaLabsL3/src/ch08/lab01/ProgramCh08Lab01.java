package ch08.lab01;
/*
執行程式ProgramCh08Lab01.java時會當掉，產生例外(java.lang.ArithmeticException)。
請加入適當的 try-catch 區塊使其在發生例外狀況時，能夠顯示下列訊息：
    『執行除法時，產生除數為零的例外』
另外，要加上finally區塊，此區塊會顯示下列訊息：
    『這是finally區塊』
將分母改成正整數，再執行本程式，觀察執行後的結果。
 */
public class ProgramCh08Lab01 {
	static void subroutine() {

		int d = 0;
		int a = 42 / d;
		System.out.println("a=" + a);

	}

	public static void main(String args[]) {
		subroutine();
	}
}
