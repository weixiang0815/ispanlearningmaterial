package ch09._06_Collection;

import java.util.*;

public class For50Demo {
	public static void main(String[] args) {
		Collection<Number> c = new ArrayList<>();
		double sum = 0 ;
		c.add(new Integer(123));
		c.add(new Integer(456));
		c.add(new Double(3.14));
		c.add(new Integer(456));
		
		for(Number o: c){
			sum += o.doubleValue();
		}
		System.out.println("sum=" + Math.round(sum + 100) / 100.0);
	}
}
