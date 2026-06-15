package string;
public class revstr {
	public static void main(String[] args) {
		String str = "education";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}