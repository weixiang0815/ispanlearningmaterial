package ch09._04_autoboxing;

import java.util.ArrayList;
import java.util.Collection;

public class AutoBoxing2 {
   public static void main(String[] args) {
	   Object oa[] = {1, 10.8, "Hello", new Byte("15"), new Float(3.14F)};
	   System.out.println(oa);
	   Collection<Object> c = new ArrayList<Object>();
	   c.add(1); c.add(10.8); c.add("Hello"); 
	   c.add(new Byte("15"));c.add(new Float(3.14F));
   }
}
