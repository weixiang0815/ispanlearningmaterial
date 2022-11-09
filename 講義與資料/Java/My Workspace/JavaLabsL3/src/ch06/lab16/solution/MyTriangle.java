package ch06.lab16.solution;

public class MyTriangle {
	public double side, height;	

	public MyTriangle(double side, double height) {
		this.side = side;
		this.height = height;
	}

	public double getTriArea() {
		return side * height * 0.5;
	}
}
