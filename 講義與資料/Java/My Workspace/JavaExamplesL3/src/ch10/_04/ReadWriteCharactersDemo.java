package ch10._04;

// 本程式自輸入檔Source.txt逐字元讀入, 然後再將這些文字資料寫出到輸出檔Target.txt 
// 分為兩種讀入/寫出方式：
// 一、每次讀、寫一個字元
// 二、每次讀、寫一個字元陣列
// 可利用 long s = System.currentTimeMillis() ; 
//          long e = System.currentTimeMillis() ; 
// 兩敘述來觀察兩種執行方式讀寫資料所花費的的時間 
// 使用類別：FileReader/FileWriter
import java.io.*;

import ch10.util.IOUtility;

public class ReadWriteCharactersDemo {
	public static void main(String args[]) throws IOException {
		FileReader fr = null;
		FileWriter fw = null;
		long s = 0, e = 0;
		// 每次讀/寫一個字元
		try {
			fr = new FileReader("Source.txt");
			fw = new FileWriter("Target.txt");
			int ch;
			s = System.currentTimeMillis();
			System.out.println("開始時間=" + s);
			while ((ch = fr.read()) != -1) {
				fw.write(ch);
			}
			e = System.currentTimeMillis();
			System.out.println("結束時間=" + e);
			System.out.println("時間差(每次讀/寫一個字元)=" + (e - s));
		} finally {
			IOUtility.closeStream(fw);
			IOUtility.closeStream(fr);
		}
		// 每次讀/寫多個字元(8192個字元)
		try {
			fr = new FileReader("Source.txt");
			fw = new FileWriter("Target.txt");
			s = System.currentTimeMillis();
			// 以下五行必須記憶
			int count = 0;
			char[] ca = new char[8192];
			while ((count = fr.read(ca)) != -1) {
				fw.write(ca, 0, count);
			}
			e = System.currentTimeMillis();
			System.out.println("時間差(每次讀/寫多個字元)=" + (e - s));
		} finally {
			IOUtility.closeStream(fw);
			IOUtility.closeStream(fr);
		}
	}
}
