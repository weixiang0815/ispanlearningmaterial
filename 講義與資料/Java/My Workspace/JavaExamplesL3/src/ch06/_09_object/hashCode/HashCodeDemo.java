package ch06._09_object.hashCode;

public class HashCodeDemo {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		String s = "xyz";
		System.out.println("Cat類別的物件c1的hashCode值" + c1.hashCode());
		System.out.println("Cat類別的物件c2的hashCode值" + c2.hashCode());
		System.out.println("Dog類別的物件d1的hashCode值" + d1.hashCode());
		System.out.println("Dog類別的物件d2的hashCode值" + d2.hashCode());
		System.out.println("String類別的物件s的hashCode值" + s.hashCode());

	}
}
