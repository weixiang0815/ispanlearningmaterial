package ch10._13;

import java.io.*;
import java.net.*;

public class GetFileFromInternetThread {
	public static void main(String args[]) throws IOException {
		Foo f1 = new Foo(
				"http://i7.caedes.net/resize/827x551/egggray-1273973257.jpg");
		Foo f2 = new Foo(
				"http://i7.caedes.net/resize/811x539/biffobear-1273699023.jpg");
		Foo f3 = new Foo(
				"http://i7.caedes.net/resize/1600x1200/ekowalska-1131733199.jpg");
		Foo f4 = new Foo(
				"http://i7.caedes.net/resize/1024x768/kg4bet-1272262388.jpg");
		f3.setPriority(10);
		f1.start();
		f2.start();
		f3.start();
		f4.start();
	}
}

class Foo extends Thread {
	String sURL;

	Foo(String sURL) {
		this.sURL = sURL;
	}

	public void run() {
		try {
			String fileName = sURL.substring(sURL.lastIndexOf("/") + 1);
			URL aURL = new URL(sURL);
			FileOutputStream fos = new FileOutputStream(fileName);
			InputStream is = aURL.openStream();
			int total = 0, count = 0;
			byte[] ba = new byte[8192];
			while ((count = is.read(ba)) != -1) {
				fos.write(ba, 0, count);
				total += count;
				System.out.println(fileName + ": bytes read:" + total);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
