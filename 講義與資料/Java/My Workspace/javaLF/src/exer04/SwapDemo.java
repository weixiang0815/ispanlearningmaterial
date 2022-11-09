package exer04;

public class SwapDemo {

	public static void main(String[] args) {
		int x = 5, y = 10;
		System.out.println("對調前，x為" + x + "而y為" + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("對調後，x為" + x + "而y為" + y);

	}

}
