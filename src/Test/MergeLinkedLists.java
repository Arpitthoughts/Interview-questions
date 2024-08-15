package Test;

import java.util.LinkedList;

public class MergeLinkedLists {
//L1->1, 2, 56, 13, 12, 
//L2->12, 56, 12, 16, 89, 27
//output: L3->1,12, 2, 56, 56, 12, 13, 16, 12, 89, 27	
	
	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(1);
		l1.add(2);
		l1.add(56);
		l1.add(13);
		l1.add(12);
	

		LinkedList<Integer> l2 = new LinkedList<>();
		l2.add(12);
		l2.add(56);
		l2.add(12);
		l2.add(16);
		l2.add(89);
		l2.add(27);

		LinkedList<Integer> mergedList = mergeLists(l1, l2);

		System.out.println("Merged List: " + mergedList);
	}

	public static LinkedList<Integer> mergeLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		LinkedList<Integer> mergedList = new LinkedList<>();

		int size = Math.max(l1.size(), l2.size());
		for (int i = 0; i < size; i++) {
			if (i < l1.size()) {
				mergedList.add(l1.get(i));
			}
			if (i < l2.size()) {
				mergedList.add(l2.get(i));
			}
		}

		return mergedList;
	}

}
