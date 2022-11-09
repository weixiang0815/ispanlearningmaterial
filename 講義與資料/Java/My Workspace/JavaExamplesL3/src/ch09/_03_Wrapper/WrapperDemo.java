package ch09._03_Wrapper;

public class WrapperDemo {
	public static void main(String[] args) {
		Object[] oa = { new Integer(100), new Double(3.14), 
				new Float(10.0F), 	"Kitty", 
				new Object(), new Long(250), 
				new Short("20")
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
