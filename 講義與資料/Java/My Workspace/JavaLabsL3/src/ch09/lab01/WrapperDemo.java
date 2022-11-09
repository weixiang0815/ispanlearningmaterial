package ch09.lab01;
/*
請改寫本程式，請以更簡潔的方式來完成前一個範例相同的功能
 */
public class WrapperDemo {
	public static void main(String[] args) {
		Object[] oa = { Integer.valueOf(100), Double.valueOf(3.14), 
				Float.valueOf(10.0F), 	"Kitty", 
				new Object(), Long.valueOf(250), 
				Short.valueOf("20") 
		};
		double total = 0;
		for (int n = 0; n < oa.length; n++) {
			Object o = oa[n];
			if (o instanceof Integer) {
				Integer num = (Integer) o;
				total += num.intValue();
			} else if (o instanceof Double) {
				Double num = (Double) o;
				total += num.doubleValue();
			} else if (o instanceof Float) {
				Float num = (Float) o;
				total += num.floatValue();
			} else if (o instanceof Byte) {
				Byte num = (Byte) o;
				total += num.byteValue();
			} else if (o instanceof Short) {
				Short num = (Short) o;
				total += num.shortValue();
			} else if (o instanceof Long) {
				Long num = (Long) o;
				total += num.longValue();
			}
		}
		System.out.println("總和=" + total);
	}
}
