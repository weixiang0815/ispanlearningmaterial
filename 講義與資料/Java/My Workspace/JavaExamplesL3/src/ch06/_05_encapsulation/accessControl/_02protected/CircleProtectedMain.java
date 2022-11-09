package ch06._05_encapsulation.accessControl._02protected;
// 本類別與CircleProtected.java屬於同一個套件
public class CircleProtectedMain {
    public static void main(String[] args) {
        CircleProtected c = new CircleProtected(30, 20, 20.5);
        c.displayInfo();	// public成員
        c.move(+5, -10);	// public成員	
        c.displayInfo();	// public成員
        c.radius = 30;		// protected成員
        c.displayInfo();
        c.getArea();		// default成員
    }
}
