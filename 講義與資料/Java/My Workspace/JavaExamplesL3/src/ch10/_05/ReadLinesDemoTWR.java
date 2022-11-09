package ch10._05;
//  由檔案(readme.txt)讀入多行資料，當 readLine()傳回 null時, 表示資料已經讀取完畢。
//  使用類別：BufferedReader/FileReader/PrintWriter/FileWriter
import java.io.*;
public class ReadLinesDemoTWR {
	public static void main(String[] args) throws IOException {
		String s = null;
		// 由檔案讀入資料
		try(BufferedReader br = new BufferedReader(new FileReader("readme.txt"));
			PrintWriter    pw = new PrintWriter(new FileWriter("readme.bak"));	
		) 
		{
			while ((s = br.readLine()) != null) {
				pw.println(s);
			}
			System.out.println("資料全部寫出到readme.bak");
		} catch(IOException e){
			e.printStackTrace();
		}
	}
};
