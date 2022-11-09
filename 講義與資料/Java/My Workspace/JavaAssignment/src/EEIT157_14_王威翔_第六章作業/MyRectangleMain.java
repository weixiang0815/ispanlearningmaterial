package EEIT157_14_王威翔_第六章作業;

public class MyRectangleMain {

	public static void main(String[] args) {
		MyRectangle R1 = new MyRectangle();
		R1.setDepth(10);
		R1.setWidth(20);
		System.out.println(R1.getArea());
		
		MyRectangle R2 = new MyRectangle(20, 10);
		System.out.println(R2.getArea());

	}

}
