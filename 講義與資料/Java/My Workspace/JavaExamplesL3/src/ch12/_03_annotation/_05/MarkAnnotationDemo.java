package ch12._03_annotation._05;
import java.lang.reflect.Method;
//本範例的myMeth有參數
public class MarkAnnotationDemo {
	@Marker()
	public static void myMeth(String s, int i, double[] da) {
		try {
			Class<MarkAnnotationDemo> c = MarkAnnotationDemo.class;
			Method m = c.getMethod("myMeth", String.class, int.class,
					double[].class);
			if (m.isAnnotationPresent(Marker.class)) {
				System.out.println("註釋Marker存在");
			} else {
				System.out.println("註釋Marker不存在");
			}

		} catch (NoSuchMethodException e) {
			System.out.println("找不到指定的方法:" + "myMeth");
		}
	}

	public static void main(String[] args) {
		myMeth("111", 12, new double[] { 1.1, 20 });
	}
}
