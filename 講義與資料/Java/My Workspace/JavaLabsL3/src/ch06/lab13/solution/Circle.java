package ch06.lab13.solution;

public class Circle {
	public double radius;
	public Circle(double r) {
		radius = r;
	}
	public double getArea() {
		return Math.PI * radius * radius; 
	}
}
