package ch06.lab15.solution;

public class Triangle {
	public double a, h ;
	public Triangle(double a0, double h0) {
		a = a0;
		h = h0;
	}
	public double getTriArea() {
		return a * h * 0.5; 
	}
}
