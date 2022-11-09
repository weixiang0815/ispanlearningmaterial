package ch10._03;

// 本程式展示如何讀寫物件資料
// 本程式會將一個整數、一個浮點數、兩個null、一個字串物件、一個整數物件、
// 與兩個OrdinaryPeople型別的物件寫出檔案中。
// 本程式用到三個類別OrdinaryPeople/Custom/Human
// 這三個類別都必須實作java.io.Serializable,才能將這兩個類別的物件寫出
// 步驟一、將兩個OrdinaryPeople型別的物件(op1, op2)寫入到檔案OOSA.TXT中, 
// 步驟二、再由檔案OOSA.TXT讀出這兩個物件。
// 使用類別：ObjectInputStream/ObjectOutputStream/FileInputStream/FileOutputStream 

import java.io.*;
import ch10.util.IOUtility;

public class ReadWriteObjectsDemo {
	public static void main(String[] args) {   // 
		OrdinaryPeople op1, op2=null;

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			// 步驟一
			fos = new FileOutputStream("OOSA.TXT");
			oos = new ObjectOutputStream(fos);
			// 寫出整數
			oos.writeInt(10000);
			// 寫出浮點數			
			oos.writeFloat(17.625F);
			// 將null寫出到stream內			
			oos.writeObject(null);
			// 產生一個 OrdinaryPeople 物件
			Custom c = new Custom("Chinese", "rice");
			op1 = new OrdinaryPeople(c, 35, "John", "Chinese");
			// 將物件op1寫出到stream內
			oos.writeObject(op1);
			// 將String物件寫出到stream內			
			oos.writeObject("HelloKitty");			
			// 將Integer物件寫出到stream內			
			oos.writeObject(new Integer(123456));			
			// 產生另一個 OrdinaryPeople 物件
			// 將null寫出到stream內			
			oos.writeObject(null);
			c = new Custom("Brazil", "Bread");
			op1 = new OrdinaryPeople(c, 35, "Mary", "Latin");
			// 將物件op2寫出到stream內
			oos.writeObject(op1);
		} catch (IOException e) {
			System.out.println("發生IOException:" + e);
			e.printStackTrace();
			return;
		} finally {
			IOUtility.closeStream(oos);
			IOUtility.closeStream(fos);
		}
		// 步驟二
		try {
			fis = new FileInputStream("OOSA.TXT");
			ois = new ObjectInputStream(fis);
			// 讀取整數
			int   n = ois.readInt();
			// 讀取浮點數			
			float f = ois.readFloat();
			System.out.println("讀到整數    =" + n);
			System.out.println("讀到浮點數=" + f);
			Object o = null;
			while (true) {
				try {
					// 所讀的物件應 型別轉換(Cast)為 OrdinaryPeople
					o = ois.readObject();
					if (o instanceof OrdinaryPeople) {
					   op2 = (OrdinaryPeople) (o);
					} else if (o instanceof String) {
					   String s = (String)o;
					   System.out.println("讀到字串物件:" + s);
					   continue;
					} else if (o instanceof Integer) {
					   Integer i = (Integer)o;
					   System.out.println("讀到整數物件:" + i);
					   continue;
					}
				}  catch (ClassNotFoundException e) {
					System.out.println("找不到類別:" + e);
					break;
				} catch (EOFException e) {
					// 如果輸入串流沒有可讀取的物件，程式會丟出 EOFException
					System.out.println("資料已經全部讀取完畢");
					break; // 跳離迴圈
				}
				if (o == null) {
					System.out.println("讀到的物件是null");
				} else {
			    System.out.println("讀到OrdinaryPeople物件:");
				System.out.println("Name     =" + op2.name);
				System.out.println("Age      =" + op2.age);
				System.out.println("Ethnic   =" + op2.ethnic);
				System.out.println("Language =" + op2.custom.language);
				System.out.println("Food     =" + op2.custom.majorFood);
				}
				System.out.println();
			}
		} catch (IOException e) {
			System.out.println("Error: IOException, " + e);
			e.printStackTrace();
		} finally {
			IOUtility.closeStream(ois);
			IOUtility.closeStream(fis);
		}
	}
}
