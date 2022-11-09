package ch10._03;

// 本程式展示如何讀寫物件資料
// 本程式會將兩個OrdinaryPeople型別的物件寫出檔案中，
// 本程式用到三個類別OrdinaryPeople/Custom/Human
// 這三個類別都必須實作java.io.Serializable,才能將這兩個類別的物件寫出
// 步驟一、將兩個OrdinaryPeople型別的物件(op1, op2)寫入到檔案OOSA.TXT中, 
// 步驟二、再由檔案OOSA.TXT讀出這兩個物件。
// 使用類別：ObjectInputStream/ObjectOutputStream/FileInputStream/FileOutputStream 

import java.io.*;

public class ReadWriteObjectsDemo2 {
	public static void main(String[] args) {   // 
		OrdinaryPeople op1, op2;

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			// 步驟一
			fos = new FileOutputStream("OOSA.TXT");
			oos = new ObjectOutputStream(fos);
			for(int n=0; n < 3;n++){
				oos.writeInt(10000+n);	
			}
			
		} catch (IOException e) {
			System.out.println("發生IOException:" + e);
			e.printStackTrace();
			return;
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		// 
//		// 步驟二
		try {
			fis = new FileInputStream("OOSA.TXT");
			ois = new ObjectInputStream(fis);
			while (true) {
				try {
					// 所讀的物件應 Cast 為 OrdinaryPeople
					int n  =  (ois.readInt());
					System.out.println("n     =" + n);
				} catch (EOFException e) {
					// 如果輸入串流沒有可讀取的物件，程式會丟出 EOFException
					System.out.println("End of file reached");
					break; // 跳離迴圈
				}
				System.out.println();
			}
		} catch (IOException e) {
			System.out.println("Error: IOException, " + e);
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}			
		}
	}
}
