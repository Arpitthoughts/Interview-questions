package CustomSortingUsingComparator;

import java.util.Comparator;
import java.util.Map;

public class SortMapUsingComparator implements Comparator<Map.Entry<String,Integer>> {

	@Override
	public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
        return entry1.getValue().compareTo(entry2.getValue());

	}
	
	

}
