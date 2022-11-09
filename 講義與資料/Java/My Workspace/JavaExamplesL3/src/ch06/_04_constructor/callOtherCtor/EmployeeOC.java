package ch06._04_constructor.callOtherCtor;

public class EmployeeOC {
	String name;
	int age;
	public EmployeeOC(String name, int age) {
		// 如果有任何程式片段是多個建構子共用，可以寫在這裡
		this.name = name;
		this.age = age;
	}
	public EmployeeOC(String name) {
		// this.name = name ;
		this(name, 0);	// 呼叫有兩個參數的建構子
	}
	public EmployeeOC() {  // 呼叫有一個參數的建構子
		// this.name = "測試用" ;
		this("測試用");
	}
	public void printData() {
		System.out.println("Name=" + name);
		System.out.println("Age=" + age);
	}	
}
