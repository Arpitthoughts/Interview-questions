package Test;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorAndListIterator {

	public static void main(String[] args) {

		List<String> places = new ArrayList<>();
		places.add("Bangalore");
		places.add("Chennai");
		places.add("Rajasthan");
		places.add("Jaipur");
		System.out.println(places);
/*
		// Iterator supports only forward traversal from beginning to the end.
		Iterator<String> it = places.iterator();
		while (it.hasNext()) {
			String place = it.next();
			System.out.println(place);

			if (place.equals("Jaipur")) {
				it.remove();

			}

		}

		System.out.println(places);
		places.add("Jaipur");
		System.out.println(places); 
		*/

		// List Iterator
		//System.out.println("Backward iteration:");
/*		ListIterator<String> listiterator = places.listIterator(places.size());
		while (listiterator.hasPrevious()) {
			String place = listiterator.previous();
			System.out.println(place);
  
		}*/
		
		ListIterator<String> listiterator = places.listIterator(1);
		while(listiterator.hasNext()) {
			System.out.println(listiterator.next());
		}
		
		
	}

}
