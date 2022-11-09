package x.appendix.p538;

public class MainClass {

	public static void main(String[] args) {
		Cat   kitty = new Cat();
		Mammal   mm = new Cat();
		System.out.println(mm.getClass().getName());
		System.out.println(kitty.getClass().getName());
		Mammal   m = kitty;
		System.out.println(m.getClass().getName());
		m = new Dog();
		System.out.println(m.getClass().getName());
		if (m instanceof Cat) {
		   kitty = (Cat)m;
		} else {
           System.out.println("型態錯誤");
		}
	}

}
