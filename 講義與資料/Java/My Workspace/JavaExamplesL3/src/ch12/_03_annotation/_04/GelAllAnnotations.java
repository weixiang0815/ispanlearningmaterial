package ch12._03_annotation._04;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
//本範例的myMeth有參數
public class GelAllAnnotations {
	@What(desc = "這是甚麼東東...")
	@MyAnno(str = "這個範例的myMeth()方法有兩個註釋，" +
						"利用reflection讀取全部的註釋", val = 200)
	public static void myMeth(String s, int i, double[] da) {
		try {
			Class<GelAllAnnotations> c = GelAllAnnotations.class;
			Method m = c.getMethod("myMeth", String.class, int.class, 
										double[].class);
			Annotation[] ma = m.getAnnotations();
			for (Annotation a: ma){
				if (a.annotationType() == What.class){
					What w = (What)a;
					System.out.println("讀到What註釋的desc:" + w.desc());
				} else if (a.annotationType() == MyAnno.class){
					MyAnno w = (MyAnno)a;
					System.out.println("讀到MyAnno註釋的str:" + w.str());
				}  
			}
		} catch (NoSuchMethodException e) {
			System.out.println("找不到指定的方法:" + "myMeth");
		}
	}
	public static void main(String[] args) {
		myMeth("111", 12, new double[]{1.1, 20} );
	}
}
