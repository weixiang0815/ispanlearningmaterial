package ch08.lab02.solution;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
// 編譯程式ProgramCh08Lab02時, 會產生錯誤訊息, 請加入適當的 try-catch 區塊使其能夠完成編譯, 並且能夠執行
// 當編譯本程式時，會產生 MalformedURLException, FileNotFoundException, IOException等Checked
// Exception
import java.net.URL;

public class ProgramCh08Lab02 {
	public static void main(String[] args) {
		InputStream is = null;
		FileOutputStream fos = null; 
		try {
			URL seednet = new URL("http://www.seed.net.tw");
			is = seednet.openStream();
			fos =  new FileOutputStream("seednet.html");
			byte[] buf = new byte[512];
			int i = 0;
			while ((i = is.read(buf)) != -1) {
				fos.write(buf, 0, i);
			}
			System.out.println("程式結束");
		} catch (IOException e) {
			System.out.println("IO錯誤:" + e.getMessage());
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		} 
	}
}
