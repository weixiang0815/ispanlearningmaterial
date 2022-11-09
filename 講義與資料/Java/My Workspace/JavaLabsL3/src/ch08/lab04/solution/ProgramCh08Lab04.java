package ch08.lab04.solution;

// 取消第10行的注解並編譯下面程式時，第10列會產生錯誤，請加入適當的 try-catch 區塊本程式能夠編譯, 並能夠執行
import java.io.*;
import java.net.*;

public class ProgramCh08Lab04 {
	public static void main(String[] args) {
		try {
			methodA();
		} catch (IOException e) {
			System.out.println("發生錯誤:" + e.getMessage());
		}

		System.out.println("Program ends");
	}

	@SuppressWarnings("unused")
	static void methodA() throws IOException {
		int no = 0;
		if (no != 0) {
			int i = 3 / no;
		}
		URL urlA = new URL("http://www.seed.net.tw");
		FileInputStream fis = new FileInputStream("c:\\Test.txt");
		fis.close();
	}
}
