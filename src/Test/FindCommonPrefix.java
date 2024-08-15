package Test;

import java.util.Arrays;

public class FindCommonPrefix {

	public static void main(String[] args) {

		String[] strArray = { "clumb", "cluster", "clue", "clutch", "club", "clumsy" };
		// String[] strArray = { "catu", "cat", "catfish", "caterpillar" };

		// Arrays.sort(strArray);
		// System.out.println(Arrays.toString(strArray));

		// String pref = method1tofindcommonprefix(strArray);
		String pref = method2tofindcommonprefix(strArray);

		System.out.println(pref);

	}

	private static String method2tofindcommonprefix(String[] str) {

		if (str == null || str.length == 0) {
			return ""; // No strings, no common prefix
		}

		// Start with the first string as the prefix
		String prefix = str[0];

		// Compare the prefix with each string in the array
		for (int i = 1; i < str.length; i++) {
			// Gradually reduce the prefix by comparing it with the current string
			while (str[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				// If prefix becomes empty, no common prefix exists
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}

		return prefix;
	}

	private static String method1tofindcommonprefix(String[] str) {

		StringBuffer pref = new StringBuffer();
		String first = str[0];
		for (int i = 0; i < first.length(); i++) {

			char currchar = first.charAt(i);

			for (int j = 1; j < str.length; j++) {

				if (i >= str[j].length() || str[j].charAt(i) != currchar) {
					return pref.toString();
				}
			}
			pref.append(currchar);

		}
		return pref.toString();

	}

}
