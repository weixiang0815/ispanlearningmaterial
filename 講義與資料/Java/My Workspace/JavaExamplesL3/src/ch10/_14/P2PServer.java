package ch10._14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class P2PServer {
	InputStream is = null;
	OutputStream os = null;
	ServerSocket ss = null;
	DataOutputStream dos = null;
	ObjectOutputStream oos = null;
	File sourceDir;

	public P2PServer(int portNo, File sourceDir) throws IOException {
		//建構一個ServerSocket物件，portNo為要傾聽的埠號
		ss = new ServerSocket(portNo);
		this.sourceDir = sourceDir;
		if (!sourceDir.exists()) {
			throw new FileNotFoundException("來源資料夾不存在...");
		}
		startServer();
	}

	private void startServer() throws IOException {
		System.out.println("Server: 等待Client的連線...");
		Socket s = ss.accept();
		System.out.println("Server: 已與Client連線...");
		is = s.getInputStream();
		os = s.getOutputStream();
		//建立程式需要的OutputStream物件
		dos = new DataOutputStream(os);
		oos = new ObjectOutputStream(os);
	}

	public void sendByte(int n) throws IOException {
		os.write(n);      // 寫一個位元組到Client端
		System.out.println("Server: 已傳送一個位元組:" + (byte) n);
	}

	public void sendMultiBytes(byte... b) throws IOException {
		//要寫多個資料到接收端時，一定要先告訴接收端要傳送的資料個數或位元組個數
		dos.writeLong(b.length);
		for (byte by : b) {
			dos.write(by);
		}
		System.out.println("Server: 已傳送" + b.length + "個位元組:  "
				+ Arrays.toString(b));
	}

	public void sendInteger(int n) throws IOException {
		dos.writeInt(n);
		System.out.println("Server: 已傳送一個整數:" + n);
	}

	public void sendMultiIntegers(int... b) throws IOException {
		dos.writeLong(b.length);
		for (int x : b) {
			dos.writeInt(x);
		}
		System.out.println("Server: 已傳送" + b.length + "個整數:  "
				+ Arrays.toString(b));
	}

	public void sendUTF(String msg) throws IOException {
		dos.writeUTF(msg);
	}

	public void sendMultiUTFs(String... strs) throws IOException {
		dos.writeLong(strs.length);
		for (String str : strs) {
			dos.writeUTF(str);
		}
		System.out.println("Server: 已傳送" + strs.length + "個字串:  "
				+ Arrays.toString(strs));
	}

	public void sendMultiObjects(Object... objs) throws IOException {
		oos.writeLong(objs.length);
		for (Object obj : objs) {
			oos.writeObject(obj);
		}
		System.out.println("Server: 已傳送" + objs.length + "個物件:  "
				+ Arrays.toString(objs));
	}

	public void sendFile(String filename) throws IOException {
		sendFileBeforeSkip(filename, 0);
		System.out.println("Server: 已傳送一個檔案:  " + filename);
	}

	public void sendFileBeforeSkip(String filename, long bytesSkip)
			throws IOException {
		FileInputStream fis = null;
		try {
			File realPath = new File(sourceDir, filename);
			fis = new FileInputStream(realPath);
			fis.skip(bytesSkip);
			//available：要送過去的位元組數
			long available = fis.available();
			//先告訴Client端：要送過去的位元組數
			dos.writeLong(available);			
			dos.flush();
			byte[] b = new byte[8192];
			int len = 0;
			// 開始傳送資料
			long total = 0 ;
			while ((len=fis.read(b)) != -1) {
				total += len;
				if (total > 11000000)
					break;
				os.write(b, 0, len);
			}
			System.out.println("Server:傳送的位元組數:" + total);
			os.flush();
		} finally {
			if (fis != null) {
				fis.close();
			}
		}
	}

	public void sendFileResume() throws IOException {
		DataInputStream dis = null;
		String filename = null;
		long bytesSkip = 0;
		dis = new DataInputStream(is);
		filename = dis.readUTF();
		System.out.println("Server: filename=" + filename);
		bytesSkip = dis.readLong();
		System.out.println("Server: bytesSkip=" + bytesSkip);
		sendFileBeforeSkip(filename, bytesSkip);
		System.out.println("Server: 已傳送一個檔案(續傳):  " + filename);
	}

	public void stop() {
		System.out.println("Server Stopped");
		if (is != null) {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (os != null) {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (ss != null) {
			try {
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
