package ch06._03_method.parameter;

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        // 30, 20分別傳入setOriginal()的參數newX與newY
        c.setOriginal(30, 20);  
        // 20.5傳入setRadius()的參數r
        c.setRadius(20.5);
        c.displayInfo();
	   // +5, -10分別傳入move()的參數distanceX與distanceY
        c.move(+5, -10);
        c.displayInfo();
    }
}
