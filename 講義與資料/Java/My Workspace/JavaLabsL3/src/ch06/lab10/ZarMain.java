package ch06.lab10;

public class ZarMain {
	public static void main(String args[]) {
		Zar zar = new Zar();
		System.out.println(zar.sum(5));

		for (int i = 1; i <= 10; i++) {
			System.out.println("1+到" + i + "的總和=" + zar.sum(i));
		}
	}
}
