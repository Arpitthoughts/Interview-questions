package Test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AdjacentReverse {

	public static void main(String args[]) {

		String input = "I love my country";
methodUsingStreams(input);
		// Output string ="I olev ym ocnurty"
		StringBuilder result = new StringBuilder();
		String[] inputarr = input.split(" ");

		for (String s : inputarr) {

			if (s.length() == 1) {
				if (result.length() > 0) {
					result.append(" ");
				}
				result.append(s);
			} else {

				int first = 0, second = 1;
				char[] strarr = s.toCharArray();
				while (second < strarr.length) {

					char temp = strarr[second];
					strarr[second] = strarr[first];
					strarr[first] = temp;

					first += 2;
					second += 2;

				}

				if (result.length() > 0) {
					result.append(" ");
				}
				result.append(strarr);
			}
		}
		System.out.println(result);

		
		
		
	}

	private static void methodUsingStreams(String words) {
		String[] reversedWords = Arrays.stream(words.split(" "))
				 .map(word -> new StringBuilder(word).reverse().toString())
				 .toArray(String[]::new);


				 String reversedString = String.join(" ", reversedWords);
				 System.out.println(reversedString);
				 
		String result=		 Arrays.stream(words.split(" ")).map(s->new StringBuilder(s).reverse().toString()).collect(Collectors.joining(" "));
				 
		
	}
}