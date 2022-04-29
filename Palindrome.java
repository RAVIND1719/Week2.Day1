package assign_w2_d2;

public class Palindrome {

	public static void main(String[] args) {

		String str = "level";

		char[] str1 = str.toCharArray();

		String rev = "";

		for (int i = str1.length - 1; i >= 0; --i) {
			rev = rev + str.charAt(i);
		}

		if (str.equals(rev)) {
			System.out.println("The given string is a palindrome");
		} else {
			System.out.println("The given string is not a palindrome");
		}
	}
}
