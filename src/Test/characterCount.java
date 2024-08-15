package Test;

public class characterCount {

	public static void main(String[] args) {

		String a = "aaabbcc";
		String b = " aaaAAab^B&bbc$cC%ca*aDdDd@bB";
		method2(b);
		// output -> a6b4c4a2d4b2

	}

	private static void method1(String a) {
		int currentLength = 1;
		StringBuilder result = new StringBuilder(); // empty string

		for (int i = 1; i < a.length(); i++) {

			if (a.charAt(i) == a.charAt(i - 1)) {
				currentLength++;
			} else {
				result.append(a.charAt(i - 1)).append(currentLength);
				currentLength = 1;
			}
		}
		System.out.println(result.append(a.charAt(a.length() - 1)).append(currentLength));
	}

	private static void method2(String str) {

		String input = str.replaceAll("[^a-zA-Z]", "");
		method1(input.toLowerCase());

	}
}