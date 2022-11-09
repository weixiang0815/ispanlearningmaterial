package ch06._04_constructor.___;

class Cat {
	String name;
	int age;
	double weight;
	Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void eat(double foodWgt) {
		this.weight += foodWgt;
	}
}

public class ThisInConstructor {
	public static void main(String[] args) {
		Cat kitty = new Cat("Kitty", 1);
		System.out.println("Name=" + kitty.name + ", age=" + kitty.age);
	}
}
