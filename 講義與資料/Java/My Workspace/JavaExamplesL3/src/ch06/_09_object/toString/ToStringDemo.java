package ch06._09_object.toString;
class Point {
	int x;
	int y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(x, y) = (" + x + ", " + y + ")";
	}
}
public class ToStringDemo {
	public static void main(String[] args) {
		Point p = new Point(3, 4);
		System.out.println("toString()的三種用法：\n(1)直接印出物件\n" +
				"(2)呼叫物件的toString()\n(3)字串與物件相加\n");
		System.out.print("toString()的第一種用法："); 
		System.out.println(p);
		System.out.println("toString()的第二種用法：" + p.toString());
		System.out.println("toString()的第三種用法：" + p);
	}
}
