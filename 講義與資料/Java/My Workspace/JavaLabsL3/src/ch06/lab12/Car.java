package ch06.lab12;

public class Car {
	int speed;
	double hour;
	
	public Car(int s, double h) {
		this.speed = s;
		this.hour = h;
	}
	
	public Car(double h) {
		this.hour = h;
		this.speed = 60;
	}
	
	public void getComment() {
		System.out.println("此車走了" + speed * hour + "公里");
	}
}
