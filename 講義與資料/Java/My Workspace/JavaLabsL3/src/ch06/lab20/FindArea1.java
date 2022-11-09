package ch06.lab20;

// Override練習一，請替此三個類別分別撰寫一個可以傳回每個類別的面積的方法，
// 方法名稱可以自行決定。
//
// 在主類別FindArea內，各新建一個物件，顯示它們的面積，
// 然後加總這三個物件的面積

class Rectangle {
	double a, b;
	Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	// 在這裡設計一個能算出長方形面積的方法
	// 面積公式 a * b

	
	
	
}

class Triangle {
	double a, h;
	Triangle(double a, double h) {
		this.a = a;
		this.h = h;
	}
	// 在這裡設計一個能算出三角形面積的方法
	// 面積公式 0.5 * a * h
	
	
	
	
}

class Circle {
	double radius;
	Circle(double r) {
		radius = r;
	}
	// 在這裡設計一個能算出圓形面積的方法
	// 面積公式 Math.PI * radius * radius
	
	
	
	
}

// main program
public class FindArea1 {
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		Rectangle r = new Rectangle(10, 20);
		Triangle t = new Triangle(5, 3);
		Circle c = new Circle(10);
		// 印出圓形的面積
//		System.out.println("圓形的面積=" + c.圓類別計算面積的方法);
//		// 印出方形的面積
//		System.out.println("方形的面積=" + r.方形類別計算面積的方法);
//		// 印出三角形的面積
//		System.out.println("三角形的面積=" + t.三角形類別計算面積的方法);
//		// 計算三個形狀物件的面積總和
//		double total = ...
//		// 印出面積的總和
//		System.out.println("面積的總和=" + total);
	}
}
