package ch06._04_constructor.whyctor;
// 此類別有一個使用者定義的建構子
public class Person {
	String name;
	String address;
	String userId;
	public Person(String n, String a, String u) {
		name = n;
		address = a;
		userId = u;
	}
	public void displayInfo(){
		System.out.println("姓名：" + name);
		System.out.println("地址：" + address);
		System.out.println("代號：" + userId);
	}
	public void Person() {
        // 這不是建構子，這是方法
    }
}
