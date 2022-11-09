package ch06._05_encapsulation.accessControl._00private;

public class CirclePrivateMain {
    public static void main(String[] args) {
        CirclePrivate c = new CirclePrivate(30, 20, 20.5);
//        c.x = 100;		// 在CirclePrivate類別之外不能存取它的
//        c.y = 50;			// private成員 : x, y, radius
//        c.radius = 20;		
        c.displayInfo();
//        c.move(+5, -10);
//        c.displayInfo();
    }
}
