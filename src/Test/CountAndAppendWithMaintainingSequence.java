package Test;

public class CountAndAppendWithMaintainingSequence {

	public static void main(String[] args) {

		String s = "aaaabcbcbcc";
		// output =a4b1c1b1c1b1c2
		int count = 1;
		StringBuilder result = new StringBuilder();

		for (int i = 1; i <= s.length() - 1; i++) {

			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				result.append(s.charAt(i - 1)).append(count);
				count = 1;
			}
		}

		result.append(s.charAt(s.length() - 1)).append(count);
		System.out.println(result);
		

	}

}