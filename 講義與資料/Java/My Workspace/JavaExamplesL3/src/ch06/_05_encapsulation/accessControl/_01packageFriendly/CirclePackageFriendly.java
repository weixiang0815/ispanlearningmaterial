package ch06._05_encapsulation.accessControl._01packageFriendly;

public class CirclePackageFriendly {
// 沒有public, private或protected修飾字的成員稱為PackageFriendly
// (又稱default)成員。
// 屬於default的屬性、方法、建構子與內部類別(統稱為成員)的可見度：
// 除了同一個類別內的方法、建構子可以使用外，同一個套件內的其它類別
// 內的方法、建構子也可以使用此類別的default成員。
// 換言之，default成員的可見度由單一類別之內擴展到該類別所屬的
// 套件之內，所以又稱為Package Friendly。
	int x, y;      	// default屬性
	double radius;	// default屬性

	public CirclePackageFriendly(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
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
