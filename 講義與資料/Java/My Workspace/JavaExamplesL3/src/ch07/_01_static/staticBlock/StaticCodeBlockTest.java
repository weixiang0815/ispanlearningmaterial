package ch07._01_static.staticBlock;

//說明螢幕上會出現些訊息。
class StaticDemo {
	static {
		System.out.println("SD-01");
	}
}

public class StaticCodeBlockTest {
	static {
		System.out.println("SCB-A");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		StaticDemo sd = new StaticDemo();
		System.out.println("SCB-C");
	}

	static {
		System.out.println("SCB-B");
	}
}
