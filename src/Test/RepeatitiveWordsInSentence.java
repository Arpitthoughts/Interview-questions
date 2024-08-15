package Test;

public class RepeatitiveWordsInSentence {

	public static void main(String[] args) {

		String str = "you are you doing good you are test test test";

		String[] sarr = str.split(" ");
		int[] counted = new int[sarr.length];
		int count = 0;
		for (int i = 0; i < sarr.length; i++) {
			count = 1;
			if (counted[i] != -1) {

				for (int j = i + 1; j < sarr.length; j++) {

					if (sarr[i].equals(sarr[j])) {
						count++;
						counted[j] = -1;
					}
				}

				if (count > 1) {
					System.out.println(sarr[i] + " "+count + " times");
				}
			}
		}

	}

}
