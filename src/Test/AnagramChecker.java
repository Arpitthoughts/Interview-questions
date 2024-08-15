package Test;

import java.util.Arrays;

public class AnagramChecker {

	public static void main(String[] args) {

		String str1 = "silenT";
		String str2 = "Listen";
		System.out.println(checkAnagram(str1, str2));
	}

	private static boolean checkAnagram(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}
		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();

		Arrays.sort(arr1); Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);

	}

}
