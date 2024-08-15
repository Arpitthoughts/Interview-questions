package Test;

public class WA1 {

	public static void main(String[] args) {

		String input = "Java application";
		// output=J@v@@ @@@pplic@@@@tion

		String result = "";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == 'a') {
				count++;
				for (int j = 0; j < count; j++) {
					result = result + '@';
				}
			} else {
				result = result + input.charAt(i);
			}

		}
		System.out.println(result);
	}

}
