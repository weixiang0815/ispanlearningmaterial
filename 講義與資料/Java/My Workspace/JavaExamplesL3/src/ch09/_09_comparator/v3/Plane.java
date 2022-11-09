package ch09._09_comparator.v3;

public class Plane implements Weight, Price {
	private double w;
	private int p;
	public Plane(double w, int p) {
		this.w = w;
		this.p = p;
	}
	public double getWeight() {
		return w;
	}
	public int getPrice() {
		return p;
	}
    public String toString() {
        return " Plane, 價格:" + p + "  重量:" + w;
    }
}
