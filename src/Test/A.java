package Test;

import java.util.HashMap;
import java.util.Map;

public class A {

	public static void main(String[] args) {

		String str = "arjaria";
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		Integer count = 0;
		for (char s : str.toCharArray()) {
			count = hm.get(s);
			if (count == null) {
				hm.put(s, 1);
			} else {
				count=count+1;
				hm.put(s, count);
			}

		}
		System.out.println(hm);
	}
}
