package Test;

public class GetShortFormOfName {

	public static void main(String[] args) {
		String inputName = "Japneet Singh Sachdeva";
		// output =J.S.Sachdeva

		getShortName(inputName);

	}

	private static void getShortName(String inputName) {

		String[] words = inputName.split(" ");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < words.length; i++) {

			if (i == words.length - 1) {
				sb.append(" " + words[i]);
			} else {
				sb.append(words[i].charAt(0) + ".");
			}
		}
		System.out.println(sb);
	}

}
