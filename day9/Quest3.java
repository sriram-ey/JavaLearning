package day9;

import java.util.*;

public class Quest3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a string: ");
		char[] letters = scanner.nextLine().toCharArray();
		System.out.print("Reverse string: ");
		for (int i = letters.length - 1; i >= 0; i--) {
			System.out.print(letters[i]);
		}
		System.out.print("\n");
		scanner.close();
	}
}
