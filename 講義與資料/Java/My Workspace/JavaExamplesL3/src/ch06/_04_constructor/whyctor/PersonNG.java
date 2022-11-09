package ch06._04_constructor.whyctor;
// 此類別沒有使用者定義的建構子
public class PersonNG {
	String name;
	String address;
	String userId;
	public void displayInfo(){
		System.out.println("姓名：" + name);
		System.out.println("地址：" + address);
		System.out.println("代號：" + userId);
	}
}
