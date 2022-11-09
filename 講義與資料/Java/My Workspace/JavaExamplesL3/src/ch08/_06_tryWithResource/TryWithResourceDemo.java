package ch08._06_tryWithResource;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResourceDemo {
	static private String filename = "Readme.txt";  
	public static void main(String[] args) {
		tryWithResource();
		System.out.println("------------------");
		oldStyle();
	}

	public static void tryWithResource() {
		try (FileInputStream fis = new FileInputStream(filename);
			InputStreamReader isr = new InputStreamReader(fis, "BIG5");
			BufferedReader br = new BufferedReader(isr); ) 
		{
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println("line=" + line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void oldStyle() {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null; 
		try {
			fis = new FileInputStream(filename);
			isr = new InputStreamReader(fis, "BIG5");
			br = new BufferedReader(isr);
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println("line=" + line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//int n = 10 / 0;
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					;
				}
			}
			if (isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					;
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					;
				}
			}
		}
	}
}
