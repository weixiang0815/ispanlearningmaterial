package ch10.lab04.solution;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import ch10.IOUtility;

/* 
 * 編寫ProgramCh10Lab04.java，在main()之內讀取由前一個Lab所寫入
 * 到Object.dat的三個物件，然後顯示在螢幕上。
 */
public class ProgramCh10Lab04 {
	public static void main(String[] args) {
		FileInputStream fos = null;
		ObjectInputStream oos = null;
		try {
			fos = new FileInputStream("D:\\Object.dat");
			oos = new ObjectInputStream(fos);
			while (true) {
				try {
					Object o = oos.readObject();
					if (o instanceof String) {
						String s = (String) o;
						System.out.println("String=" + s);
					} else if (o instanceof Integer) {
						Integer i = (Integer) o;
						System.out.println("Integer=" + i);
					} else if (o instanceof Double) {
						Double d = (Double) o;
						System.out.println("Double =" + d);
					} else {
						System.out.println("Object=" + o);
					}
				} catch (EOFException e) {
					System.out.println("檔案讀取完畢...");
					break;
				} catch (ClassNotFoundException e) {
					System.err.println("型別轉換時發生問題, 訊息為=" + e.getMessage());
				}
			}

		} catch (IOException e) {
			System.err.println("IO 發生問題, 訊息為=" + e.getMessage());
		} finally {
			IOUtility.closeStream(oos);
			IOUtility.closeStream(fos);
		}
	}
}
