package Test;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RemoveSecondHighestFromHashMap {

	public static void main(String[] args) {
		Map<Integer, Integer> hm = new HashMap<>();
		hm.put(1, 22);
		hm.put(2, 44);
		hm.put(3, 55);
		hm.put(4, 66);
		hm.put(5, 99);
		RemoveSecondHighest(hm);

	}

	private static void RemoveSecondHighest(Map<Integer, Integer> hm) {

		int max = hm.get(1);
		int secondmax = -1;

		for (int val : hm.values()) {

			if (val > max) {
				secondmax = max;
				max = val;
			} else if (val != max && val > secondmax) {

				secondmax = val;
			}
		}
System.out.println(secondmax);
		Iterator<Map.Entry<Integer, Integer>> iterator = hm.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, Integer> entry = iterator.next();
			if (entry.getValue() == secondmax) {
				iterator.remove(); // Remove the entry from the iterator
			}

		}
		System.out.println(hm);
	}
}
