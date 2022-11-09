package ch10._14;

import java.io.File;
import java.io.IOException;

public class ServerMain {

	public static void main(String[] args) {
		P2PServer server = null;
		try {
			server = new P2PServer(12345, new File("c:\\data"));
			System.out.println("-----------------------------------------------");
			// 傳送一個位元組的資料
			server.sendByte(100);
			System.out.println("-----------------------------------------------");
			// 傳送多個位元組的資料
			byte[] b = { (byte) 100, (byte) -128, (byte) 127, (byte) -1 };
			server.sendMultiBytes(b);

			System.out.println("-----------------------------------------------");
			// 傳送一個整數
			server.sendInteger(-10000);
			System.out.println("-----------------------------------------------");
			// 傳送多個整數
			server.sendMultiIntegers(12000, 1984, -100, 7890, 55, 89);
			System.out.println("-----------------------------------------------");
			// 傳送一個字串
			server.sendUTF("Hello, World, 大家好");
			System.out.println("-----------------------------------------------");
			// 傳送多個字串
			server.sendMultiUTFs("HelloKitty", "HelloSnoopy", "HelloMicky");
			System.out.println("-----------------------------------------------");
			// 傳送多個物件
			server.sendMultiObjects("HelloPinky", null, new Double(3.14), new Long(9876543210L));
			System.out.println("-----------------------------------------------");
//			// 傳送一個檔案
//			server.sendFile("rt.jar");			
			// 傳送一個檔案，續傳
			System.out.println("-----------------------------------------------");
			server.sendFileResume();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (server != null) {
				server.stop();
			}
		}

	}
}
