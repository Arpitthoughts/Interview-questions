package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWordsOfString {

	public static void main(String[] args) {

		String input = "How are you";
		// output="woH era uoy"
		String result = "";

		String input1[] = input.split(" ");

		for (String s : input1) {

			if (result.length() > 0) {
				result = result + " ";
			}
			for (int i = s.length() - 1; i >= 0; i--) {

				result = result + s.charAt(i);
			}

		}
		System.out.println(result);

		// using streams

		String output = Arrays.stream(input.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
		System.out.println(output);

	}

}
