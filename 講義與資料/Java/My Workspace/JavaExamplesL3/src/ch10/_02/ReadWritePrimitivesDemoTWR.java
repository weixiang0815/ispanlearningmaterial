package ch10._02;

// 步驟一、寫出一個浮點數(17.625f)與十個整數到輸出檔Target.dat,
// 步驟二、再由Target.dat(此時它作為輸入檔)讀入此浮點數與十個整數。                                  
// 使用類別：DataInputStream/DataOutputStream/
//          FileInputStream/FileOutputStream

import java.io.*;
import ch10.util.IOUtility;

public class ReadWritePrimitivesDemoTWR {
	public static void main(String args[]) {
		
		try(
			FileOutputStream fos = new FileOutputStream("Target.dat");
			DataOutputStream dos = new DataOutputStream(fos);
		) {
			// 步驟一
			System.out.println("步驟一: 將一個浮點數(17.625f)與十個整數寫出到Target.dat");
			dos.writeFloat(17.625f);
			for (int i = 0; i < 10; i++) {
				dos.writeInt(98765432 + i);
			}
			System.out.println("步驟一: 寫出成功\n");
		} catch (IOException e) {
			System.out.println("發生IOException..e=" + e);
			return;
		} 
		// 步驟二
		System.out.println("步驟二: 由Target.dat讀入資料");
		
		try (
			FileInputStream fis = new FileInputStream("Target.dat");
			DataInputStream dis = new DataInputStream(fis);
		){
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
		} 
	}
}
