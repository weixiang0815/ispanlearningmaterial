package ch09._09_comparator.v2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// 由字串的第三個字元開始排序
public class ComparatorDemo2 {
	public static void main(String[] args) {
		StringComp sc = new StringComp(2);
		List<String> list = new ArrayList<String>();
		list.add("Amada");
		list.add("Monica");
		list.add("Selena");
		list.add("Bonny");
		list.add("Zanda");
		// 當有第二個參數時，Collections.sort()會依照第二個參數所定義的排序方式來排序
		Collections.sort(list, sc);
		for(String s : list) {
			System.out.println(s);
		}
	}
}
