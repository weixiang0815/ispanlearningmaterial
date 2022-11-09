package ch06._05_encapsulation.v0;

public class EncapsulationDemoV0 {
	public static void main(String args[]) {
		Plane p0 = new Plane(10000);
		p0.cargoLoad = p0.cargoLoad + 5000;
		p0.showCurrentLoad();
		p0.cargoLoad = p0.cargoLoad + 4000;
		p0.showCurrentLoad();
		p0.cargoLoad = p0.cargoLoad + 3000;
		p0.showCurrentLoad();
		p0.cargoLoad = p0.cargoLoad + 2000;
		p0.showCurrentLoad();
	}
}
