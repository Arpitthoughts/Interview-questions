package Test;

import java.util.ArrayList;
import java.util.List;

public class StringAndNumberSeparate {

	public static void main(String[] args) {

		String[] arr = { "mango", "1234", "banana", "5678" };
		List<String> al = new ArrayList<>();
		List<Integer> bl = new ArrayList<>();

		for (String a : arr) {

		
			if (a.matches("\\d+")) {
				bl.add(Integer.parseInt(a));

			} else {
				al.add(a);
			}
		}
		System.out.println(al);
		System.out.println(bl);
	}

}
