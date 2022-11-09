package ch10.lab05.solution;
/*
 * 編寫ProgramCh10Lab05.java，在main()之內，能由輸入檔
 * Source.txt以字元為導向讀入資料，然後再將這些資料寫出到
 * 輸出檔D:\MyData.txt。
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import ch10.IOUtility;

public class ProgramCh10Lab05 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("Source.txt");
			fw = new FileWriter("D:\\MyData.txt");
			char[] ca = new char[512];
			int len = 0;
			while ((len = fr.read(ca)) != -1) {
				fw.write(ca, 0, len);
			}
			System.out.println("資料處理完畢(Ch10Lab07).");
		} catch (IOException e) {
			System.out.println("IO錯誤:" + e.getMessage());
		} finally {
			IOUtility.closeStream(fr);
			IOUtility.closeStream(fw);
		}
	}
}
