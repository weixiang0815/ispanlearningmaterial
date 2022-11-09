package ch11.lab03.solution;
/*
 * 1. 利用繼承java.lang.Thread類別的方式設計一個類別NumberThread，
 *    在它的public void run()方法內產生5個介於1-10的隨機亂數，同時將
 *    這五個隨機亂數一續存入一個陣列內，此陣列會由NumberThread類別的建構子
 *    傳入類別內。
 * 2. 在main()方法內新建兩個int[]，各自有五個元素。接著以這兩個陣列為參數，
 *    新建兩個NumberThread類別的物件。
 * 3. 利用繼承java.lang.Thread類別的方式設計一個SumThread類別，
 *    在它的public void run()方法內，加總這兩個 陣列內的所有元素。  
 */
public class ProgramCh11Lab03 {
	public static void main(String[] args) {
		int ia1[] = new int[5];
		int ia2[] = new int[5];
		NumberThread nt1 = new NumberThread(ia1);
		NumberThread nt2 = new NumberThread(ia2);
		nt1.start();
		nt2.start();
		SumThread st = new SumThread(ia1, ia2, nt1, nt2);
		st.start();
		try {
			nt1.join();
			nt2.join();
			st.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		nt1.printArray();
		nt2.printArray();
		System.out.println(st.getSum());
	}
}
