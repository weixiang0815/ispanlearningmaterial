package ch06.lab03;

public class CarMain {
	public static void main(String[] args) {
		ToyCar controller1 = new ToyCar();
		controller1.hour = 2;
		controller1.speed = 10;
		controller1.getDistance();  // 此行印出『此玩具車走了20.0公里』
		
		ToyCar controller2 = controller1;
		controller2.hour = 1;
		controller2.speed = 5;
		
		controller1.getDistance();  // 此行印出何種訊息?
	}
}
// 問題1:本題產生幾個物件? 答：1個
// 問題2:最後一行敘述會印出何種訊息? 答：『此玩具車走了5.0公里』
