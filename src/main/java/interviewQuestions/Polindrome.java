package interviewQuestions;

public class Polindrome {
	public static void main(String[] args) {
		// Given String is palindrome or not

		String str = "racecar";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println("its a palindrome");
		} else {
			System.out.println("its not a palindrome");
		}
	}

}
