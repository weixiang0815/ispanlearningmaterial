package ch10._13;
import java.io.*;
import java.net.*;

class GetFileThread extends Thread {
	String urlString;
	GetFileThread(String urlString) {
		this.urlString = urlString;
	}
	public void run() {
		int count = 0 ;
		int total = 0 ;
		try {
			URL hp = new URL(urlString);
			URLConnection hpCon = hp.openConnection();
			int len = hpCon.getContentLength();
			if (len > 0) {
				InputStream in = hpCon.getInputStream();
				String filename = urlString.substring(urlString.lastIndexOf('/') + 1);
				//System.out.println(filename);
				byte[] ba = new byte[1024];
				FileOutputStream out = new FileOutputStream(filename);
				while (  (count = in.read(ba)) != -1)  {
					total += count;
    				System.out.println(filename + ", Bytes Left=>" + (len-total));
					out.write(ba, 0, count);
				}
				in.close();
				out.close();
			} else {
				System.out.println("No Content available");
			}
		} catch (IOException e) {
		}
	}
}

public class GetFileFromInternetMultiThread {

	public static void main(String[] args) {
		GetFileThread gp1 = new GetFileThread("http://i7.caedes.net/resize/827x551/egggray-1273973257.jpg");
		GetFileThread gp2 = new GetFileThread("http://i7.caedes.net/resize/811x539/biffobear-1273699023.jpg");
		GetFileThread gp3 = new GetFileThread("http://i7.caedes.net/resize/1600x1200/ekowalska-1131733199.jpg");
		GetFileThread gp4 = new GetFileThread("http://i7.caedes.net/resize/1024x768/kg4bet-1272262388.jpg");
		gp1.start();
		gp2.start();
		gp3.start();
		gp4.start();
	}

}
