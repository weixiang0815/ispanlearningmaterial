package ch06._05_encapsulation.v1;

public class EncapsulationDemoV1 {
	public static void main(String args[]) {
		Plane p1 = new Plane(10000);
		// p1.cargoLoad = p1.cargoLoad + 5000;  // NG
		p1.addCargo(5000);
		p1.showCurrentLoad();
		p1.addCargo(4000);
		p1.showCurrentLoad();
		p1.addCargo(3000);
		p1.showCurrentLoad();
		p1.addCargo(2000);
		p1.showCurrentLoad();
	}
}
