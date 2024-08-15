package CustomSortingUsingComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortingMapByValues {

	public static void main(String[] args) {
		Map<String, Integer> players = new HashMap<>();
		players.put("Sachin", 21);
		players.put("Vijay", 33);
		players.put("Raja", 44);
		players.put("Ajay", 38);
		players.put("Akhil", 20);

		System.out.println(players);

		Set<Map.Entry<String, Integer>>setofentries = players.entrySet();
		List<Map.Entry<String, Integer>> listofentries = new ArrayList<>(setofentries);

		Collections.sort(listofentries, new SortMapUsingComparator());
		System.out.println(listofentries);
	
		for(Entry<String,Integer>entry : listofentries) {
			System.out.println(entry.getKey() + " "+entry.getValue());
		}
	}

}
