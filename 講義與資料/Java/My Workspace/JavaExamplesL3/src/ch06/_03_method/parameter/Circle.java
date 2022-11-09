package ch06._03_method.parameter;

public class Circle {
	int x, y;
	double radius;
	public void setOriginal(int newX, int newY) {
    	x = newX;
    	y = newY;
    } 
	public void setRadius(double r) {
    	radius = r;
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
