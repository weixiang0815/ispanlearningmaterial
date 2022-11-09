package ch07._03_abstract;

abstract class Shape {
	abstract double getArea();
}

class Rectangle extends Shape {
	double width = 5;

	double height = 10;

	double getArea() {
		return width * height;
	}
}

class Circle extends Shape {
	double radius = 10;

	double getArea() {
		return radius * radius * 3.14;
	}
}

public class AbstractDemo01 {
	static public void main(String[] args) {
		Circle c = new Circle();
		System.out.println("c's area=" + c.getArea());
		Rectangle r = new Rectangle();
		System.out.println("r's area=" + r.getArea());
	}
}
