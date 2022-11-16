package ch10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class GetFilesFromInternet {

	File folder;

	public GetFilesFromInternet(File folder) {
		this.folder = folder;
		if (!this.folder.exists()) {
			this.folder.mkdir();
		}
	}
	
	public GetFilesFromInternet(String directory) {
		this.folder = new File(directory);
		if (!this.folder.exists()) {
			this.folder.mkdir();
		}
	}
	
	public void getConsecutiveFiles(String prefix, String suffix, int begin, int end ) {
		for(int i = begin; i <= end; i++) {
			String surl = prefix + i + 	suffix;
			getFile(surl);		
		}
	}
	
	public void getFile(String surl) {
		// http://tw.yahoo.com
		// http://www.space-fox.com/wallpapers/celebs/penelope-cruz/penelope_cruz_1.jpg
		String filename = surl.substring(surl.lastIndexOf("/") + 1);
		File outFile = new File(folder, filename);
		try {
			URL url = new URL(surl);
			try (
				InputStream is = url.openStream();
				OutputStream os = new FileOutputStream(outFile);
			)
			{
				byte[] b = new byte[1024];
				int len = 0;
				while ( (  len = is.read(b)  ) != -1) {
					os.write(b, 0, len);
				}
				System.out.println(filename + "讀取完畢...");
			} catch(Exception e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
	}
}
