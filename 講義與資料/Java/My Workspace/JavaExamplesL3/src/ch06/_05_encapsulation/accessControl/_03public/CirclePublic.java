package ch06._05_encapsulation.accessControl._03public;

public class CirclePublic {
// 含有public修飾字的屬性、方法、建構子與內部類別(統稱為成員)，
// 在存取上沒有任何限制，即同一個類別之內、類別之外(又分為是否屬於
// 同一個套件與不同套件兩種情況)都可存取。
// 類別的public成員的可見度沒有任何限制。		
	public int x, y;
	public double radius;	
	public CirclePublic(int x, int y, double radius) {
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
	public void displayInfo(){
		System.out.println("本圓的圓心為: (" + x + "," + y + "), 半徑為:" 
	          + radius + ", 面積為:" + getArea() + ", 圓周為:" + getCircumference());
	}
	public double getArea() {
		return Math.round(Math.PI * radius * radius * 100 ) / 100.0;
	}
	public double getCircumference() {
		return Math.round(2 * Math.PI * radius * 100 ) / 100.0;
	}
}
