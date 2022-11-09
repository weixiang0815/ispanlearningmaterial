package ch02;
import java.util.Collection;

import java.util.Set;
import java.util.TreeSet;

public class LotteryBean {    
	private int lowerBound;			// 屬性、變數
	private int upperBound;
	private int ballNumber;			//  建構子
	public LotteryBean() {
	}
	public void setLowerBound(int lowerBound) {				// 方法
		this.lowerBound = lowerBound;
	}
	public void setUpperBound(int upperBound) {				// 方法
		this.upperBound = upperBound;
	}
	public void setBallNumber(int ballNumber) {				// 方法
		this.ballNumber = ballNumber;
	}
	public Collection<Integer> getLuckyNumbers() {			// 方法
		Set<Integer> set = new TreeSet<Integer>();
		while (set.size() < ballNumber) {
			int num = (int) (Math.random() * (upperBound - lowerBound + 1)) + lowerBound;
			set.add(num);
		}
		return set;
	}
}
