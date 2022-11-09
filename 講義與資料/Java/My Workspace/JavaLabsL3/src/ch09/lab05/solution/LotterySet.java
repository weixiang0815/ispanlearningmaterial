package ch09.lab05.solution;

import java.util.HashSet;
import java.util.Set;

public class LotterySet {
	// 利用『Set重複的資料只保留一份的特性』來產生樂透號碼
	public Set<Integer> getLuckyNumbers(int lowerBound, int upperBound, int ballNumber) {
		Set<Integer> set = new HashSet<>();
		while (set.size() < ballNumber) {
			int num = (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound);
			set.add(num);
		}
		return set;
	}
}
