package ch06.lab18.solution;

public class Triangle extends Shape {
	private double side;   // 三角形的底(side)
	private double height; // 三角形的高(height)
	public Triangle(double side, double height) {
		this.side = side;
		this.height = height;
	}	
	public double getArea() {
	    double area = 0.5 * side* height; 
		return area;
	}   
}
