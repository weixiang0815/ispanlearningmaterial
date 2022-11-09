package ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientTest {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("127.0.0.1", 23456);
		System.out.println("Client: 與Server連線 OK...");

		int n = s.getLocalPort();
		System.out.println("Client, local port=" + n);
		
		InetSocketAddress sa = (InetSocketAddress)s.getRemoteSocketAddress();
		
		BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
br.readLine();

	}

}
