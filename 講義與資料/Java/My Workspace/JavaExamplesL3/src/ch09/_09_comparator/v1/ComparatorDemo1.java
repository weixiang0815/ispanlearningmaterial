package ch09._09_comparator.v1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// 字串的預設排序
public class ComparatorDemo1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Amada");
		list.add("Monica");
		list.add("Selena");
		list.add("Bonny");
		list.add("Zanda");
		Collections.sort(list);
		for(String s : list) {
			System.out.println(s);
		}
	}
}
