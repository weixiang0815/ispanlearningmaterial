package ch09._10_time;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Temp {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("0001", 10);
		map.put("0002", 20);
		map.put("0003", 30);
		map.put("0002", 30);
		// 下一行會印出__(10)___
		System.out.println(map.size());

		// Map介面的哪個方法會傳回Set型別的物件?
		Set<String> set = map.keySet();

		// Map介面的哪個方法會傳回Collection型別的物件?
		Collection<Integer> coll = map.values();

		Iterator<String> it = set.iterator();
		int total = 0;
		while (it.hasNext()) {
			String str = it.next();
			total += map.get(str);
		}

	}

}
