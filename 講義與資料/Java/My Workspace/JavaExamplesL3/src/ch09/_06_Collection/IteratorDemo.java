package ch09._06_Collection;

import java.util.*;

public class IteratorDemo {
	public static void main(String[] args) {
		Collection<Object> c = new ArrayList<>();
		c.add(new Integer(123));
		c.add(new Integer(456));
		c.add(new Double(3.14));
		c.add("Penelope");
		c.add(new Integer(456));
		Iterator<Object> it = c.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			if (o.equals("Penelope")) {
				it.remove();
			}
		}
		System.out.println("----------");
		it = c.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
//			if (o.equals("Penelope")) {
//				it.remove();
//			}
		}
	}
}
