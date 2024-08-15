package NaturalSortingOfSystemClasses;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSorting {

	public static void main(String[] args) {

		Set<String> players = new HashSet<>();
		players.add("Sachin");
		players.add("Vijay");
		players.add("Raja");
		players.add("Raja");
		players.add("Ajay");
		players.add("Akhil");
		
		System.out.println(players);
		
		Set<String> playersset=new TreeSet<>(players);		
		System.out.println(playersset);
		
		
		
		
		}

}
