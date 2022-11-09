package ch10._01;

// 本程式展示如何讀寫位元組資料
// 方法 1. 由輸入檔一次讀入一個位元組，然後將讀入的位元組寫出到輸出檔
// 方法 2. 由輸入檔一次讀入一個位元組陣列，然後此將位元組陣列寫出到輸出檔
// 輸入檔的檔名由命令列參數提供。
// 可利用 long s = System.currentTimeMillis() ; 
//          long e = System.currentTimeMillis() ; 
// 兩敘述來觀察兩種執行方式讀寫資料所花費的的時間
// 使用類別：FileInputStream/FileOutputStream/BufferedInputStream
//              BufferedOutputStream
import java.io.*;
import ch10.util.IOUtility;

public class ReadWriteBufferedBytesDemoTWR {
	public static void main(String[] args) {
		long s = 0, e = 0;
		// 方法 1:一次讀/寫一個位元組的資料，有緩衝區，將提升執行效能
		File inFile = new File("SamplePictures.zip");
		try (FileInputStream fis = new FileInputStream(inFile);
			 BufferedInputStream bis = new BufferedInputStream(fis);
			 FileOutputStream fos = new FileOutputStream("SamplePicturesA.zip");
			 BufferedOutputStream bos = new BufferedOutputStream(fos); 
			)
		{
			int data = 0;
			System.out.println("開始讀與SamplePcitures.zip, 位元組數:"
					+ inFile.length());
			System.out.println("方法一:每次讀/寫一個位元組(有緩衝區)");
			s = System.currentTimeMillis();
			while ((data = bis.read()) != -1) {
				bos.write(data);
			}
		} catch(IOException ex){
			System.out.println("發生異常: " + ex.getMessage());
		}
		e = System.currentTimeMillis();
		System.out.println("時間差(每次讀/寫一個位元組)=" + (e - s));
		System.out.println("====================================");
		// 方法 2
		try(
			FileInputStream fis = new FileInputStream(inFile);
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("SamplePicturesB.zip");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
		) {
			System.out.println("方法二:每次讀/寫1024個位元組(有緩衝區)");
			s = System.currentTimeMillis();
			// 以下五行必須記憶
			int count = 0;
			byte[] ba = new byte[1024];
			while ((count = bis.read(ba)) != -1) {
				bos.write(ba, 0, count);
			}
			e = System.currentTimeMillis();
			System.out.println("時間差(每次讀/寫多個位元組)=" + (e - s));
		} catch(IOException ex){
			System.out.println("發生異常: " + ex.getMessage());
		}
	}
}
