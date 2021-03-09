package day16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
	ServerSocket ss;
	Socket s;
	PrintWriter out;
	BufferedReader br, in;

	public Client() {
		try {
			while (true) {
				s = new Socket("localhost", 2000);
				br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				String msgFromServer = br.readLine();
				System.out.println("Message From Server...:" + msgFromServer);
				out = new PrintWriter(s.getOutputStream(), true);
				in = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("please enter a message for Server...:");
				String msg = in.readLine();
				out.println(msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Client();
	}
}
