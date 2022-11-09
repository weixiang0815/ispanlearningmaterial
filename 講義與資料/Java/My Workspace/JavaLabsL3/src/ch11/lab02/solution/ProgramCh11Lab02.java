package ch11.lab02.solution;
/*
 * 1. 利用實作java.lang.Runnable介面的方式設計一個類別DrawStarRunnable，
 *    在它的public void run()方法內繪製下列的圖形
 * #
 * ##
 * ###
 * ...
 * ...
 * #######
 * 繪製的列數與符號(即上面的#)必須由建構子傳入到類別內。
 * 2. 由下面的main()方法來建構兩個以上的執行緒物件，然後呼叫
 *    它們的start()方法，來繪製三角型圖案。
 */
public class ProgramCh11Lab02 {
	public static void main(String[] args) {
		DrawStarRunnable ds1 = new DrawStarRunnable(5, '@');
		Thread t1 = new Thread(ds1);
		DrawStarRunnable ds2 = new DrawStarRunnable(3, '%');
		Thread t2 = new Thread(ds2);
		t1.start();
		t2.start();
	}
}
