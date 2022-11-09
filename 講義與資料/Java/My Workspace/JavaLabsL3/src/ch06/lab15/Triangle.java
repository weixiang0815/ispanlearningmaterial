package ch06.lab15;

public class Triangle {
	public double a, h;

	public Triangle(double n, double m) {
		this.a = n;
		this.h = m;
	}
	
	public double getTriArea() {
		return this.a * this.h / 2;
	}
}
