package test;

import java.util.Scanner;

public class Duplicatechar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = sc.next();
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if (count > 1) {
				boolean printed = false;
				for (int k = 0; k < i; k++) {
					if (s.charAt(k) == s.charAt(i)) {
						printed = true;
						break;
					}
				}
				if (!printed) {
					System.out.print(s.charAt(i));
				}
			}
		}
	}
}