package ch10._06;

import java.io.*;
//程式功能:
	// 1.說明如何使用IO類別的串接: IO類別的串接應透過建構子來完成。
	// 2.說明大量資料輸出/輸入時，使用BufferedOutputStream類別與
	// BufferedInputStream對執行效能的影響。
	//
	// 執行本程式後，應該去掉BufferedOutputStream/BufferedInputStream
	// 類別的物件，再執行一次，以便比較執行的時間差。
	// 使用類別：FileInputStream/FileOutputStream/BufferedInputStream
    //              BufferedOutputStream/DataInputStream/DataOutputStream
public class StreamConcatedDemoTWR {
	
	public static void main(String[] args)  {
		
		long start, end;
		try(
			FileOutputStream fos = new FileOutputStream("c:\\data.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
		) {
			start = System.currentTimeMillis();
			for (int n = 1; n <= 1000000; n++) {
				dos.writeInt(1234567 + n);
			}
			end = System.currentTimeMillis();
			System.out.println("寫出1000000筆資料所需時間:" + (end - start));
		} catch(IOException e){
			e.printStackTrace();
		}
		
		start = System.currentTimeMillis();
		
		try(
			FileInputStream fis = new FileInputStream("c:\\data.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);		
		) {
			while (true) {
				try {
					int i = dis.readInt();
				} catch (EOFException e) {
					System.out.println("資料讀取完畢");
					break;
				}
			}
			end = System.currentTimeMillis();
			System.out.println("讀取1000000筆資料所需時間:" + (end - start));
		}catch(IOException e){
			e.printStackTrace();
		} 
		
	}
}
