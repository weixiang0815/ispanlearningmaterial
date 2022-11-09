package ch06.lab02.solution;

public class Cat { 
	double weight;
	int iq;
	public void eat(int foodWeight) { 
		weight += foodWeight * 0.2;
	}
	public void study(int hours) {
		iq = iq + hours;
	}
	public void displayInformation() {
		System.out.println("Cat的IQ=" + iq);
		System.out.println("Cat的體重:" + weight);
	}
}
