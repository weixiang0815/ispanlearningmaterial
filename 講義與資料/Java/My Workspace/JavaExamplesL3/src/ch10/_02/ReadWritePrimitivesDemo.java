package ch10._02;

// 步驟一、寫出一個浮點數(17.625f)與十個整數到輸出檔Target.dat,
// 步驟二、再由Target.dat(此時它作為輸入檔)讀入此浮點數與十個整數。                                  
// 使用類別：DataInputStream/DataOutputStream/
//          FileInputStream/FileOutputStream

import java.io.*;
import ch10.util.IOUtility;

public class ReadWritePrimitivesDemo {
	public static void main(String args[]) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			// 步驟一
			System.out.println("步驟一: 將一個浮點數(17.625f)與十個整數寫出到Target.dat");
			fos = new FileOutputStream("Target.dat");
			dos = new DataOutputStream(fos);
			dos.writeFloat(17.625f);
			for (int i = 0; i < 10; i++) {
				dos.writeInt(98765432 + i);
			}
			System.out.println("步驟一: 寫出成功\n");
		} catch (IOException e) {
			System.out.println("發生IOException..e=" + e);
			return;
		} finally {
			IOUtility.closeStream(dos);
			IOUtility.closeStream(fos);
		}
		// 步驟二
		System.out.println("步驟二: 由Target.dat讀入資料");
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("Target.dat");
			dis = new DataInputStream(fis);
			float f;
			int i;
			f = dis.readFloat();
			System.out.println("浮點數 f=" + f);
			System.out.println("十個整數：");
			while (true) {
				try {
					i = dis.readInt();
					System.out.println("i=" + i);
				} catch (EOFException e) {
					// 此處應顯示相關訊息
					System.out.println("資料讀取完畢");
					break;
				}
			}
			System.out.println("步驟二: 讀入資料成功");
		} catch (IOException e) {
			System.out.println("發生IOException..e=" + e);
		} finally {
			IOUtility.closeStream(dis);
			IOUtility.closeStream(fis);
		}
	}
}
