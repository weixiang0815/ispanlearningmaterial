package ch06._05_encapsulation.accessControl._02protected;

public class CircleProtected {
// 含有protected修飾字的屬性、方法、建構子與內部類別(統稱為成員)的可見度：
// 除了同一個類別內的方法、建構子可以使用、同一個套件的其它類別內的方法、
// 建構子也可以使用此類別的protected成員以外，不屬於同一個套件但如果是
// 本類別的子類別，其內的方法、建構子也可以使用本類別的protected成員。
//	
// protected成員的可見度比default還大，但是小於public
// private成員：只有本類別內的方法、建構子可以使用本類別的private成員。
// default成員：只有本類別內的方法、建構子，或屬於同一個套件內的所有類別內
//           	的方法、建構子可以使用本類別的default成員。
// protected成員:本類別內的方法、建構子，同一個套件內之類別的方法、建構子，
//          	 不同套件，但是本類別的子類別的方法、建構子都可以本類別的
//               protected成員。	
// public成員:沒有任何限制，任何套件內之任何類別的方法、建構子可以使用
//            本類別的public成員。
	protected int x, y;     	// protected屬性 	
	protected double radius;	// protected屬性

	public CircleProtected(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public CircleProtected() {
	}

	public void setOriginal(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void move(int distanceX, int distanceY) {
		x += distanceX;
		y += distanceY;
	}

	public void displayInfo() {
		System.out.println("本圓的圓心為: (" + x + "," + y + "), 半徑為:" 
		   + radius + ", 面積為:" + getArea() + ", 圓周為:" + getCircumference());
	}

	// default方法
	double getArea() {
		return Math.round(Math.PI * radius * radius * 100) / 100.0;
	}
    // private方法
	private double getCircumference() {
		return Math.round(Math.PI * radius * 100) / 100.0;
	}
}
