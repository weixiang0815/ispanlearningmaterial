package ch06.lab02.solution;

public class Piggy {
	public double sellableWeight = 80.0; 
	public double weight; 

	public void eat(int foodWeight) {
		double ratio = 0.75;
		weight = weight + foodWeight * ratio;
	}

	public void exercise(int hours) {
		weight = weight - hours * 0.1;
	}

	double getWeight() {
		return weight;
	}
}
