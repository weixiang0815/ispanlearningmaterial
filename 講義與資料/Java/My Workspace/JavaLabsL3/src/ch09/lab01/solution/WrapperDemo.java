package ch09.lab01.solution;
/*
請改寫本程式，請以更簡潔的方式來完成前一
個範例相同的功能
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
			if (o instanceof Number) {
				Number num = (Number) o;
				total += num.doubleValue();
			} 
		}
		System.out.println("總和=" + total);
	}
}
