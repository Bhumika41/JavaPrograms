package string;

import java.util.Scanner;

public class Validpalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = sc.nextLine();
		s = s.toLowerCase();
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				str += ch;
			}
		}
		int left = 0;
		int right = str.length() - 1;
		boolean a = true;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				a = false;
				break;
			}
			left++;
			right--;
		}
		System.out.println(a);
	}
}	