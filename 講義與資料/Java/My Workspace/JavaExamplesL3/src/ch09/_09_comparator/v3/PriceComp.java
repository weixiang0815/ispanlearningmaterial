package ch09._09_comparator.v3;

import java.util.Comparator;

public class PriceComp implements Comparator<Price> {
	public int compare(Price o1, Price o2) {
		return o1.getPrice() - o2.getPrice();
	}
}
