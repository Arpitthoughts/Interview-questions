package Test;

public class pallindromechecker {

	public static void main(String[] args) {

		String input = "A man, a plan, a canal, Panama";

		System.out.println(checkPallindrome(input));
	}

	private static boolean checkPallindrome(String input) {

		String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println(cleanedInput);
		int left = 0, right = (cleanedInput.length() - 1);

		while (left < right) {

			if (cleanedInput.charAt(left) != cleanedInput.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;

	}
}
