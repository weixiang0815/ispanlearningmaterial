package ch06._05_encapsulation.accessControl._02protected.anotherPackage;

import ch06._05_encapsulation.accessControl._02protected.CircleProtected;

//本類別與CircleProtected.java不屬於同一個套件
public class CircleProtectedMain {
	public static void main(String[] args) {
		CircleProtected c = new CircleProtected(30, 20, 20.5);
		c.displayInfo(); // public成員
		c.move(+5, -10); // public成員
		c.displayInfo(); // public成員
		// c.radius = 30;   // protected成員，not visible
		c.displayInfo();
		// c.getArea();     // default成員，not visible
		// c.getCircumference(); // not visible，因為getCircumference()為private
	}
}
