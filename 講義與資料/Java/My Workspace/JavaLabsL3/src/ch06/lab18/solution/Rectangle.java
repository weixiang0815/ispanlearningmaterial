package ch06.lab18.solution;

public class Rectangle extends Shape {
	private double width;   // 矩形的寬(width)
	private double height;  // 矩形的高(height)
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}	
	public double getArea() {
	    double area = width * height; 
		return area;
	}   
}
