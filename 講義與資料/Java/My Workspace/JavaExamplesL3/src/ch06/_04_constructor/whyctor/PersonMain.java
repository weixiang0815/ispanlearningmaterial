package ch06._04_constructor.whyctor;

public class PersonMain {
	public static void main(String[] args) {
		PersonNG pNG1 = new PersonNG();
		pNG1.name = "張君雅";
		pNG1.address = "台中市";
		pNG1.userId = "kitty123";
		pNG1.displayInfo();
		System.out.println("=================");
		Person p1 = new Person("張君雅", "台中市", "kitty123");
		p1.displayInfo();
	}
}
