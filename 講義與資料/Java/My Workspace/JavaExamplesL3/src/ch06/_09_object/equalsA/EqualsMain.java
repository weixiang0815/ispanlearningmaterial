package ch06._09_object.equalsA;

public class EqualsMain {
	public static void main(String[] args) {
		Rectangle re1 = new Rectangle(100, 150, 0.5, "A");
		Rectangle re2 = new Rectangle(100, 150, 0.5, "A");
		System.out.println(re1.equals(re2));
		Triangle t = new Triangle();
		System.out.println(re1.equals(t));
	}
}
