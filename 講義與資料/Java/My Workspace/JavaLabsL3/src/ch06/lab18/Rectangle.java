package ch06.lab18;

public class Rectangle extends Shape {
	@SuppressWarnings("unused")
	private double width;   // 矩形的寬(width)
	@SuppressWarnings("unused")
	private double height;  // 矩形的高(height)
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}	
}
