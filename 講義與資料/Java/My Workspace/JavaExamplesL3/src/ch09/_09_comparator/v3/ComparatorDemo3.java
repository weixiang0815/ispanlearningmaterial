package ch09._09_comparator.v3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 對飛機、鑽石、小狗類別的物件依照價格由小到大來排序
public class ComparatorDemo3 {
	public static void main(String[] args) {
		PriceComp pc = new PriceComp();
		List<Price> list = new ArrayList<Price>();
		Diamond d1 = new Diamond(2.5, 500000);
		Diamond d2 = new Diamond(5.0, 1000000);
		Plane   p1 = new Plane(12000, 50000);
		Plane   p2 = new Plane(2000, 60000);
		Dog   dg1  = new Dog(12, 5);
		Dog   dg2  = new Dog(2, 50);	
		list.add(d1);  list.add(d2);
		list.add(p1);  list.add(p2);
		list.add(dg1);  list.add(dg2);
		
		Collections.sort(list, pc);
		for(Price s : list) {
			System.out.println(s);
		}
	}
}
