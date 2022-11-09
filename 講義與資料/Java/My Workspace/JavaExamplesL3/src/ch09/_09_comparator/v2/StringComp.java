package ch09._09_comparator.v2;

import java.util.Comparator;

public class StringComp implements Comparator<String> {
    int n;
	public StringComp(int n) {
		this.n = n;
	}
	public int compare(String o1, String o2) {
		return o1.substring(n).compareTo(o2.substring(n));
	}
}
