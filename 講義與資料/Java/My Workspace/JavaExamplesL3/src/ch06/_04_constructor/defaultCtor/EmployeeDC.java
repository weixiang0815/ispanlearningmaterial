package ch06._04_constructor.defaultCtor;

public class EmployeeDC {
	String name;

	int age;

	public EmployeeDC(String n, int a) {
		name = n;
		age = a;
	}
	// 如果此類別沒有任何建構子，Java編譯程式會為此類別準備
 	// 如下的預設建構子
	public EmployeeDC() {
		
	}
}
