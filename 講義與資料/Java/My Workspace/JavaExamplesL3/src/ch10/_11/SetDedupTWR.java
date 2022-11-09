package ch10._11;

import java.io.*;
import java.util.*;

public class SetDedupTWR {
	public static void main(String[] args) {
		// LinkedHashSet:能保持元素加入的順序
		Set<String> s = new LinkedHashSet<String>();
		// Set<String> s = new LinkedHashSet<String>();
		try (
			BufferedReader br = new BufferedReader(
				new FileReader(("Data.txt")));
			PrintWriter out = new PrintWriter(new FileWriter(("Dedup.txt")));) {
			String line = null;
			while ((line = br.readLine()) != null) {
				s.add(line);
			}

			for (String str : s) {
				out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
