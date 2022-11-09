package ch08.lab05;

// 下面的程式編譯時會產生錯誤，請修正適當的敘述使其能夠完成編譯, 並且執行。
import java.net.MalformedURLException;
import java.net.URL;

public class ProgramCh08Lab05 {
	public static void main(String[] args) {

	}
}

class SuperClass {
	@SuppressWarnings("unused")
	public void m1() throws MalformedURLException {
		URL seednet = new URL("http://www.seed.net.tw");
		// ...
	}
}

class Subclass extends SuperClass {
	// 取消下面的注解
	/*
	public void m1() throws IOException {
		URL seednet = new URL("http://www.seed.net.tw");
		FileInputStream fis = new FileInputStream("c:\\Test.txt");
		// ...
	}
	*/
}
