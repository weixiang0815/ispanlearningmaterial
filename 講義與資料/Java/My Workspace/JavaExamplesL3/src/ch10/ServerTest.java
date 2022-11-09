package ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(23456);
		System.out.println("Server: 等待Client的連線...");
		Socket s = ss.accept();
		System.out.println("Server: 已與Client連線...");
		
		BufferedReader br = new BufferedReader(
             new InputStreamReader(System.in));
         br.readLine();
		int n = s.getLocalPort();
		System.out.println("Server, local port=" + n);
		
		br.readLine();

	}

}
