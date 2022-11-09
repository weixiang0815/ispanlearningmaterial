package ch03.lab08.solution;

import java.text.NumberFormat;

public class ProgramCh03Lab08 {
	/*
	  請編寫程式ch03.lab08.ProgramCh03Lab08，在main()之
	  內請將華氏70度轉換攝氏溫度。
	  
	  提示: 華氏溫度減去 32, 然後乘以 5, 再除以 9 即為攝氏溫度。
	 */
	public static void main(String[] args) {
		double f = 70, c;
		c = (f - 32) * 5 / 9.0;
		System.out.println("華氏溫度為" + f);
		System.out.println("攝氏溫度為" + c);
		// 如何印出兩位小數
	    NumberFormat nf = NumberFormat.getInstance();
	    nf.setMaximumFractionDigits(2);           //設定小數只顯示兩位
	    System.out.println("華氏溫度" + f + "度 = 攝氏溫度 "+ nf.format(c) +"度");
	}
}
