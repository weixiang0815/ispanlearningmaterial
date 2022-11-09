package ch11._01_create;

public class StarMain {
	public static void main(String[] args) {
		
		Star s1 = new Star(10, '#', "Kitty");
		s1.start();
		Star s2 = new Star(20, '&', "Micky");
		s2.start();
		System.out.println("程式結束");
	}
}
