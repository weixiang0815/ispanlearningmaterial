package ch06.lab22.solution;

// 1. Override練習三，改進前一個練習的缺點。希望Service能夠只用一個方法就能加總
// 所有圖形的面積。

// 2. 首先我們希望這些圖形類別內，計算面積之方法的名稱要相同。
// 因此設計一個稱為Shape的類別如下，其內定義一個計算面積的方法getArea()

class Shape {
	public double getArea() {
		return 0;
	}
}

// 3. 接者重新設計這些個類別，使得這三個類別都是Shape的子類別，每個類別都
// Override Shape類別的getArea()方法。

class Rectangle extends Shape  { // 讓它是 Shape 的子類別
	double a, b;

	Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	// 修改此方法，讓它Override Shape類別的getArea() ;
	public double getArea() {
		double area = a * b;
		return area;
	}
}

class Triangle extends Shape{ // 讓它是Shape的子類別
	double a, h;

	Triangle(double a, double h) {
		this.a = a;
		this.h = h;
	}
	// 修改此方法，讓它Override Shape類別的getArea() ;
	public double getArea() {
		double area = 0.5 * a * h;
		return area;
	}
}

class Circle extends Shape { // 讓它是Shape的子類別
	double radius;

	Circle(double r) {
		radius = r;
	}
	// 修改此方法，讓它Override Shape類別的getArea() ;
	public double getArea() {
		double area = radius * radius * Math.PI;
		return area;
	}
}

class Service {
	private double totalArea = 0;

// 4. 修改Service類別，原來的三個方法刪除，改以新的方法來取代：
//    請解開下面四行敘述的註解。	
	public void accumulateArea(Shape x) { // 參數x的型態為何?
		totalArea += x.getArea();     // 透過 參數x來執行家族共有方法     
		System.out.println("傳入之物件所屬類別:" + x.getClass().getName());
	}
	
// 不再需要原來的三個方法
//	void accumulateRectArea(Rectangle r) {
//		totalArea += r.rectArea();
//	}
//
//	void accumulateCircleArea(Circle c) {
//		totalArea += c.circleArea();
//	}
//
//	void accumulateTriangleArea(Triangle t) {
//		totalArea += t.triArea();
//	}

	public double getTotalArea() {
		return totalArea;
	}
}

// main program
public class FindArea3 {
	public static void main(String args[]) {
		Rectangle r = new Rectangle(10, 20);
		Triangle t = new Triangle(5, 3);
		Circle c = new Circle(10);
		// 印出圓形的面積
		System.out.println("圓形的面積=" + c.getArea());
		// 印出方形的面積
		System.out.println("方形的面積=" + r.getArea());
		// 印出三角形的面積
		System.out.println("三角形的面積=" + t.getArea());
		// 新建一個 Service 類別
		Service sv = new Service();
		// 累加面積，不用原來的方法
//		sv.accumulateRectArea(r) ;
//		sv.accumulateCircleArea(c) ;
//		sv.accumulateTriangleArea(t) ;
//    	 改用新的方法：請解開下面三行敘述的註解。
		sv.accumulateArea(r);
		sv.accumulateArea(c);
		sv.accumulateArea(t);
		// 印出面積的總和
		System.out.println(" Total Area= " + sv.getTotalArea());
	}
}
// 結果答案完全相同，優質程式，此為OOP中，多形的優點。
