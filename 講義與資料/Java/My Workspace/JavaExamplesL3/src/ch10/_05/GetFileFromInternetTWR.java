package ch10._05;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import ch10.util.IOUtility;
public class GetFileFromInternetTWR {
	public static void main(String args[]) throws IOException {
		
		String sURL = "http://tomcat.apache.org/images/tomcat.png";
		URL aURL = new URL(sURL);
		String fileName = sURL.substring(sURL.lastIndexOf("/") + 1);
		System.out.println("檔名:" + fileName);
		fileName ="d:\\" + fileName; 
		try(
			OutputStream fos = new FileOutputStream(fileName);
			InputStream is = aURL.openStream();			
		) {
			int total = 0, count = 0;
			int i = 0 ; 
			byte[] ba = new byte[8192];
			while ((count = is.read(ba)) != -1) {
				fos.write(ba, 0, count);
				total += count;
				i++;
				if (i % 1000== 0) {
				   System.out.println("total = "+ total) ;
				}
			}
			System.out.println("執行完畢");
		} 
	}
}
