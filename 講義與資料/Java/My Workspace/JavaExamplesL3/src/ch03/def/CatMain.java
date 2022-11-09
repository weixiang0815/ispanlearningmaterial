package ch03.def;

public class CatMain {
	public static void main(String[] args) {
	   Cat kitty = new Cat("張凱蒂", "台中市文心路", 0.25);
	   kitty.eat(5);
	   System.out.println(kitty.weight);
	}
}
