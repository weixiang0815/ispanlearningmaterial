package ch06._03_method.rv;
import java.util.Date;
public class ReturnValueDemo {
	public void returnValue0() {
		System.out.println("本方法沒有傳回值");
	}
	public int returnValue1() {
		System.out.println("本方法傳回一個整數：");
		int num = (int)(Math.random() * 11) - 5 ;
		return num;
	}
	public int[] returnValue2() {
		System.out.println("本方法傳回一個陣列：");
		int yy = 2012;
		int mm = 6;
		int dd = 30;
		int[] ar1 = { yy, mm, dd };
		return ar1;
	}
	public Message returnValue3() {
		System.out.println("本方法傳回一個Message型態的物件：");
		Message msg = new Message();
		msg.code = 100;
		msg.msg = "請細讀本範例";
		msg.now = new Date();
		return msg;
	}
}
