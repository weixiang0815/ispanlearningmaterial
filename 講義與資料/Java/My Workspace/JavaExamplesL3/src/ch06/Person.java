package ch06;

public class Person {
	String name;
	String address;
	String userId;
	public Person(String name, String address, String userId) {
		this.name = name;
		this.address = address;
		this.userId = userId;
	}
	public void displayInfo(){
		System.out.println("姓名：" + name);
		System.out.println("地址：" + address);
		System.out.println("代號：" + userId);
	}
}
