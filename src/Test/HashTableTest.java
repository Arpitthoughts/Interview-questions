package Test;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableTest {

	public static void main(String[] args) {

		Hashtable<String, Integer> table = new Hashtable<>(); // default capacity 11
		HashMap<String, Integer> map = new HashMap<>(); // default capacity 16

		System.out.println(map.put("one", 1));
		int val2 = map.put("one", 2);
		System.out.println(val2);
	}

}
