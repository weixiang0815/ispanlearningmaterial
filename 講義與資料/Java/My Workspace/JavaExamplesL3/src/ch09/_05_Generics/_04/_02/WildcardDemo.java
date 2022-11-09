package ch09._05_Generics._04._02;

import ch09._05_Generics._01.Gen;

public class WildcardDemo {
	// 此方法只接受參數為Gen<Object>
	// 不接受參數為Gen<String>,Gen<Integer>...
	// 簡言之，任何參數型態不是Gen<Object>都不接受
	public void processObjData(Gen<Object> g) {
		Object o = g.getData();
		// 在此處理物件 o 
	    System.out.println(o);
	}
	// 參數為泛形類別的物件 
	public void processAllData(Gen<?> g) {
		Object o = g.getData();
		// 在此處理物件 o 
	    System.out.println(o);
	}

	public static void main(String[] args) {
		Gen<Integer> iobj = new Gen<Integer>(100);
		Gen<String>  sobj = new Gen<String>("Kitty");
		Gen<Object>  oobj = new Gen<Object>(new Object());
		WildcardDemo wd = new WildcardDemo();
//		wd.processObjData(iobj);    // NG
//		wd.processObjData(sobj);    // NG
		wd.processObjData(oobj);    // OK
		wd.processAllData(iobj);    // OK
		wd.processAllData(sobj);    // OK
		wd.processObjData(oobj);    // OK
	}

}
