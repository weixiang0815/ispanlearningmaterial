package ch06.lab18.solution;
/*
1. ch06.lab17有個缺點：由於每個子類別都繼承Shape類別，這些類別的物件 計算
        面積的方法都使用繼承來的getShapeArea()，因此得到的答案都一樣(100)，本
        練習要改正這個缺點。
2. 在套件ch06.lab18內的Circle類別、Rectangle類別與Triangle類別都是
   Shape類別的子類別，而且各有一個建構子，會傳入相關屬性的初值:
     Circle類別: 傳入圓的半徑(radius)
     Rectangle類別: 傳入矩形的寬(width) 、高(height)
     Triangle類別: 傳入三角形的底(side) 、高(height)
       每個子類別都會自動擁有父類別所擁有的所有方法，但是這些方法如果不適合子類別，子
       類別可以Override繼承來的方法。
   Shape類別有一個新的方法如下：
      public double getArea() {
	     return 0; 
      }
      此方法負責計算Shape家族類別的面積。
      
3. 每個Shape家族的子類別都必須Override這個繼承來的方法，在此方法內計算自己的面積: 
     Circle類別的面積: Math.PI * radius * radius
     Rectangle類別的面積: width * height
     Triangle類別的面積: 0.5 * side* height  

4. 修改三個子類別後執行ShapeMain類別的main()方法來測試你的程式。
 
*/
public class ShapeMain {
	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		System.out.println("c1的面積=" + c1.getArea());

		Rectangle r1 = new Rectangle(10,20);
		System.out.println("r1的面積=" + r1.getArea());

		Triangle t1 = new Triangle(10, 5);
		System.out.println("t1的面積=" + t1.getArea());	
	}
}
