package Test;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String s = "swiss";
	System.out.println(nonrepeatedcharacterchecker(s));
	}

	private static char nonrepeatedcharacterchecker(String s) {
		int count = 0;
		char[] str = s.toCharArray();

		for (int i = 0; i < str.length; i++) {
			count = 0;
			for (int j = 0; j < str.length; j++) {

				if (str[i] == str[j]) {
					count++;
				}

			}
			if(count==1) {
				return str[i];
			}

		}
		return (char) -1;
	}

}
