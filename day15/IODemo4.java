package day15;

import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

public class IODemo4 {
	public static void main(String[] args) throws Exception {
		String s = "hello hello hello";
		PushbackInputStream pbs = new PushbackInputStream(new ByteArrayInputStream(s.getBytes()));
		int c = 0;
		while ((c = pbs.read()) != -1) {
			if ((char) c == 'h') {
				pbs.unread('H');
			} else {
				System.out.println((char) c);
			}
		}
	}
}
