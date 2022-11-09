package ch10._05;

import java.io.*;

import ch10.util.IOUtility;

public class KeyboardInputTWR {
	public static void main(String[] args) {
		String s = null;
		try(
			// 建立一個InputStreamReader型別的物件isr
			InputStreamReader isr = new InputStreamReader(System.in);
			// 建立一個BufferedReader型別的物件br，此br物件會與isr物件
			// 合作讀取一行資料
			BufferedReader in = new BufferedReader(isr);		
		) {
			s = in.readLine();
			System.out.println("讀入的資料為:" + s);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
