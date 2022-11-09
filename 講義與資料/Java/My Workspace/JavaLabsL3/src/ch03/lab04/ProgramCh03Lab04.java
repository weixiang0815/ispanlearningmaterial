package ch03.lab04;
/*
請編寫程式ch03.lab04.ProgramCh03Lab04，在main()之
內定義兩個型態為double 的變數 x, y，其內含值為:
10.8,  3.2，請印出以此兩數值為邊長的長方形週長(len)
和與面積(area)。  
*/
public class ProgramCh03Lab04 {
	public static void main(String[] args) {
		double x = 10.8, y = 3.2;
		System.out.println("周長：" + ( x + y ) * 2);
		System.out.println("面積：" + x * y);

	}

}
