package appendix.ch09.map;

public class JavaSystemProperties {
	public static void main(String[] args) {
		System.out.println("JDK位置: " + System.getProperty("java.home"));
		System.out.println("使用者家目錄: " + System.getProperty("user.home"));
		System.out.println("幾位元版: " + System.getProperty("sun.arch.data.model"));
		System.out.println("JDK版本: " + System.getProperty("java.version"));
		System.out.println("---------------------------------------");
	}
}
