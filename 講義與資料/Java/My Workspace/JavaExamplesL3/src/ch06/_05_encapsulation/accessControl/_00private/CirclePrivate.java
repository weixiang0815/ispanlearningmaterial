package ch06._05_encapsulation.accessControl._00private;

public class CirclePrivate {
// 含有private修飾字的屬性、方法、建構子與內部類別(統稱為成員)的可見度：	
// private成員只能讓同一個類別內的方法、建構子使用，不屬於同一個類別
// 內的方法、建構子都不能使用本類別的private成員。	
	private int x, y;
	private double radius;

	public CirclePrivate(int x, int y, double radius) {
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

    // private方法只能讓同一個類別的其他方法呼叫
	private double getArea() {
		return Math.round(Math.PI * radius * radius * 100) / 100.0;
	}

	private double getCircumference() {
		return Math.round(Math.PI * radius * 100) / 100.0;
	}
}
