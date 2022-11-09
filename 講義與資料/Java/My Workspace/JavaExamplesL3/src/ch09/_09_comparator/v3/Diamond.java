package ch09._09_comparator.v3;


public class Diamond implements Price, Weight {
	private double weight;
	private int price;
	public Diamond(double weight, int price) {
		this.weight = weight;
		this.price = price;
	}
	public int getPrice() {
		return price ;
	}
	public double getWeight() {
		return weight ;
	}
	public String toString() {
		return "Diamond, 價格:" + price + "  重量:" + weight;
	}	
}
