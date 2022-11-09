package ch06.lab14;

public class Rectangle {
	public double a, b;

	public Rectangle(double n, double m) {
		this.a = n;
		this.b = m;
	}
	
	public double getRectArea() {
		return this.a * this.b;
	}
}
