package ch10._03;

// 本程式展示如何讀寫物件資料
// 本程式會將兩個OrdinaryPeople型別的物件寫出檔案中，
// 本程式用到三個類別OrdinaryPeople/Custom/Human
// 這三個類別都必須實作java.io.Serializable,才能將這兩個類別的物件寫出
// 步驟一、將兩個OrdinaryPeople型別的物件(op1, op2)寫入到檔案OOSA.TXT中, 
// 步驟二、再由檔案OOSA.TXT讀出這兩個物件。
// 使用類別：ObjectInputStream/ObjectOutputStream/FileInputStream/FileOutputStream 

import java.io.*;

public class ReadWriteObjectsDemo2TWR {
	public static void main(String[] args) {   // 
		OrdinaryPeople op1, op2;
		
		try(
			FileOutputStream fos = new FileOutputStream("OOSA.TXT");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		) {
			// 步驟一
			for(int n=0; n < 3;n++){
				oos.writeInt(10000+n);	
			}
			System.out.println("寫出三個整數: 10000, 10001, 10002");
		} catch (IOException e) {
			System.out.println("發生IOException:" + e);
			e.printStackTrace();
			return;
		} 
		// 步驟二
		try(
			FileInputStream fis = new FileInputStream("OOSA.TXT");
			ObjectInputStream ois = new ObjectInputStream(fis);	
		) {
			System.out.println("準備讀入三個整數:");
			while (true) {
				try {
					// 所讀的物件應 Cast為 OrdinaryPeople
					int n  =  (ois.readInt());
					System.out.println("n =" + n);
				} catch (EOFException e) {
					// 如果輸入串流沒有可讀取的物件，程式會丟出 EOFException
					System.out.println("讀到檔案最尾端");
					break; // 跳離迴圈
				}
			}
			System.out.println("讀入三個整數。");
		} catch (IOException e) {
			System.out.println("Error: IOException, " + e);
			e.printStackTrace();
		} 
	}
}
