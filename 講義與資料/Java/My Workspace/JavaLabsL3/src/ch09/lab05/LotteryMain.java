package ch09.lab05;

import java.util.Set;

public class LotteryMain {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		LotterySet lb = new LotterySet();
		Set<Integer> set = lb.getLuckyNumbers(1, 49, 6);
		System.out.println("你的樂透明牌為(Set版):" );
		// 利用5.0for敘述將set內的數字印出
	}
}
