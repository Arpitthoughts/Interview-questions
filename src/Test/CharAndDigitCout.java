package Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CharAndDigitCout {

	public static void main(String[] args) {

String s="a56bc123d111111111111";

String result =s.chars() // Convert the string into an IntStream of characters
.distinct() // Remove duplicate characters
.mapToObj(c -> String.valueOf((char) c)) // Convert each int to a char and then to a String
.collect(Collectors.joining()); // Collect the result into a single string

StringBuilder str= new StringBuilder();
s.chars().distinct().forEach(c -> str.append((char) c));

System.out.println(str);

System.out.println(result);
		
		
	}

}
