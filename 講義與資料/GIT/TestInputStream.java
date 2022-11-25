package tw.pers.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestInputStream {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\Student\\Desktop\\doge.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
	
		byte[] bytes = bis.readAllBytes();

		bis.close();
		fis.close();

		FileOutputStream fos = new FileOutputStream("C:\\temp\\A.jpg");

		fos.write(bytes);

		fos.close();
	}

}
