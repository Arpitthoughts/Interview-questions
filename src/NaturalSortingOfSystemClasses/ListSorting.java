package NaturalSortingOfSystemClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {

	public static void main(String[] args) {

		List<Integer> players = new ArrayList<>();
		players.add(1);
		players.add(5);
		players.add(4);
		players.add(8);
		players.add(2);

		/*
		 * players.add("Sachin"); players.add("Vijay"); players.add("Raja");
		 * players.add("Ajay"); players.add("Akhil");
		 */

		System.out.println(players);

		Collections.sort(players);

		System.out.println(players);

	}

}
