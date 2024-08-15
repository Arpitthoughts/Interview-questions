package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListConversions {

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.asList(arr));
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(Arrays.asList(arr1));

		List<Integer> al = Arrays.stream(arr1).boxed().collect(Collectors.toList());
		System.out.println(al);

		// to retrieve elements > than 3
		Arrays.stream(arr1).filter(s -> s > 3).forEach(s -> System.out.println(s));

		// to get square of each element

		Arrays.stream(arr1).map(s -> s * s).filter(s -> s < 25).forEach(System.out::println);

		// find all even numbers using stream in an array
		
		System.out.println("-------------------------------------------------------------");
		Arrays.stream(arr1).filter(n -> (n%2==0)).forEach(System.out::print);

	}

}
