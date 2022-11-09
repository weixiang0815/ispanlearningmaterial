package ch10._14;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
 
public class ClientMain {

	public static void main(String[] args) {
		P2PClient client = null;
		try {
			client = new P2PClient("127.0.0.1", 12345, new File("D:\\data"));
			System.out.println("Client: 已經與Server連線...");
			System.out.println("-----------------------------------------------");
			//接收一個位元組的資料
		    int o = client.receiveByte();
			System.out.println("Client: 已經讀取Server送來的ㄧ個位元組, n=" + (byte)o);
			System.out.println("-----------------------------------------------");
			//接收多個位元組的資料
			Collection<Byte> collb = client.receiveMultiBytes();
			for(Byte b: collb){
				byte by = b;
			    System.out.println("Client: 讀到的位元組 =" + by);
			}

			System.out.println("-----------------------------------------------");
			//接收一個整數的資料
		    int i1 = client.receiveInteger();
			System.out.println("Client: 讀到的整數=" + i1);
			System.out.println("-----------------------------------------------");
			//接收多個整數的資料
			Collection<Integer> colli = client.receiveMultiIntegers();
			for(int i: colli){
			    System.out.println("Client: 讀到的整數 =" + i);
			}
//			//接收一個字串
		    String msg = client.receiveUTF();
			System.out.println("Client: 讀到的字串=" + msg);
			System.out.println("-----------------------------------------------");
//			//接收多個字串
			Collection<String> colls = client.receiveMultiUTFs();
			for(String str: colls){
			    System.out.println("Client: 讀到的字串 =" + str);
			}
			System.out.println("-----------------------------------------------");
			//接收多個物件
			Collection<Object> collo = client.receiveMultiObjects();
			for(Object obj: collo){
			    System.out.println("Client: 讀到的物件 =" + obj);
			}
			System.out.println("-----------------------------------------------");
//			// 接收一個檔案
//			client.receiveFile("rt.jar");
//			System.out.println("Client: 接收到檔案");
//			System.out.println("-----------------------------------------------");
			// 接收一個檔案(續傳)
			client.receiveFileResume("rt.zip");
			System.out.println("Client: 接收到檔案(續傳)");
			System.out.println("-----------------------------------------------");
	
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (client != null) {
				//client.stop();
			}
		}

	}

}
