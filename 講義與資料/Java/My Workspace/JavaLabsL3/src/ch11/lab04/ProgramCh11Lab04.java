package ch11.lab04;

/*
 * 1. 利用實作java.lang.Runnable介面的方式設計一個類別NumberRunnable，
 *    在它的public void run()方法內產生5個介於1-10的隨機亂數，同時將
 *    這五個隨機亂數一續存入一個陣列內，此陣列會由NumberRunnable類別的建構子
 *    傳入類別內。
 * 2. 在main()方法內新建兩個int[]，各自有五個元素。接著以這兩個陣列為參數，
 *    新建兩個NumberThread類別的物件。
 * 3. 利用實作java.lang.Runnable介面的方式設計一個類別SumRunnable在它的
 *    public void run()方法內，加總這兩個 陣列內的所有元素。
 * 4. 你需要自行新建適當的Thread類別的物件，同時傳入適當的Runnable類別的物件。
 */
public class ProgramCh11Lab04 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int ia1[] = new int[5];
		int ia2[] = new int[5];
		
	}

}
