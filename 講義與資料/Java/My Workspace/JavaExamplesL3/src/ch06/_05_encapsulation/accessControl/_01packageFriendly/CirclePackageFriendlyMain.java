package ch06._05_encapsulation.accessControl._01packageFriendly;
//此類別與CirclePackageFriendly.java屬於同一個套件
public class CirclePackageFriendlyMain {
    public static void main(String[] args) {
        CirclePackageFriendly c = new CirclePackageFriendly(30, 20, 20.5);
        c.displayInfo();
        c.radius = 30;
        c.displayInfo();
        c.getArea();
        // c.getCircumference();  // not visible，因為getCircumference()為private
    }
}
