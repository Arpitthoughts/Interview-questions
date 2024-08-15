package Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		int arr[]= {2,5,2,6,6,7,9,10};
		usingSet(arr);
		usingMap(arr);
	}

	private static void usingMap(int[] arr) {

		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int value :arr) {
			
			if(hm.get(value)==null) {
				hm.put(value,1);
			}
			else {
				hm.put(value, hm.get(value)+1);
			}
		}

		
		Iterator<Entry<Integer,Integer>> iterator=hm.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Entry<Integer,Integer> entry=iterator.next();
		   if(entry.getValue()>1) {
			   System.out.println(entry.getKey());
		   }
		}
		
		
	}

	private static void usingSet(int[] arr) {

		
		Set<Integer> set= new HashSet<Integer>();
		
		for(int value : arr) {
			
			if(set.add(value)==false) {
				System.out.println(value+",");
			}
		}
		
	}

}
