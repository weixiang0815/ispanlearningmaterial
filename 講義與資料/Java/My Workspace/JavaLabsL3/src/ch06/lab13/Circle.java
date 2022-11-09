package ch06.lab13;

public class Circle {
	public double radius;
	
	public Circle(double r) {
		this.radius = r;
	}

	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
}
