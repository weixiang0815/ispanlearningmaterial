package ch06.lab12.solution;

public class Car {
	int speed;
	double hour;
	public Car(int s, double h){
		speed = s; 
		hour = h;
	}
	public Car(double h){
		hour = h;
		speed = 60; 
	}
	public void getComment() {
		System.out.println("此車走了" + speed * hour + "公里");
	}
}
