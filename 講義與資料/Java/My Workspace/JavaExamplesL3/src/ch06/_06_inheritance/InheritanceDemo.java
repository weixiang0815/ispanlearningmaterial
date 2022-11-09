package ch06._06_inheritance;

class Human extends Object { // Human是Object的子類別
	private int age = 18;  // 有private屬性:age

	void smile() {         // 有packageFriendly的smile()方法
		System.out.println("Hello World, :)");
	}

	public void setAge(int age) { // public方法:setAge()
		this.age = age;
	}

	public int getAge() { // public方法:getAge()
		return age;
	}
}

class OrdinaryPeople extends Human { // OrdinaryPeople是Human的子類別
}

// HappyMary是OrdinaryPeople的子類別
class HappyMary extends OrdinaryPeople {
	void birthday() {
		setAge(getAge() + 1);
	}
}

class InheritanceDemo {
	public static void main(String args[]) {
		HappyMary hm = new HappyMary();
		hm.smile();
		// hm.age++; // NG，子代類別不能直接存取父代類別的private成員
		System.out.println(hm.getAge());
		hm.birthday();
		System.out.println(hm.getAge());
	}
}
