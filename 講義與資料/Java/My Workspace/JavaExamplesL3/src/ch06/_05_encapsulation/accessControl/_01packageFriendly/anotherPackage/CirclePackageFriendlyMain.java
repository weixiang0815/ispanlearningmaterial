package ch06._05_encapsulation.accessControl._01packageFriendly.anotherPackage;

import ch06._05_encapsulation.accessControl._01packageFriendly.CirclePackageFriendly;
//此類別與CirclePackageFriendly.java不屬於同一個套件
public class CirclePackageFriendlyMain {
    public static void main(String[] args) {
        CirclePackageFriendly c = new CirclePackageFriendly(30, 20, 20.5);
        c.displayInfo();
        // c.radius = 30;  // not visible，因為radius屬性為package friendly
        c.displayInfo();
        // c.getArea();    // not visible，因為getArea()方法為package friendly
        // c.getCircumference();  // not visible，因為getCircumference()為private
    }
}
