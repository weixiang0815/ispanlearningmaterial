package ch09._09_comparator.v2.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 由字串的第三個字元開始排序
public class ComparatorDemo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Amada");
		list.add("Monica");
		list.add("Selena");
		list.add("Bonny");
		list.add("Zanda");
		int n = 3;
		Collections.sort(list, (String o1, String o2) -> o1.substring(n)
				.compareTo(o2.substring(n)));
		for (String s : list) {
			System.out.println(s);
		}


	}
}
