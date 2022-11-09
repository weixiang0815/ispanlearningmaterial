package ch10.util;

import java.io.*;

public class IOUtility {

	public static void closeStream(InputStream is) {
		if (is == null)
			return;
		try {
			is.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	public static void closeStream(OutputStream os) {
		if (os == null)
			return;
		try {
			os.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

	public static void closeStream(Reader r) {
		if (r == null)
			return;
		try {
			r.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return;
	}

	public static void closeStream(Writer w) {
		if (w == null)
			return;
		try {
			w.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return;
	}
}
