package ch06._05_encapsulation.accessControl._03public;

public class CirclePublicMain {
    public static void main(String[] args) {
        CirclePublic c = new CirclePublic(30, 20, 20.5);
        c.displayInfo();
        c.move(+5, -10);
        c.displayInfo();
        c.radius = -20.5;	//由此行可看出一個類別將屬性設成public的缺點
        c.displayInfo();
    }
}
