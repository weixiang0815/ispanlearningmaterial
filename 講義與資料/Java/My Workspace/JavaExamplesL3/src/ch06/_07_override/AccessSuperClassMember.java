package ch06._07_override;

class A {
	public int age = 10;

	void smile() {
		System.out.println(":)");
	}
}

class B extends A {	// B是A的子類別
	void smile() {		// Override父類別的smile()方法
		System.out.println("Ha");
	}
}

class C extends B {	// C是B的子類別
	
	// 下面的變數String age不是Override父代的變數，
	// 只視為與父代類別的同名變數這不是正常的類別設計。
	// 正常的設計應將此變數更名。只有父代子代的方法之間
	// 才有Override的情形
	String age = "約20歲"; 

	void smile() {
		//在子類別內，如果需要執行父代類別的方法，super.method()
		//需要這樣做的原因如下： 當子代類別Override父代類別
        //的方法時，如果父代方法內有ㄧ定要執行的敘述，否則程式無法正常運作，
        //此時我們可在父代方法內使用super.method()來呼叫父代方法。
		super.smile();  
		System.out.println("HaHaHa.....");
	}

	void displayAge() {
		System.out.println("本物件所屬類別定義的age =" + age);
		System.out.println("父類別定義的age =" + super.age);
	}
}

public class AccessSuperClassMember {
	public static void main(String[] args) {
		C c = new C();
		c.smile();      // 這一行會呼叫C的smile()方法
		c.displayAge();
	}
}
