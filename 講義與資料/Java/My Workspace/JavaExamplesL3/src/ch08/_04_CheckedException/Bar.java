package ch08._04_CheckedException;

// 本類別將動態的建立某個類別的物件，編寫本程式時並不知道
// 要建構之物件的類別名稱，因此無法用類似 
// Object o = new Object(); 的敘述來建構物件。
// Java語言的Class類別可用來解決這個問題。
// 要建立之物件的類別名稱將在執行時由檔案讀入。
// 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bar {
	public void divide() {
		System.out.println("Bar類別的divide()方法開始");
		Mammal m = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("c:\\JavaShared\\className.txt");
			// 上面敘述內的建構子會丟出 FileNotFoundExcepxion,
			// 此例外為 IOException 的子類別
			br = new BufferedReader(fr);
			String classname = br.readLine();
			Class c = Class.forName(classname);
			Object obj = c.newInstance();
			if (obj instanceof Mammal) {
				m = (Mammal) obj;
				m.smile();
			}
			// Mammal m = new Mammal(); // 本敘述與上面六列敘述無法比擬 
		} catch (IOException e) {
			System.out.println("發生例外：" + e.getClass().getName());
		} catch (ClassNotFoundException e) {
			System.out.println("發生例外：" + e.getClass().getName());
		} catch (InstantiationException e) {
			System.out.println("發生例外：" + e.getClass().getName());
		} catch (IllegalAccessException e) {
			System.out.println("發生例外：" + e.getClass().getName());
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
				if (br != null) {
					br.close();
				}
				// 上面兩個close()會丟出IOException
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Bar類別的divide()方法結束");
	}
}
