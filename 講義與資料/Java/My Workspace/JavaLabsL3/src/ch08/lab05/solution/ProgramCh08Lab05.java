package ch08.lab05.solution;

// 下面的程式編譯時會產生錯誤，請修正適當的敘述使其能夠完成編譯, 並且執行。
import java.net.*;
import java.io.*;

public class ProgramCh08Lab05 {
	public static void main(String[] args) {

	}
}

class SuperClass {
	@SuppressWarnings("unused")
	public void m1() throws IOException {
		URL seednet = new URL("http://www.seed.net.tw");
		// ...
	}
}

class Subclass extends SuperClass {
	@SuppressWarnings("unused")
	public void m1() throws IOException {
		URL seednet = new URL("http://www.seed.net.tw");
		FileInputStream fis = new FileInputStream("c:\\Test.txt");
		// ...
		fis.close();
	}
}
