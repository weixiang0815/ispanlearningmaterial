package ch03.lab16;

// 請編寫程式ch03.lab16.ProgramCh03Lab16，
// 在main()之內進行四捨五入。

public class ProgramCh03Lab16 {
	public static void main(String[] args) {
		System.out.println("印出變數 area 時，只印兩位小數(要四捨五入)：");
		double area = 5.76 * 5.76 * 3.14;
		area = Math.round(area * 100) / 100.0;
		System.out.println("area=" + area);
	}
}
