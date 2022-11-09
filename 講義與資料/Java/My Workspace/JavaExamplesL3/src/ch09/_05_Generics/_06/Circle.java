package ch09._05_Generics._06;

public class Circle extends Shape { // 它是Shape的子類別
	double radius;

	Circle(double r) {
		radius = r;
	}

	// 它Override Shape類別的getArea() ;
	public double getArea() {
		return 3.14 * radius * radius;
	}
}
