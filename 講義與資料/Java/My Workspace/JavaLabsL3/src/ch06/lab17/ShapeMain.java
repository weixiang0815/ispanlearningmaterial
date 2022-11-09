package ch06.lab17;

/*
// 1. 請新建Circle類別、Rectangle類別與Triangle類別，
//    它們都必須是Shape類別的子類別。
// 2. Shape類別有一個private屬性data，要如何修改Shape類別
//    使得外界能夠讀取data的值，但不能更改data的值?
//
//  移除ShapeMain類別的main()方法內的註解，執行此類別來測試你的程式碼。
*/
public class ShapeMain {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("c1的面積=" + c1.getShapeArea());

		Rectangle r1 = new Rectangle();
		System.out.println("r1的面積=" + r1.getShapeArea());

		Triangle t1 = new Triangle();
		System.out.println("t1的面積=" + t1.getShapeArea());	
		 
		System.out.println(c1.getData());
		System.out.println(r1.getData());
		System.out.println(t1.getData());		
	}
}
