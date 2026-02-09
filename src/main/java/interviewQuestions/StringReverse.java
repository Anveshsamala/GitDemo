package interviewQuestions;

public class StringReverse {

	public static void main(String[] args) {

		// Using CharAT() method
		String s = "Anvesh";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println("");

		// Using ToCharArray() method
		String s1 = "SrinivasSwapna";
		char[] ch = s1.toCharArray();
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println("");

		// Using StringBuffer
		String s2 = "Rudvik";
		System.out.println(new StringBuffer(s2).reverse());

	}

}
