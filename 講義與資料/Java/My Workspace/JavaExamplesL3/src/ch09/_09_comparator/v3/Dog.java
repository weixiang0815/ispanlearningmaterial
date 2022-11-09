package ch09._09_comparator.v3;

public class Dog implements Weight, Price {
	private double dogWeight;
	private int dogPrice;
	
	public Dog(double dogWeight, int dogPrice) {
		this.dogWeight = dogWeight;
		this.dogPrice = dogPrice;
	}
	public int getPrice() {
		return dogPrice ;
	}
	public double getWeight() {
		return dogWeight ;
	}
	public String toString() {
        return " Dog, 價格:" + dogPrice + "  重量:" + dogWeight;
    }
}
