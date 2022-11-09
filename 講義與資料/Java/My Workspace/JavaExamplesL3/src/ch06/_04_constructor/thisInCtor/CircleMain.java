package ch06._04_constructor.thisInCtor;

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle(30, 20, 20.5);
        c.displayInfo();
        c.move(+5, -10);
        c.displayInfo();
    }
}
