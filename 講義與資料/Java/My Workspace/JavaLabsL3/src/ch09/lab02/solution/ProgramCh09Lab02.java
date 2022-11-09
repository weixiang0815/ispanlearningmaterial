package ch09.lab02.solution;

import java.util.ArrayList;
import java.util.Vector;
/*
編寫ProgramCh09Lab02.java，在main()之內宣告一個
ArrayList類別之物件al，其內必須存放下列資料：
  new Integer(10000)
  new Double(3.14)
  new Long(21L)
  short型別之物件(值為100)
  new Double(5.1)
  "Kitty"
  new Integer(200)
  new Object()
  建構一個Vector類別之物件v，其內必須存放下列資料：new Integer(10000)與new Integer(200)
  判斷物件al是否完全包含(containsAll())物件v
  印出物件al與物件v的元素個數
  將v轉換為元素是Integer的陣列
 */
public class ProgramCh09Lab02 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ArrayList<Object>  al = new ArrayList<>();
		al.add(Integer.valueOf(10000));
		al.add(Double.valueOf(3.14));
		al.add(Long.valueOf(21L));
		al.add(Short.valueOf("100"));
		al.add(Double.valueOf(5.1));
		al.add("Kitty");
		al.add(Integer.valueOf(200));
		al.add(new Object());
		Vector<Integer> v = new Vector<>();
		v.add(Integer.valueOf(200));
		v.add(Integer.valueOf(10000));
		System.out.println("物件al是否完全包含物件v:" + al.containsAll(v));
		System.out.println("物件al的元素個數:" + al.size());
		System.out.println("物件v的元素個數:" + v.size());
		Integer[] ia = (Integer[])v.toArray(new Integer[0]);
	}
}
