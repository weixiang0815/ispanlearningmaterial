package ch06._04_constructor.thisInCtor;
// 用this來區分實例變數與區域變數
public class Circle {
	int x, y;
	double radius;	
	public Circle(int x, int y, double radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
//		setOriginal(x, y);   //OK
//		setRadius(radius);   //OK
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
		return Math.round(Math.PI * radius * 100 ) / 100.0;
	}
}
