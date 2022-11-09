package ch06._05_encapsulation.accessControl._02protected.anotherPackage;

import ch06._05_encapsulation.accessControl._02protected.CircleProtected;
// 本類別與CircleProtected.java不屬於同一個套件，不過
// 是CircleProtected類別的子類別
public class CircleProtectedSubclass extends CircleProtected {
	public CircleProtectedSubclass(int x, int y, int radius) {
        this.x = x;          
        this.y = y;
        this.radius = radius;
	}
    public void process() {
    	displayInfo(); // public成員
		move(+5, -10); // public成員
		displayInfo(); // public成員
		radius = 30;   // protected成員OK，因為是它的子類別
		displayInfo();
		// c.getArea();     // default成員，not visible
		// c.getCircumference(); // not visible，因為getCircumference()為private
    }
}
