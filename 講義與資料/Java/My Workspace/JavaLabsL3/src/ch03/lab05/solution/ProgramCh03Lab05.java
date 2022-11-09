package ch03.lab05.solution;

public class ProgramCh03Lab05 {
/*
 請編寫程式ch03.lab05.ProgramCh03Lab05，在main()
 之內定義某三角形的底(side)與高(height)分別為 10、 5， 
 計算此三角形的面積並顯示在螢幕上。
 (三角形的面積為『底』乘上『高』除以2)
 
*/
	public static void main(String[] args) {
		double side = 10, height = 5;
		System.out.println("此三角形的面積為: " + (side * height) * 0.5 );
	}
}
