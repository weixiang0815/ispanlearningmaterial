package ch06._09_object.equals;

public class EqualsMain {
	public static void main(String[] args) {
		Rectangle re1 = new Rectangle(100, 150);
		Rectangle re2 = new Rectangle(100, 150);
		System.out.println(re1.equals(re2));
		Triangle t = new Triangle();
		System.out.println(re1.equals(t));
	}
}
