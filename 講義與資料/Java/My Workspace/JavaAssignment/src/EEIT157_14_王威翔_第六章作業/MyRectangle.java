package EEIT157_14_王威翔_第六章作業;

public class MyRectangle {
	double width, depth;
	
	public void setWidth(double w) {
		this.width = w;
	}
	
	public void setDepth(double d) {
		this.depth = d;
	}
	
	public double getArea(){
		return this.width * this.depth;
	}
	
	public MyRectangle() {
	}
	
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
}
