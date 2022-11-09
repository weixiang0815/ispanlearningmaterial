package misc;

public class JdkProperties {
	public static void main(String[] args) {
		System.out.println("JDK位置 ? " + System.getProperty("java.home"));
		System.out.println("幾位元版? " + System.getProperty("sun.arch.data.model"));
	}
}
