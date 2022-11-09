package ch10._11;
import java.io.*;
import java.util.*;
public class SetDedup {
	public static void main(String[] args) throws IOException {
        // LinkedHashSet:能保持元素加入的順序
		Set<String> s = new LinkedHashSet<String>();  
		//Set<String> s = new LinkedHashSet<String>();
		BufferedReader  br = new BufferedReader(new FileReader(("Data.txt")));
		PrintWriter  out = new PrintWriter(new FileWriter(("Dedup.txt")));
		String line = null;
		while ((line = br.readLine()) != null) {
			s.add(line);
		}  
		br.close();
        for (String str: s) {
        	out.println(str);
        }
        out.close();
	}
}
