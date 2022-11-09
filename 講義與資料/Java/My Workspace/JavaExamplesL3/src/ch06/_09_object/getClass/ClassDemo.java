package ch06._09_object.getClass;

public class ClassDemo {	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws ClassNotFoundException {
         Class<?> c0 = int.class;
         Class<?> c1 = ch01.PrintlnDemo.class;
         Class<?> c2 = Class.forName("ch01.PrintlnDemo");
         Class<?> c3 = Void.class;
         if (c1 == c2) {
        	 System.out.println("完全相同");
         }
	}
}
