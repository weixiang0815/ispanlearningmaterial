package ch10._05;
//  程式如果關閉PrintWriter物件，最後一批資料將不寫出。
import java.io.*;

public class ReadLinesErrorProneDemo {
	public static void main(String[] args)  {
		String s = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		// 由檔案讀入資料
		
		try {
			br = new BufferedReader(new FileReader("readme.txt"));
			pw = new PrintWriter(new FileWriter("readme.err"));
			while ((s = br.readLine()) != null) {
				pw.println(s);
			}
			System.out.println("資料全部寫出到readme.err");
			System.out.println("程式如果沒有關閉PrintWriter物件，最後一批資料將不寫出。");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			if (pw!=null) {
//				pw.close();
//			}
			if (br!=null) {
				try {
				  br.close();
				} catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
};
