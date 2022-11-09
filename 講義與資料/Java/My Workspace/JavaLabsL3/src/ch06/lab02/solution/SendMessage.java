package ch06.lab02.solution;
/*
請於套件ch06.lab02內，編寫主程式SendMessage.java，在main()之內：
1. 產生型態為Cat類別，名為kitty的物件。
    設定該物件的weight屬性為10
    設定該物件的iq屬性為50
    執行kitty的study()功能，而傳入的參數為3
    執行kitty的displayInformation()功能
2. 產生型態為Piggy類別，名為piglet的物件。
    設定該物件的weight屬性為70
    執行該物件的eat()功能，而傳入的參數為30
    執行該物件的exercise()功能，而傳入的參數為3           
    如果它的weight屬性大於它的sellableWeight屬性，請於  
    螢幕上印出『小豬可出售』，否則印出『小豬還不可出售』
3. 產生型態為Circle類別，名為c的物件。
    在螢幕上顯示它的面積
    將它的半徑設為5
    在螢幕上再度顯示改變半徑後的圓面積

由套件ch06.lab02內有Cat類別、Piggy類別、Circle類別的定義。

 */
public class SendMessage {
	public static void main(String[] args) {
		// 在這裡撰寫程式碼
		Cat kitty = new Cat();
		kitty.weight = 10;
		kitty.iq = 50;
		kitty.study(3);
		kitty.displayInformation();

		Piggy piglet = new Piggy();
		piglet.weight = 70;
		piglet.eat(30);
		piglet.exercise(3);
		if (piglet.weight > piglet.sellableWeight) {
			System.out.println("小豬可出售");
		} else {
			System.out.println("小豬還不可出售");
		}
		Circle c = new Circle();
		System.out.println(c.getArea()); //
		c.radius = 5;
		System.out.println(c.getArea()); //
	}
}
