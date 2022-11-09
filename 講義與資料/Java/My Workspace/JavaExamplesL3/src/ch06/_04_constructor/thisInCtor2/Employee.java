package ch06._04_constructor.thisInCtor2;

public class Employee {
	String name;
	int age;

	public Employee(String n, int a) {
		name = n;
		age = a;
	}

	public void printData() {
		System.out.println("Name=" + name);
		System.out.println("Age=" + age);
	}

	public static void main(String args[]) {
		Employee tom = new Employee("Tom", 45);
		tom.printData();
	}
// 請於本例中加入下列敘述，然後重新編譯，看看結果為何。	
//	public void Employee(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
}
