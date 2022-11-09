package ch10.lab02.solution;
/*
	編寫ProgramCh10Lab02.java，在main()方法內讀取專案
	下的Source.gif檔案內的資料，然後再將這些資料寫出到輸出檔
	C:\data資料夾之下，新檔名為MyData.gif。

 	這個練習與lab01雷同，不過要加上BufferedInputStream
 	與BufferedOutputStream兩個類別。

*/
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProgramCh10Lab02TWR {
	public static void main(String[] args) {
		
		File dir = new File("C:\\data");
		if (!dir.exists()){
			dir.mkdirs();
		}
		File target = new File(dir, "MyData.gif");
		try(
			FileInputStream fis = new FileInputStream("Source.gif");
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream(target);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
		) {
			int len;
			byte[] b = new byte[512];
			while ((len = bis.read(b)) != -1) {
				bos.write(b, 0, len);
			}
			System.out.println("資料處理完畢(Ch10Lab02).");
		} catch (IOException e) {
			System.out.println("進行IO時，發生錯誤, 相關訊息為:" + e.getMessage());
		} 
	}
}
