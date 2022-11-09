package ch06.lab01;
/*
請於套件ch06.lab01內，撰寫主程式CreateObject.java，在
main()之內：
1. 產生型態為Cat類別之物件，物件參考存入名為kitty的變數內。
簡稱為產生型態為Cat類別，名為kitty的物件。
2. 產生型態為Piggy類別之物件，物件參考存入名為piglet的變數內。
簡稱為產生型態為Piggy類別，名為piglet的物件。
3. 產生型態為Circle類別之物件，物件參考存入名為c的變數內。
簡稱為產生型態為Circle類別，名為c的物件。

在套件ch06.lab01內有Cat類別、Piggy類別與Circle類別的定義。
*/
public class CreateObject {
	public static void main(String[] args) {
		// 1.
		Cat kitty = new Cat();
		
		// 2.
		Piggy piglet = new Piggy();
		
		// 3.
		Circle c = new Circle();
		
	}
}
