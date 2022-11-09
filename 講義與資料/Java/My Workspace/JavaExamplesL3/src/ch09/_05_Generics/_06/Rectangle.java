package ch09._05_Generics._06;

public class Rectangle extends Shape { // 它是Shape的子類別
	double a, b;
	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	// 它Override Shape類別的getArea() ;
	public double getArea() {
		return a * b;
	}
}
