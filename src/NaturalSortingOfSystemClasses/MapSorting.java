package NaturalSortingOfSystemClasses;

import java.util.Map;
import java.util.TreeMap;

public class MapSorting {

	public static void main(String[] args) {
		Map<String, Integer> players = new TreeMap<>();
		players.put("Sachin", 21);
		players.put("Vijay", 33);
		players.put("Raja", 44);
		players.put("Ajay", 38);
		players.put("Akhil", 25);

		System.out.println(players);
	}

}
