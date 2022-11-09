package ch06.lab21;

//  承前題，設計一個服務類別 Service，它可以加總三種圖形的面積
//
class Rectangle {
	double a, b;
	Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	// 在這裡設計一個能算出長方形面積的方法
	// 面積公式 a * b
	public double getRectArea() {
		double area = a * b;
		return area;
	}
}
class Triangle {
	double a, h;
	Triangle(double a, double h) {
		this.a = a;
		this.h = h;
	}
	// 在這裡設計一個能算出三角形面積的方法
	// 面積公式 0.5 * a * h
	public double getTriArea() {
		double area = 0.5 * a * h;
		return area;
	}
}
class Circle {
	double radius;
	Circle(double r) {
		radius = r;
	}
	// 在這裡設計一個能算出圓形面積的方法
	// 面積公式 Math.PI * radius * radius
	public double getCircleArea() {
		double area = radius * radius * Math.PI;
		return area;
	}
}

class Service {
	// 這是一個服務類別，它能將不同圖形物件的面積加總到totalArea變數內，
	// 請替三種圖形分別撰寫一個方法：
	// public void accumulateRectArea(Rectangle r):加總長方形物件的面積到變數totalArea內
	// public void accumulateCircleArea(Circle c):加總圓形物件的面積到變數totalArea內
	// public void accumulateTriangleArea(Triangle t):加總三角形物件的面積到變數totalArea內
	// 分別來加總長方形物件、圓形物件、三角形物件的面積到同一個變數內。
	// 討論：這種方式有一個缺點，要替不同形狀類別分別準備一個方法，如果新增一個
	// 形狀類別(如五邊形)就必須修改此類別。

	private double totalArea = 0;

	public void accumulateRectArea(Rectangle r) {

	}

	public void accumulateCircleArea(Circle c) {

	}

	public void accumulateTriangleArea(Triangle t) {

	}

	public double getTotalArea() {
		return totalArea;
	}
}

// main program
public class FindArea2 {
	public static void main(String args[]) {
		Rectangle r = new Rectangle(10, 20);
		Triangle t = new Triangle(5, 3);
		Circle c = new Circle(10);
		// 印出圓形的面積
		System.out.println("圓形的面積=" + c.getCircleArea());
		// 印出方形的面積
		System.out.println("方形的面積=" + r.getRectArea());
		// 印出三角形的面積
		System.out.println("三角形的面積=" + t.getTriArea());
		// 計算三個形狀物件的面積總和
		// 新建一個 Service 類別
		Service s = new Service();
		// 累加面積
		s.accumulateRectArea(r);
		s.accumulateCircleArea(c);
		s.accumulateTriangleArea(t);
		// 印出面積的總和
		System.out.println("面積的總和=" + s.getTotalArea());
	}
}
