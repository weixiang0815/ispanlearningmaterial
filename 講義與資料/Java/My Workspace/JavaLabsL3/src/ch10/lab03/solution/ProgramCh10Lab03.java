package ch10.lab03.solution;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import ch10.IOUtility;
/*
 * 編寫ProgramCh10Lab03.java，在main()之內，將字串  
 * "Hello, World, 大家好"、整數物件 new Integer(54321)
 * 與浮點數物件 new Double(17.625)寫入輸出檔 D:\Object.dat。
 */
public class ProgramCh10Lab03 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream  oos = null;
		try {
		   fos = new FileOutputStream("D:\\Object.dat");
		   oos = new ObjectOutputStream(fos);
		   oos.writeObject("Hello, World, 大家好");
		   oos.writeObject(null);
		   oos.writeObject(Integer.valueOf(54321));
		   oos.writeObject(Double.valueOf(17.625));
		   System.out.println("資料處理完畢(Ch10Lab05).");		   
		} catch(IOException e) {
			System.err.println("IO 發生問題, 訊息為=" + e.getMessage());
		} finally {
			IOUtility.closeStream(oos);
			IOUtility.closeStream(fos);
		}
	}
}
