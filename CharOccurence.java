package assign_w2_d2;

public class CharOccurence {

	public static void main(String[] args) {
		String str = "Test Leaf";

		char[] charArray = str.toCharArray();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (charArray[i] == 't') {
				count++;
			}

			System.out.println("Number of occurrences of character 't' " + " is " + count);
		}

	}
}
