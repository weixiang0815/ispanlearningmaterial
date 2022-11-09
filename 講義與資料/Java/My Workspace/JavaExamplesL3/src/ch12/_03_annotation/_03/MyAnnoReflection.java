package ch12._03_annotation._03;

import java.lang.reflect.Method;

import ch12._03_annotation._02.CatAnno;

//本範例的myMeth有參數

public class MyAnnoReflection {
	@CatAnno(meow = "Hello, World", count = 10)
	public static void myMeth(String s, int i, double[] da) {
		try {
			Class<MyAnnoReflection> c = MyAnnoReflection.class;
			Method m = c.getMethod("myMeth", String.class, int.class, double[].class);
			CatAnno ma = m.getAnnotation(CatAnno.class);
	 		int v = ma.count();
			String msg = ma.meow();
			System.out.println("讀到的註釋, val=" + v + ", msg=" + msg);
			@SuppressWarnings( {"rawtypes"})
			Class ca = ma.annotationType();
			System.out.println(ca.getName());
			for(int n=1; n <= v; n++){
			    System.out.println(n + "." + msg);	
			}
		} catch (NoSuchMethodException e) {
			System.out.println("找不到指定的方法:" + "myMeth");
		}
	}
	public static void main(String[] args) {
		myMeth("111", 12, new double[]{1.1, 20} );
	}
}
