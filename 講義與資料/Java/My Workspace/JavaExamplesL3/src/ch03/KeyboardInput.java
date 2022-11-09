package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput {
	public static void main(String[] args) {
		// 建立一個InputStreamReader型別的物件isr
		InputStreamReader isr = new InputStreamReader(System.in);
		// 建立一個BufferedReader型別的物件br，此br物件會與isr物件合作來
		// 讀取一行資料
		BufferedReader in = new BufferedReader(isr);
		String s = null;
		try {
			s = in.readLine(); 
			System.out.println("讀入的資料為:" + s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
