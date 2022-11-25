package tw.pers.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class TestReader {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\Users\\Student\\Desktop\\hi.txt");
		BufferedReader br = new BufferedReader(fr);

		String tempString;
		String fullString = "";
		while ((tempString = br.readLine()) != null) {

			fullString += tempString + " ";
		}

		br.close();
		fr.close();
		System.out.println(fullString);

		new Scanner(System.in).next();

		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Student\\Desktop\\B.txt"));

		String[] sArray = fullString.split(" ");

		for (String sItem : sArray) {
			bw.write(sItem);
			bw.newLine();
		}

		bw.close();
	}

}
